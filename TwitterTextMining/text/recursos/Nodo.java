
package recursos;


public class Nodo {
    private Object dato;
    private Nodo anterior, siguiente;
    
    public Nodo(Object obj){
        this(obj, null, null);
    }
    
    public Nodo(Object obj,Nodo previous,Nodo next){
        this.dato = obj;
        this.anterior = previous;
        this.siguiente = next;
    }

    public Object getDato() {
        return dato;
    }

    public void setDato(Object dato) {
        this.dato = dato;
    }

    public Nodo getAnterior() {
        return anterior;
    }

    public void setAnterior(Nodo anterior) {
        this.anterior = anterior;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }
    
}
