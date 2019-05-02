
package pilaArray;

public interface Ipila {
    
    //PRECONDICION: la pila sobre la que se opera debe haber sido creada previamente
    //POSTCONDICION: establece la pila estado vacio
    public void limpiar();

    //PRECONDICION: la pila sobre la que se opera debe haber sido creada previamente
    //POSTCONDICION: devuelve un valor de verdad a la pregunta Esta Vacia?
    public boolean estaVacia();
    
    //PRECONDICION: la pila sobre la que se opera debe haber sido creada previamente
    //POSTCONDICION: devuelve un valor de verdad a la pregunta Esta Llena?
    public boolean estaLlena();
    
    
    //PRECONDICION: la pila sobre la que se opera debe haber sido creada previamente
    //para apilar la pila no debe estar llena
    //POSTCONDICION: devuelve la pila modificada 
    public void meter(Object elemento);
    
    //PRECONDICION: la pila sobre la que se opera debe haber sido creada previamente
    //para desapilar la pila no debe estar vacia
    //POSTCONDICION: devuelve la pila modificada 
    public Object sacar();
    
    
}
