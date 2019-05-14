package testing;
import contenedores.*;
import recursos.*;

public class clsListaEnteros extends clsLista1DLinkedL{
	public boolean iguales(Object elementoL, Object elemento){
		if (((Integer)elementoL).intValue()==((Integer)elemento).intValue()){
			return true;
		}else {
			return false;
		}
	}
	
	public void muestra(){		
		clsDoubleNode temp;
		
		if (!estaVacia()){
			temp=this.frenteL; // el primero
			while (temp!=null){
								
				System.out.println(temp.getNodeInfo().toString());				
				temp=temp.getNextNode(); 
			}			
		}else{
			System.out.println("Error muestra. Lista vacia");
		}		
		
	}	
}
