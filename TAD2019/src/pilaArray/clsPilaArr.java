
package pilaArray;


public class clsPilaArr implements Ipila{
    
    private Object[] pila;
    private int cabeza;
    private int tamPila;
    
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
    
    public void reemplazar(clsPilaArr pila, int nuevo, int viejo){
        clsPilaArr pilaAux = new clsPilaArr(pila.tamPila);
        boolean bandera = true;
        while(bandera || !pila.estaVacia()){
            if((int)pila.seek() == viejo){
                pila.sacar();
                pila.meter(nuevo);
                bandera = false;
        
            }else{
                pilaAux.meter(pila.sacar());
            }
            
        }
        
        if(!bandera){
            System.out.println("SE HA EFECTUADO EL REEMPLAZO CON EXIT0");
        }else{
            System.out.println("EL ELEMENTO BUSCADO NO EXISTE EN LA PILA");
        }
                while(!pilaAux.estaVacia()){
                    pila.meter(pilaAux.sacar());
                }
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
