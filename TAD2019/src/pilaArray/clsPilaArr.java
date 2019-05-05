
package pilaArray;


public class clsPilaArr implements Ipila{
    
    private Object[] pila;
    private int cabeza;
    private int tamPila;

    public clsPilaArr() {
    }
    
    
    
    public clsPilaArr(int tamano){
        this.tamPila = tamano;
        this.pila = new Object[tamano];
        this.limpiar();
    }
    
    public void incrementaCabeza(){
        this.cabeza++;
    }
    
    public void decrementaCabeza(){
        this.cabeza--;
    }
    
    public int getTamano(){
        return this.tamPila;
    } 
    

    @Override
    public void limpiar() {
        this.cabeza = -1;
    }

    @Override
    public boolean estaVacia() {
      return (this.cabeza == -1);
    }

    @Override
    public boolean estaLlena() {
        return (this.cabeza == this.tamPila - 1);
    }

    @Override
    public void meter(Object elemento) {
      if(!this.estaLlena()){
          this.incrementaCabeza();
          pila[this.cabeza] = elemento;
         }else{
          System.out.println("Error al apilar: La pila esta llena");
      }
    }

    @Override
    public Object sacar() {
        Object aux = null;
        if(!this.estaVacia()){
            aux =  pila[this.cabeza];
            this.decrementaCabeza();
        }else{
            System.out.println("Error al desapilar: la pila esta vacia");
        }
        return aux;
    }

    @Override
    public Object seek() {
        Object aux = pila[cabeza];
        return aux;
    }
    
    
    
}
