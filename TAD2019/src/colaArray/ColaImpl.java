
package colaArray;


public class ColaImpl implements ICola {
    private int inicio;
    private int fin;
    private Object[] cola;
    private int tamano;
    
    //constructor con tamaño
    public ColaImpl(int tamCola){
        tamano = tamCola;
        cola = new Object[tamano];
        this.limpiar();
    }
    
    public void incrementaInicio(){
        this.inicio++;
    }
    
    public void incrementaFin(){
        this.fin++;
    }
    @Override
    public void push(Object elemento) {
        if(!this.estaLlena()){
            if(this.fin == this.tamano - 1){
                this.fin = 0;
            }else{
                this.incrementaFin();
            }
            this.cola[fin] = elemento;
        }else{
            System.out.println("Error: La cola esta llena1");
        }
    }

    @Override
    public Object pop() {
        Object auxiliar = null;
        if(!this.estaVacia()){
            
            if(this.inicio == this.tamano - 1){
                this.inicio = 0;
            }else{
                this.incrementaInicio();
              
            }
             auxiliar = cola[inicio];
            
        }else{
            System.out.println("ERROR: la cola esta vacia");
        }
         return auxiliar;
    }

    @Override
    public boolean estaVacia() {
       return(this.inicio == this.fin);
    }

    @Override
    public boolean estaLlena() {
        int pos;
        if(this.fin == this.tamano -1){
            pos = 0;
        }else{
            pos = this.fin + 1;
            }
        return pos == this.inicio;
    }

    @Override
    public void limpiar() {
        inicio = fin = this.tamano - 1;
    }

    @Override
    public Object seek() {
        if(!this.estaVacia()){
            return cola[inicio + 1];
        }else{
            return null;
        }
    }
    
}
