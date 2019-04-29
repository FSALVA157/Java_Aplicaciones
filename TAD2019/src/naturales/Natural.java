
package naturales;


public interface Natural {
    
    
    //PRECONDICION: el valor ingresado debe ser un entero mayor o igual a cero
    //POSTCONDICION: regresa un objeto del tipo natural con el valor dado por el usuario
    public Natural CreaNatural(int numero);
    
    //PRECONDICION: el numero natural que recibe la peticion debe haber sido creado con anterioridad
    //POSTCONDICION: regresa el valor del Natural que recibe la consulta
    public int GetValor();
    
    //PRECONDICION: el numero natural que recibe la peticion debe haber sido creado con anterioridad
    //POSTCONDICION: asigna el valor ingresado al Natural que recibe la peticion
    public void SetValor(int valor);

    
    //PRECONDICION: los naturales que seran Sumados y el natural que recibe el resultado deben haber sido creados con anterioridad
    //POSTCONDICION: asigna el resultado de la suma al Natural que recibe la peticion
    public void Suma(Natural a, Natural b);
    
    //PRECONDICION: los naturales que seran multiplicados y el natural que recibe el resultado deben haber sido creados con anterioridad
    //POSTCONDICION: asigna el resultado del producto al Natural que recibe la peticion
    public void Producto(Natural a, Natural b);
    
    //PRECONDICION: los naturales que seran restados y el natural que recibe el resultado deben haber sido creados con anterioridad
    //el natural a debe ser mayor o igual al natural b para que la operacion sea valida
    //POSTCONDICION: asigna el resultado de la resta al Natural que recibe la peticion
    public void Resta(Natural a, Natural b);
    
    //PRECONDICION: los naturales que seran divididos y el natural que recibe el resultado deben haber sido creados con anterioridad
    // el natural b debe ser distinto de cero
    //POSTCONDICION: asigna el cociente de la division al Natural que recibe la peticion
    public void Cociente(Natural a, Natural b);
    
    //PRECONDICION: los naturales que seran divididos y el natural que recibe el resultado deben haber sido creados con anterioridad
    // el natural b debe ser distinto de cero
    //POSTCONDICION: asigna el resto de la division al Natural que recibe la peticion
    public void Resto(Natural a, Natural b);
    
     //PRECONDICION: los naturales que seran divididos y el natural que recibe el resultado deben haber sido creados con anterioridad
     //POSTCONDICION: asigna la potencia de Natural a elevado al Natural b al valor del Natural que recibe la peticion
    public void Potencia(Natural a, Natural b);
    
     //PRECONDICION: los naturales que componen la radicacion y el natural que recibe el resultado deben haber sido creados con anterioridad
    //el resultado debe pertenecer a los naturales o la operacion no es valida
     //POSTCONDICION: asigna la potencia de Natural a elevado al Natural b al valor del Natural que recibe la peticion
    public void Raiz(Natural a, Natural b);
    
     //PRECONDICION: los naturales a,  b y el natural que recibe el resultado deben haber sido creados con anterioridad
     //POSTCONDICION: devuelve un valor booleando que indica si a y b son iguales o no
    public boolean Igual(Natural a, Natural b);
    
    
}
