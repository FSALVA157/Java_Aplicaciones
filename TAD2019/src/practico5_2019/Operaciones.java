
package practico5_2019;


public interface Operaciones {
    //PRECONDICION: los objetos que seran Sumados y el objeto que recibe el resultado deben haber sido creados con anterioridad
    //POSTCONDICION: asigna el resultado de la suma al objeto que recibe la peticion
    public void suma(Object a, Object b);
    
    //PRECONDICION: los objetos que seran restados y el objeto que recibe el resultado deben haber sido creados con anterioridad
    //POSTCONDICION: asigna el resultado de la resta al objeto que recibe la peticion
    public void resta(Object a, Object b);
    
    //PRECONDICION: los objetos que seran multiplicados y el objeto que recibe el resultado deben haber sido creados con anterioridad
    //POSTCONDICION: asigna el resultado del producto al objeto que recibe la peticion
    public void multiplicacion(Object a, Object b);
    
    //PRECONDICION: los objetos que componen la potenciay el objeto que recibe el resultado deben haber sido creados con anterioridad
    //POSTCONDICION: asigna el resultado de la potencia al objeto que recibe la peticion
    public void potencia(Object base, Object exponente);
    
    //PRECONDICION: los objetos que seran comparados y el objeto que recibe el resultado deben haber sido creados con anterioridad
    //POSTCONDICION: devuelve un valor de verdad respecto de la igualdad de los objetos parametros.
    public boolean igualdad(Object a, Object b);
}
