package grafoNoDirigido;

import grafoDirigido.*;


public abstract class AbsGrafoND implements TADGrafoND {

    protected int ordenGrafo;
    protected MatrizGrafo matrizCosto, matrizCostoF, matrizCaminoF;
    static final double infinito = 10000.0;
    protected ListaDoble listaSolucion, listaCamino, listaDistancia;

    ;
    
    public AbsGrafoND(int ordenGrafo) {
        this.ordenGrafo = ordenGrafo;
        this.matrizCosto = new MatrizGrafo(this.ordenGrafo);
    }

    
    public abstract void cargaGrafo();

    
    public int getOrden() {
        return this.ordenGrafo;
    }

    public void prim(int vertex){
        ListaDoble listaMenorCosto = new ListaDoble();
        ListaDoble listaMasCercano = new ListaDoble();
		double minCost, currCost, newCost;
                int minVertex, w;
		
		for (int i=0;i<getOrden();i++){
			listaMenorCosto.meter(this.matrizCosto.seek(vertex, i), i);
			listaMasCercano.meter(vertex, i);
		}
		
		for (int i=1;i<getOrden();i++){
			minCost=infinito;
			minVertex=-1;
			
			for (int j=0;j<getOrden();j++){
				if (j!=vertex){
					currCost=(double)listaMenorCosto.seek(j);
					if (currCost<minCost){
						minCost=currCost;
						minVertex=j;
					}
				}
			}
			
			System.out.println("la arista " + listaMasCercano.seek(minVertex) + " " + minVertex);
			listaMenorCosto.actualiza(infinito, minVertex);
			listaMasCercano.actualiza(-1,minVertex);

			
			for (int j=0;j<getOrden();j++){
				if (j!=minVertex){
					currCost=(double)listaMenorCosto.seek(j);
					newCost=(double)this.matrizCosto.seek(minVertex, j);
					w=(int)listaMasCercano.seek(j);
					if (newCost<currCost && w>-1){
						listaMenorCosto.actualiza(newCost, j);
						listaMasCercano.actualiza(minVertex, j);
					}
				}
			}			
		}		

    }
    @Override
    public void muestraPRIM(int vertex) {
        if (vertex>=0 && vertex<getOrden()){
			prim(vertex);
		}
    }

    
    private void Kruskal(){
		double currCost; int counter; int n,k, posI, posJ; boolean flag;
		Conexion conexion;
		ColaPrioridadConexiones colaP = new ColaPrioridadConexiones();
		ConjuntoInt conjuntoE;// = new ConjuntoInt();
		ConjuntoInt conjuntoU;// = new ConjuntoInt();

		ListaDoble listaArbol = new ListaDoble();
		
		for (int i=0;i<getOrden();i++){
			conjuntoE = new ConjuntoInt();
			conjuntoE.meter(i);
			listaArbol.meter(conjuntoE, i);			
		}
		
		for (int i=0; i<getOrden();i++){
			for (int j=i+1;j<getOrden();j++){
				currCost=(double)this.matrizCosto.seek(i, j);
				if (currCost!=infinito){
					colaP.meterConPrioridad(new Conexion(i, j, currCost));
				}
			}
		}
		
		counter=getOrden();
		while (counter>1){
			conexion=(Conexion)colaP.sacar();
			System.out.println("arista " + conexion.getVertexI() + " " + conexion.getVertexJ() + ":" + conexion.getConnectionCost());

			n=listaArbol.getTamanio()-1;
			k=0; flag=false;
			posI=posJ=-1;
			while (k<=n && !flag){
				conjuntoE=(ConjuntoInt)listaArbol.seek(k);
				System.out.println("mostrando conjunto parcial de vertices k=" + k);
				conjuntoE.mostrar();
				if (conjuntoE.pertenece(conexion.getVertexI())){
					posI=k;
				}
	
				if (conjuntoE.pertenece(conexion.getVertexJ())){
					posJ=k;
				}
				if (posI>0 && posJ>0 && posI==posJ){
					flag=true;
				}else{
					k++;
				}
			}
			
			if (!flag){
				System.out.println("Arbol Minimo, Arista " + conexion.getVertexI() + " " + conexion.getVertexJ());
				conjuntoU = new ConjuntoInt();
				conjuntoU.union((ConjuntoInt)listaArbol.seek(posI), (ConjuntoInt)listaArbol.seek(posJ));
				listaArbol.actualiza(conjuntoU, posI);
				listaArbol.sacar(posJ);
				counter--;				
			}			
		}
	}
    
    
    
    @Override
    public void muestraKruskal() {
        Kruskal();
    }



}
