package contNoLinealesGrafosND;


public class clsListaDoubleLinkedL {
	private clsDoubleNode frenteL, finalL;
	private int ultimo, primero;
	
	public clsListaDoubleLinkedL(){
		limpiarLista();
	}
	
	public boolean estaVacia(){
		return (this.frenteL==null);
	}
	

	public void limpiarLista(){
		this.frenteL=this.finalL=null;
		this.ultimo=-1;
		this.primero=-1;
	}
	
	
	public int getTamLista(){
		int cant=0;
		if (!estaVacia()){
			cant=this.ultimo+1;
			this.primero=0;
		}
		return cant;
	}	
	
	
	public void inserta(Object objElemento, int posicion){
		clsDoubleNode node;
		if (posicion>getTamLista() || posicion<0){
			System.out.println("Error insercion. Posicion inexistente ");
		}else{
			if (posicion==0){ // insercion al comienzo
				if (!estaVacia()){
					this.frenteL=new clsDoubleNode(objElemento, null, this.frenteL);
					this.frenteL.getNextNode().setPrevNode(this.frenteL);
				}else{
					this.frenteL=this.finalL=new clsDoubleNode(objElemento);					
				}
			}else{
				if (posicion==getTamLista()){ // insercion al fin
					this.finalL = new clsDoubleNode(objElemento, this.finalL, null); // nuevo nodo fin
					this.finalL.getPrevNode().setNextNode(this.finalL); // reconexion penultimo nodo al nuevo fin
				}else{
					// insercion al medio					
					clsDoubleNode prev, next;
					prev=this.frenteL;
					next=this.frenteL.getNextNode();
					for (int counter=1; counter<posicion;counter++){
						prev=prev.getNextNode(); next=next.getNextNode();						
					}
					
					node = new clsDoubleNode(objElemento,prev,next);
					prev.setNextNode(node); // actualizo referencias
					next.setPrevNode(node);					
				}
			}			
			this.ultimo++;
		}		
	}	
	

	public void elimina(int posicion){		
		if (estaVacia()){
			System.out.println("Error elimina. Lista vacia...");
		}else{		
			if (posicion>getTamLista() || posicion<0){
				System.out.println("Error elimina. Posicion inexistente ");
			}else{				
				if (posicion==0){//elimina el frente 
					if (this.frenteL==this.finalL){
						limpiarLista();						
					}else{
						this.frenteL=this.frenteL.getNextNode();
						//this.frenteL.getNextNode().setPrevNode(null);
						this.frenteL.setPrevNode(null);
						this.ultimo--;
					}
				}else{
					if (posicion==getTamLista()-1){//elimina al último 
						this.finalL= this.finalL.getPrevNode();
						this.finalL.setNextNode(null);						
					}else{//elimina al medio						
						clsDoubleNode prev, next;
						prev=this.frenteL;
						next=this.frenteL.getNextNode();
						for (int counter=1; counter<posicion;counter++){
							prev=prev.getNextNode(); next=next.getNextNode();						
						}							
						
						next = next.getNextNode();
						prev.setNextNode(next); // actualizo referencias
						next.setPrevNode(prev);				    	
					}
					this.ultimo--;
				}				
			}
		}
	}	
	
	
	public Object devuelve(int posicion){
		Object objElemento=null;
		if (estaVacia()){
			System.out.println("Error devuelve. Lista vacia...");
		} else {
			if (posicion>=getTamLista() || posicion<0){
				System.out.println("Error devuelve. La posicion no existe..");
			}else{
				clsDoubleNode temp;
				temp=this.frenteL;
				
				for (int counter=0; counter<posicion;counter++){						
					temp=temp.getNextNode();		
				}				
				objElemento=temp.getNodeInfo();
			}						
		}	
		return objElemento;
	}		
	
	
	public void muestra(){
		clsDoubleNode temp;		
		if (!estaVacia()){
			temp=this.frenteL;
			while (temp!=null){
				System.out.println("Elemento " + temp.getNodeInfo().toString());
				temp=temp.getNextNode();
			}			
		}else{
			System.out.println("Error muestra. Lista vacia");
		}		
	}
	//Para actualizar la info en una posición determinada
	public void actualiza(Object objElemento, int posicion){
		
		if (estaVacia()){
			System.out.println("Error actualiza. Lista vacia...");
		} else {
			if (posicion>=getTamLista() || posicion<0){
				System.out.println("Error actualiza. La posicion no existe..");
			}else{
				clsDoubleNode temp;
				temp=this.frenteL;
				
				for (int counter=0; counter<posicion;counter++){						
					temp=temp.getNextNode();		
				}				
				temp.setNodeInfo(objElemento);
			}						
		}	
		
		
	}
		
	
	
}
