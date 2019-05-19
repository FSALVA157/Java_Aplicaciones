
package listaSimplementeEnlazada;


public class Lista {
    protected Nodo inicio, fin;
    
    //constructor de la lista
    public Lista(){
        inicio = null;
        fin = null;
    }
    
    //metodo insertar al inicio
    public void insertarAlInicio(int dato){
        inicio = new Nodo(dato,inicio);
        if(fin == null){
            fin = inicio;
        }
    }
    
    //metodo que inserta al final
    public void insertarAlFinal(int dato){
        if(!this.estaVacia()){
            this.fin = new Nodo(dato,null);
        }else{
            inicio = fin = new Nodo(dato,null);
        }
        
    }
    
    //este metodo eliminar retorna el dato eliminado
    public int eliminarDelInicio(){
        int auxiliar = inicio.dato;
        if(inicio == fin){
            inicio = fin = null;
        }else{
            inicio = inicio.siguiente;
        }
        return auxiliar;
    }
    
    public int eliminarDelFinal(){
        int auxiliar = this.fin.dato;
        if(inicio == fin){
            this.inicio = this.fin = null;
        }else{
        
        Nodo temporal = this.inicio;
        while(temporal.siguiente != this.fin){
            temporal = temporal.siguiente;
        }
        fin = temporal;
        fin.siguiente = null;
        }
        
        return auxiliar;
    }
    
    public void eliminarNodoX(int objetivo){
        if(!this.estaVacia()){
            if((inicio == fin)&&(inicio.dato == objetivo)){
                inicio = fin = null;
            }else if(this.inicio.dato == objetivo){
                this.eliminarDelInicio();
            }else{
                Nodo anterior = inicio;
                Nodo temporal = inicio.siguiente;
                boolean bandera = true;
                while((temporal.siguiente != null)&&(bandera)){
                    if(temporal.dato == objetivo){
                        if(fin == temporal){
                            this.eliminarDelFinal();
                        }else{
                            anterior.siguiente = temporal.siguiente;
                        }
                        bandera = false;
                        
                    }else{
                        anterior = temporal;
                        temporal = temporal.siguiente;
                        }
                }
            }
        }else{
            System.out.println("ERROR: LA LISTA ESTA VACIA");
        }
    }
    
    
    public void mostrarLista(){
        Nodo aux = this.inicio;
        while(aux != null){
            System.out.print("[" + aux.dato + "]----->");
            aux = aux.siguiente;
        }
    }
    
    //metodo que devuelve un valor booleano a la pregunta si esta vacia la lista
    public boolean estaVacia(){
        return(this.inicio == null);
    }
    
    
}
