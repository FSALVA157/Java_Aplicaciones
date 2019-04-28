
package vector;


public interface VectorInterface {
    
    //PRECONDICION: 
    //POSTCONDICION: devuelve el primer componente del vector
    public int getX();
    //PRECONDICION: 
    //POSTCONDICION: devuelve el segundo componente del vector
    public int getY();
    
    //PRECONDICION: los valores del par ordenado deben ser numeros enteros
    //POSTCONDICION: construye un vector en R2 con las coordenadas recibidas
    public Vector CrearVector(int x,int y);
    //PRECONDICION: la entrada consiste en dos elementos del tipo Vector
    //POSTCONDICION: Devuelve un vector que suma los valores de entrada
    public Vector SumaVectores(Vector v);
    //PRECONDICION: la entrada consiste en un vector y un escalar del tipo Real
    //POSTCONDICION: Devuelve un vector que representa el producto de las entradas
    public Vector ProductoPorUnEscalar(int k);
     //PRECONDICION: la entrada consiste en dos vectores
    //POSTCONDICION: Devuelve un numero real que es el producto de los vectores
    public double ProductoEscalar(Vector v);
    //PRECONDICION: la entrada consiste en un vector 
    //POSTCONDICION: Devuelve un numero real que es el vector de entrada elevado al cuadrado
    public double Modulo();
    
    
}
