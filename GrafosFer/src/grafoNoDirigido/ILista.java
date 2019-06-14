
package grafoNoDirigido;


public interface ILista {
    public void meter(Object elemento,int posicion);
    public void sacar(int posicion);
    public void limpiar();
    public boolean estaVacia();
    public Object seek(int posicion);
    public int buscar(Object obj);
    public void reemplazar(Object nuevo,int posicion);
    public int tamanio();
    
}
