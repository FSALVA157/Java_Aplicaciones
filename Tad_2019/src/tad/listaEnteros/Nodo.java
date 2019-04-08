//clase que crea el nodo entero
package tad.listaEnteros;


public class Nodo {
    int dato;
    Nodo enlace;
    
    //constructor
    public Nodo(int x){
        this.dato = x;
    }
    
    public Nodo(){
        
    }

    public int getDato() {
        return dato;
    }

    
    public Nodo getEnlace() {
        return enlace;
    }

    public void setEnlace(Nodo enlace) {
        this.enlace = enlace;
    }
    
   
    
}
