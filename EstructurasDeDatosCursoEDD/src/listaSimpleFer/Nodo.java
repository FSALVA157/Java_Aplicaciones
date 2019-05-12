
package listaSimpleFer;


public class Nodo {
    private Object dato;
    private Nodo siguiente;
    
    public Nodo(Object obj){
        this(obj,null);
    }
    
    public Nodo(Object obj,Nodo lazo){
        this.dato = obj;
        this.siguiente = lazo;
    }

    public Object getDato() {
        return dato;
    }

    public void setDato(Object dato) {
        this.dato = dato;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }
    
    
    
}
