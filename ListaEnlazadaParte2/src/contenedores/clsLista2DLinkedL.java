package contenedores;
import recursos.*;

// lista ordenada
public abstract class clsLista2DLinkedL extends clsLista0DLinkedL implements OperacionesCL4 {
	
	// insercion ordenada
	public void insertar(Object elemento){
		clsDoubleNode node;

		if (estaVacia()){
			this.frenteL=this.finalL=new clsDoubleNode(elemento);
			
		} else{
			if (esMenor(elemento,this.frenteL.getNodeInfo())){		
				this.frenteL=new clsDoubleNode(elemento, null, this.frenteL); // nuevo frente
				this.frenteL.getNextNode().setPrevNode(this.frenteL);// voy al 2do y conecto con el 1ero
				
			}else{
				
				if (esMayor(elemento,this.frenteL.getNodeInfo())){
					
				}else{				
					// al medio
					clsDoubleNode temp = this.frenteL;
					boolean flag=false;
					while (temp.getNextNode()!=null && !flag){
						if (esMayor(elemento,temp.getNextNode().getNodeInfo())){
							temp=temp.getNextNode();
						}else{
							flag=true;
						}
					}				
					
					// insercion al medio. entre temp y temp.next				
					node=new clsDoubleNode(elemento, temp, temp.getNextNode());
					temp.getNextNode().setPrevNode(node);
					temp.setNextNode(node);	
				}
			}
		}
		
		this.ultimo++; // incremento "ultima posicion" de lista
	}	
	
	public abstract boolean iguales(Object elemento1, Object elemento2);
	public abstract boolean esMenor(Object elemento1, Object elemento2);
	public abstract boolean esMayor(Object elemento1, Object elemento2);
	
	// hagan esto metodo por busqueda binaria
	public int buscar(Object elemento){
		// implementar!!!
		return -1;
	}
	
}
