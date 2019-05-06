
package colaArray;


public class ColaTest1 extends ColaImpl{

    public ColaTest1(int tamano) {
        super(tamano);
    }
    
    //metodo de un ejercicio de practico viejo que desencola y devuelve un valor booleano vacia o no y la cola cambiada
    public void supCola(ColaTest1 cola, Object obj,boolean esVacia){
        if(cola.estaVacia()){
            esVacia = true;
            obj = null;
        }else{
            obj = cola.pop();
            esVacia = cola.estaVacia();
        }
    }
    
    
    
}
