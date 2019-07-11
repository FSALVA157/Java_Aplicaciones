
package recursos;


public interface IArbolBinario {
    public abstract boolean EstaVacio();
    public abstract void push(Object nodoDato);
    public abstract void pop(Object nodoDato);
    public abstract boolean esta(Object nodoDato);
    public abstract void limpiar();
    public NodoAB seek(Object dato);
    
    public abstract int cantNodos(NodoAB nodo);
    public abstract int cantHojas();
    public abstract int alturaArbol();
    public abstract int nivelNodo();
    
    public abstract void preOrder(NodoAB nodo);
    public abstract void inOrder(NodoAB nodo);
    public abstract void postOrder(NodoAB nodo);
    
}
