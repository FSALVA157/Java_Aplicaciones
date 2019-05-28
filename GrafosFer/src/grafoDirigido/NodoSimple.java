
package grafoDirigido;


public class NodoSimple {
private Object dato;
private NodoSimple next;

    public NodoSimple(Object dato) {
        this(dato, null);
    }

    public NodoSimple(Object dato, NodoSimple next) {
        this.dato = dato;
        this.next = next;
    }

    public Object getDato() {
        return dato;
    }

    public void setDato(Object dato) {
        this.dato = dato;
    }

    public NodoSimple getNext() {
        return next;
    }

    public void setNext(NodoSimple next) {
        this.next = next;
    }




}
