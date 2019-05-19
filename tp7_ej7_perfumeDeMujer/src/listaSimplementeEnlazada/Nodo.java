
package listaSimplementeEnlazada;


public class Nodo {
    protected int dato;
    protected Nodo siguiente;
    
    //constructor que se usa para agregar al final de la lista
    public Nodo(int d){
        this(d,null);
    }
    
    //constructor que se usa para agregar en la cabeza de la lista
     public Nodo(int d, Nodo p){
        this.dato = d;
        this.siguiente = p;
    }
     
     
}
