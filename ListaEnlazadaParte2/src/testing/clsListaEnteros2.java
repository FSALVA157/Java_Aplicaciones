package testing;
import contenedores.*;
import recursos.*;

// lista ordenada de enteros
public class clsListaEnteros2 extends clsLista2DLinkedL{
	public boolean iguales(Object elemento1, Object elemento2){
		if (((Integer)elemento1).intValue()==((Integer)elemento2).intValue()){
			return true;
		}else {
			return false;
		}
	}
	
	public boolean esMenor(Object elemento1, Object elemento2){
		if (((Integer)elemento1).intValue()<((Integer)elemento2).intValue()){
			return true;
		}else {
			return false;
		}
	}
	
	public boolean esMayor(Object elemento1, Object elemento2){
		if (((Integer)elemento1).intValue()>((Integer)elemento2).intValue()){
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
