
package grafoNoDirigido;


public interface ICola {
    //PRECONDICION: La cola que recibe el pedido debe haber sido creada previamente
    //POSTCONDICION: Devuelve la cola modificada
    public void push(Object objeto);
    
    //PRECONDICION: La cola que recibe el pedido no debe estar vacia
    //POSTCONDICION: Devuelve el elemento que se encuentra al frente de la cola
    public Object pop();
    
    //PRECONDICION: La cola que recibe el pedido debe haber sido creada previamente
    //POSTCONDICION: Devuelve un valor logico verdadero o falso
    public boolean estaVacia();
    
    //PRECONDICION: La cola que recibe el pedido debe haber sido creada previamente
    //POSTCONDICION: Devuelve un valor logico verdadero o falso
    public boolean estaLlena();
    
    //PRECONDICION: La cola que recibe el pedido debe haber sido creada previamente
    //POSTCONDICION: Devuelve la cola modificada
    public void limpiar();
    
    //PRECONDICION: La cola que recibe el pedido debe haber sido creada previamente y no debe estar vacia
    //POSTCONDICION: Devuelve el objeto que se encuentra al frente de la cola sin modificar la misma
    public Object seek();
    
    
}
