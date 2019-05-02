
package listaSimplementeEnlazada;


public class Lista {
    protected Nodo inicio, fin;
    
    //constructor de la lista
    public Lista(){
        inicio = null;
        fin = null;
    }
    
    //metodo insertar al inicio
    public void insertarAlInicio(int dato){
        inicio = new Nodo(dato,inicio);
        if(fin == null){
            fin = inicio;
        }
    }
    
    //metodo que inserta al final
    public void insertarAlFinal(int dato){
        fin = new Nodo(dato);
        
    }
    
    public void mostrarLista(){
        Nodo aux = this.inicio;
        while(aux != null){
            System.out.print("[" + aux.dato + "]----->");
            aux = aux.siguiente;
        }
    }
    
}
