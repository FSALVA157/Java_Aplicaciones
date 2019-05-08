
package colaDinamica;

import recursos.*;
public class Cola implements IContenedor{
    Nodo inicio;
    Nodo fin;
   /* 
    public Cola(Object elemento){
        inicio = fin = new Nodo(elemento);
    }
    */
    public Cola(){
        this.limpiar();
    }

    @Override
    public void meter(Object elemento) {
        if(this.estaVacia()){
            inicio = fin = new Nodo(elemento);
        }else{
            this.fin.setSiguiente(new Nodo(elemento));
            this.fin = fin.getSiguiente();
        }
        
    }

    @Override
    public Object sacar() {
        Object auxiliar = null;
      if(!this.estaVacia()){
            auxiliar = this.inicio.getDato();
            inicio = inicio.getSiguiente();
            //pequeña porcion del codigo que verifica si la cola no tenia un solo elemento
            if(this.estaVacia()){
                this.fin = null;
            }
      }else{
          System.out.println("ERROR AL SACAR: LA COLA ESTA VACIA");
      }
      return auxiliar;
    }

    @Override
    public void limpiar() {
        inicio = fin = null;
    }

    @Override
    public boolean estaVacia() {
        return(this.inicio == null);
    }
    
}
