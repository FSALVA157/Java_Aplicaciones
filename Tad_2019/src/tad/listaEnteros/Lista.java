//clase lista que contiene a los nodos enteros
package tad.listaEnteros;


public class Lista {//inicio clase principal
    
    protected Nodo primero;
    
    //constructor
    public Lista(){
        primero = null;
    }
    
    //metodo que inserta nodo por la cabeza
    public Lista insertarCabezaLista(int entrada){
        Nodo nuevo = new Nodo(entrada);
        nuevo.setEnlace(primero);
        primero = nuevo;
        return this;
    }
    
    public Lista insertarFinalLista(Nodo ultimo,int entrada){
        ultimo.enlace = new Nodo(entrada);
        ultimo = ultimo.enlace;
        return this;
        
    }
    
    
    
    public void visualizar (){
        Nodo nodo;
        int k = 0;
        nodo = primero;
        
        while(nodo != null){
            System.out.print(nodo.getDato() + "");
            nodo = nodo.getEnlace();
            k++;
            System.out.print((k%15!=0?" ":"\n"));
        }
    }
    
}//fin clase principal


