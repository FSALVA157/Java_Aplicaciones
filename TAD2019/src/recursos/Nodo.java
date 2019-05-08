
package recursos;


public class Nodo {
    private Object dato;
    private Nodo siguiente;

    //constructor con nodo siguiente nulo
    public Nodo(Object dato) {
        this.dato = dato;
        this.siguiente = null;
    }
    
    //constructor con nodo siguiente segun dato
    public Nodo(Object dato, Nodo referencia) {
        this.dato = dato;
        this.siguiente = referencia;
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
