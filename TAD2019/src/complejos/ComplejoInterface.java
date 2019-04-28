
package complejos;


public interface ComplejoInterface {
    //Pre-condición: parte real e imaginaria deben ser de tipo real en pto. flotante con doble precisión.
//Post-condición: crea un complejo con los valores pasados por parámetro. El objetivo es reservar los recursos
//necesarios e inicializar con los valores pasados por parámetro.
    //public ComplejoInterface CreaComplejoInterface(double r, double i);
    
    //Pre-condición: el complejo debe haber sido creado con anterioridad.
    //Post-condición: devuelve la parte real del número complejo.
    public double GetReal();
    
    //Pre-condición: el complejo debe haber sido creado con anterioridad.
    //Post-condición: devuelve la parte imaginaria del número complejo.
    public double GetImaginaria();
    
    //Pre-condición: el complejo debe haber sido creado con anterioridad, r debe ser real en pto. flotante con doble
    //precisión.
    //Post-condición: asigna el valor r a la parte real del complejo.
    public void SetReal(double r);
    
    //Pre-condición: el complejo debe haber sido creado con anterioridad, i debe ser real en pto. flotante con doble
    //precisión.
    //Post-condición: asigna el valor r a la parte imaginaria del complejo.
    public void SetImaginaria(double i);
    
    //Pre-condición: los complejos a y b, como quien recibe el mensaje deben haber sido creados con anterioridad.
    //Post-condición: realiza la suma de los complejos a y b. El resultado se asigna al complejo que recibe el mensaje.
    public void suma(Complejo a, Complejo b);
    
    //Pre-condición: los complejos a y b, como quien recibe el mensaje deben haber sido creados con anterioridad.
    //Post-condición: realiza la resta de los complejos a y b. El resultado se asigna al complejo que recibe el mensaje.
    public void resta(Complejo a, Complejo b);
    
    //Pre-condición: los complejos a y b, como quien recibe el mensaje deben haber sido creados con anterioridad.
    //Post-condición: realiza el productod de los complejos a y b. El resultado se asigna al complejo que recibe el mensaje.
    public void multiplica(Complejo a, Complejo b);
    
    //Pre-condición: los complejos a y b, como quien recibe el mensaje deben haber sido creados con anterioridad, el complejo b no puede ser el nulo (0 + 0i).
    //Post-condición: realiza la división entre los complejos a y b. El resultado se asigna al complejo que recibe el mensaje.
    public void divide(Complejo a, Complejo b);
    
    //Pre-condición: el complejo a y el que recibe el mensaje deben haber sido creados con anterioridad.
    //Post-condición: obtiene el conjugado del complejo a y lo asigna al complejo que recibe el mensaje.
    public void conjugado(Complejo a);
    
    //Pre-condición: el número complejo que recibe el mensaje debe haber sido creado previamente.
    //Post-condición: devuelve el valor del módulo del complejo que recibe el mensaje.  
    public double modulo();

    
    
    
    
    
    
           
    
    
    
    
    
    
}
