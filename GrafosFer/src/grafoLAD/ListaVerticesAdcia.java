
package grafoLAD;

//lista de vertices de Adyacencia - vendria a ser el equivalente a la matriz de adyacencia


import grafoNoDirigido.ConjuntoAbs;

//lo hare heredar de un conjunto porque no puede tener vertices repetidos.
public abstract class ListaVerticesAdcia extends ConjuntoAbs{
    protected VerticeAdcia vertice;

    @Override
    public abstract boolean esIgual(Object obj1, Object obj2);

    @Override
    public abstract String imprime(Object obj);
    
    
}
