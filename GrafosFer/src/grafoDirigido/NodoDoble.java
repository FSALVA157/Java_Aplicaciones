
package grafoDirigido;


public class NodoDoble {
    private Object dato;
    private NodoDoble next;
    private NodoDoble prev;
    
    //constructores

    public NodoDoble(Object obj) {
        this(obj, null, null);
    }

    public NodoDoble(Object dato, NodoDoble prev, NodoDoble next) {
        this.dato = dato;
        this.next = next;
        this.prev = prev;
    }
    
     public NodoDoble(Object obj,NodoDoble next) {
        this(obj, null,next);
    }
     
     //metodos

    public Object getDato() {
        return dato;
    }

    public void setDato(Object dato) {
        this.dato = dato;
    }

    public NodoDoble getNext() {
        return next;
    }

    public void setNext(NodoDoble next) {
        this.next = next;
    }

    public NodoDoble getPrev() {
        return prev;
    }

    public void setPrev(NodoDoble prev) {
        this.prev = prev;
    }
     
    
    
}
