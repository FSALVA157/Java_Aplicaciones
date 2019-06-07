package contNoLinealesGrafosND;

import contNoLinealesGrafosD.clsListaDoubleLinkedL;

public abstract class clsAbsGrafoND implements TADGrafoND, TADGrafoD{

	protected clsMatrizGrafo matrizCosto;
	protected int ordenGrafo;
	
	static protected double infinito=10000.0;	
	protected clsListaDoubleLinkedL listaSolucion, listaCamino, listaDistancia;
	
	
	public clsAbsGrafoND(int ordenGrafo){
		this.ordenGrafo=ordenGrafo;
		this.matrizCosto=new clsMatrizGrafo(this.ordenGrafo);
	}
		
	public int getOrden(){ return this.ordenGrafo; }
		
	public abstract void cargaGrafo();
	
	
	private void Prim(int vertex){
		clsListaDoubleLinkedL listaMenorCosto, listaMasCercano;
		listaMenorCosto = new clsListaDoubleLinkedL();
		listaMasCercano = new clsListaDoubleLinkedL();
		double minCost, currCost, newCost; int minVertex, w;
		
		for (int i=0;i<getOrden();i++){
			listaMenorCosto.inserta(this.matrizCosto.devuelve(vertex, i), i);
			listaMasCercano.inserta(vertex, i);
		}
		
		for (int i=1;i<getOrden();i++){
			minCost=infinito;
			minVertex=-1;
			
			for (int j=0;j<getOrden();j++){
				if (j!=vertex){
					currCost=(double)listaMenorCosto.devuelve(j);
					if (currCost<minCost){
						minCost=currCost;
						minVertex=j;
					}
				}
			}
			
			System.out.println("la arista " + listaMasCercano.devuelve(minVertex) + " " + minVertex);
			listaMenorCosto.actualiza(infinito, minVertex);
			listaMasCercano.actualiza(-1,minVertex);

			
			for (int j=0;j<getOrden();j++){
				if (j!=minVertex){
					currCost=(double)listaMenorCosto.devuelve(j);
					newCost=(double)this.matrizCosto.devuelve(minVertex, j);
					w=(int)listaMasCercano.devuelve(j);
					if (newCost<currCost && w>-1){
						listaMenorCosto.actualiza(newCost, j);
						listaMasCercano.actualiza(minVertex, j);
					}
				}
			}			
		}		
	}
	
	public void muestraPrim(int vertex){
		if (vertex>=0 && vertex<getOrden()){
			Prim(vertex);
		}
	}
	
		
	private void bpf(clsListaDoubleLinkedL listaMarca, int v){
		boolean marcado;
		double currCost;
		
		listaMarca.actualiza(true, v);
		System.out.println("vertice "+ v);
		for (int w=0;w<getOrden();w++){
			marcado=(boolean)listaMarca.devuelve(w);
			currCost=(double)this.matrizCosto.devuelve(v,w);
			if (currCost!=infinito && !marcado){
				bpf(listaMarca,w);
			}
		}
	}
	
	public void muestraBPF(){
		clsListaDoubleLinkedL listaMarca;
		boolean marcado;
		
		listaMarca = new clsListaDoubleLinkedL();
		for (int v=0;v<getOrden();v++){
			listaMarca.inserta(false, v);
		}
		
		for (int v=0;v<getOrden();v++){
			marcado=(boolean)listaMarca.devuelve(v);
			if (!marcado){
				bpf(listaMarca,v);
			}
		}		
	}

	
	private void bea(clsListaDoubleLinkedL listaMarca, int v){
		boolean marcado;
		double currCost;
		clsColaLinkedList cola;
		int w;
		
		listaMarca.actualiza(true, v);
		System.out.println("vertice "+ v);
		cola = new clsColaLinkedList();
		cola.meter(v);
		
		while (!cola.colaVacia()){
			w=(int)cola.sacar();
			for (int z=0;z<getOrden();z++){
				marcado=(boolean)listaMarca.devuelve(z);
				currCost=(double)this.matrizCosto.devuelve(w,z);
				if (currCost!=infinito && !marcado){
					listaMarca.actualiza(true, z);
					cola.meter(z);
					System.out.println("arista visitada " + w + " - " + z);
				}		
			}
		}
	}
	

	public void muestraBEA(){
		clsListaDoubleLinkedL listaMarca;
		boolean marcado;
		
		listaMarca = new clsListaDoubleLinkedL();
		for (int v=0;v<getOrden();v++){
			listaMarca.inserta(false, v);
		}
		
		for (int v=0;v<getOrden();v++){
			marcado=(boolean)listaMarca.devuelve(v);
			if (!marcado){
				bea(listaMarca,v);
			}
		}		
	}
	
	
	
	
	public void muestraKruskal(){
		//implementar!!
	}
	
	
	public void muestraGrafo(){
		double currCost;
		for (int i=0; i<getOrden();i++){
			for (int j=i+1; j<getOrden();j++){				
				currCost=(double)this.matrizCosto.devuelve(i, j);
				if (currCost!=infinito){
					System.out.println("costo " + i + " a " + j + "->" + currCost);
				}								
			}			
		}		
	}
	
	public void muestraDijkstra(int startVertex){
		double currCost; int w;
		
		Dijkstra(startVertex);
		
		for (int v=0; v<getOrden();v++){
			System.out.println("vertice " + v);
			if (v!=startVertex){
				currCost=(double)this.listaDistancia.devuelve(v);
				System.out.println("costo desde " + startVertex + " a " + v + "->" + currCost);
			
				System.out.println("mostrando un camino desde "+ v + " a " + startVertex);
				
				w=(int)this.listaCamino.devuelve(v);
				
				do{
					System.out.println("camino " + w);
					w=(int)this.listaCamino.devuelve(w);
				}while(w!=-1);//recordemos que al inicializar cambiamos todos los -1 salvo el startVertex
			}			
		}
		
	}
	
	private void Dijkstra(int startVertex){
		double minCost, currCost, arcCost; int minVertex, vertex;
		
		this.listaDistancia = new clsListaDoubleLinkedL();
		this.listaCamino = new clsListaDoubleLinkedL();
		this.listaSolucion = new clsListaDoubleLinkedL();
		
		for (int i=0; i<getOrden();i++){			
			this.listaSolucion.inserta(-1, i);
			this.listaCamino.inserta(-1, i);
			this.listaDistancia.inserta(infinito, i);
		}
		this.listaSolucion.actualiza(startVertex,0); // el primer vertice del camino
		
		for (int i=0; i<getOrden();i++){
			if (i!=startVertex){
				this.listaDistancia.actualiza(this.matrizCosto.devuelve(startVertex, i), i);
				this.listaCamino.actualiza(startVertex, i);					
			}
		}
				
		
		for (int i=1; i<getOrden();i++){
			minCost=infinito;
			minVertex=-1;
			
			for (int w=0; w<getOrden();w++){
				if (w!=startVertex){
					currCost=(double) this.listaDistancia.devuelve(w);// 
					vertex=(int) this.listaSolucion.devuelve(w);
					if (currCost<minCost && vertex==-1){
						minCost=currCost; minVertex=w;
					}
				}
			}
			
			
			System.out.println("it " + i + " minVertex " + minVertex + " minCost " + minCost);
			
			
			this.listaSolucion.actualiza(minVertex, minVertex);
			this.listaDistancia.actualiza(minCost, minVertex);
				
			
			for (int v=0;v<getOrden();v++){
				vertex=(int)this.listaSolucion.devuelve(v);
				if (vertex==-1){
					arcCost=(double)this.matrizCosto.devuelve(minVertex, v);
					currCost=(double)this.listaDistancia.devuelve(v);
					if (minCost+arcCost<currCost){
						this.listaDistancia.actualiza(minCost+arcCost, v);
						this.listaCamino.actualiza(minVertex, v);
											
					}					
				}
			}			
		}		
	}

	
	public void muestraFloyd(){
		//implementar!!!
	}
	
	public void muestraCaminoFloyd(int i, int j){
		//implementar!!!
	}
	

}
