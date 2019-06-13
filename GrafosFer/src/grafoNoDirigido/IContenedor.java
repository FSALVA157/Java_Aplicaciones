
package grafoNoDirigido;


public interface IContenedor {

// PRECONDICION: la pila dinamica que haber sido creada con anterioridad
// POSTCONDICION: Devuelve la pila con el nuevo elemento
public void meter(Object elemento);

// PRECONDICION: la pila dinamica debe haber sido creada con anterioridad y no estar vacia
// POSTCONDICION: Devuelve la pila sin el elemento de tope
public Object sacar();

// PRECONDICION: la pila dinamica debe haber sido creada con anterioridad y no estar vacia
// POSTCONDICION: Devuelve la pila sin elementos
public void limpiar();

// PRECONDICION: la pila dinamica debe haber sido creada con anterioridad
// POSTCONDICION: Devuelve un valor de verdad que señala si la pila esta vacia o no
public boolean estaVacia();    
}
