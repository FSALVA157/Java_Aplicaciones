
package recursos;


public interface IListaDoble {
    //public void meter(Object elemento,int posicion);
    
    public void limpiar();
    public boolean estaVacia();
    public Object seek(int posicion);
    public int buscar(Object obj);
    public int tamanio();
}
