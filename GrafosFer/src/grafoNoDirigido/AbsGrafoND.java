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
		clsConnection conexion;
		clsGraphPriorityQueue colaP=new clsGraphPriorityQueue();
		clsIntegerSet conjuntoE = new clsIntegerSet();
		clsIntegerSet conjuntoU = new clsIntegerSet();

		clsListaDoubleLinkedL listaArbol = new clsListaDoubleLinkedL();
		
		for (int i=0;i<getOrden();i++){
			conjuntoE = new clsIntegerSet();
			conjuntoE.meter(i);
			listaArbol.insertar(conjuntoE, i);			
		}
		
		for (int i=0; i<getOrden();i++){
			for (int j=i+1;j<getOrden();j++){
				currCost=(double)this.matrizCosto.devolver(i, j);
				if (currCost!=infinito){
					colaP.meter(new clsConnection(i, j, currCost));
				}
			}
		}
		
		counter=getOrden();
		while (counter>1){
			conexion=(clsConnection)colaP.sacar();
			System.out.println("arista " + conexion.getVertexI() + " " + conexion.getVertexJ() + ":" + conexion.getConnectionCost());

			n=listaArbol.tamanio()-1;
			k=0; flag=false;
			posI=posJ=-1;
			while (k<=n && !flag){
				conjuntoE=(clsIntegerSet)listaArbol.devolver(k);
				System.out.println("mostrando conjunto parcial de vertices k=" + k);
				conjuntoE.muestra();
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
				conjuntoU = new clsIntegerSet();
				conjuntoU.union((clsIntegerSet)listaArbol.devolver(posI), (clsIntegerSet)listaArbol.devolver(posJ));
				listaArbol.reemplazar(conjuntoU, posI);
				listaArbol.eliminar(posJ);
				counter--;				
			}			
		}
	}
    
    
    
    @Override
    public void muestraKruskal() {
        Kruskal();
    }


}
