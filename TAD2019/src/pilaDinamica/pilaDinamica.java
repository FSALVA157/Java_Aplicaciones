
package pilaDinamica;

import recursos.*;


public class pilaDinamica implements IContenedor {
    private Nodo tope;
    
    public pilaDinamica(){
        this.limpiar();
    }

    @Override
    public void meter(Object elemento) {
        this.tope = new Nodo(elemento,this.tope);
    }

    @Override
    public Object sacar() {
        Object auxiliar = null;
        if(!estaVacia()){
            auxiliar = tope.getDato();
            tope = tope.getSiguiente();
        }else{
            System.out.println("ERROR AL SACAR: LA PILA ESTA VACIA");
        }
        return auxiliar;
    }

    @Override
    public void limpiar() {
     this.tope = null;
    }

    @Override
    public boolean estaVacia() {
        return (tope == null);
    }
    
    public void muestra(){
        if(!estaVacia()){
            pilaDinamica pilaAuxiliar = new pilaDinamica();
            Object datoAux = null;
            while(this.tope != null){
                datoAux = tope.getDato();
                pilaAuxiliar.meter(datoAux);
                System.out.print("[" + datoAux.toString() + "]---->");   
                tope = tope.getSiguiente();
            
            }
            while(pilaAuxiliar.tope != null){
                this.meter(pilaAuxiliar.sacar());
            }
        }else{
            System.out.println("NADA QUE MOSTRAR: LA PILA ESTA VACIA");
        }
        
    }
    
}
