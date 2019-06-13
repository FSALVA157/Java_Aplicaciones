
package grafoNoDirigido;


public abstract class ColaAbs implements IContenedor,ICola2{
   Nodo inicio;
   Nodo fin;
   int contador;
   /* 
    public Cola(Object elemento){
        inicio = fin = new Nodo(elemento);
    }
    */
    public ColaAbs(){
        this.limpiar();
    }

    @Override
    public void meter(Object elemento) {
        if(this.estaVacia()){
            inicio = fin = new Nodo(elemento);
        }else{
            this.fin.setSiguiente(new Nodo(elemento));
            this.fin = fin.getSiguiente();
        }
        this.contador++;
    }

    @Override
    public Object sacar() {
        Object auxiliar = null;
      if(!this.estaVacia()){
            auxiliar = this.inicio.getDato();
            inicio = inicio.getSiguiente();
            this.contador--;
            //pequeña porcion del codigo que verifica si la cola no tenia un solo elemento
            if(this.estaVacia()){
                this.fin = null;
                contador = -1;
            }
            
      }else{
          System.out.println("ERROR AL SACAR: LA COLA ESTA VACIA");
      }
      return auxiliar;
    }

    @Override
    public void limpiar() {
        inicio = fin = null;
        this.contador = -1;
    }

    @Override
    public boolean estaVacia() {
        return(this.inicio == null);
       }
    
    public int cardinal(){
        int aux = 0;
        if(!this.estaVacia()){
            aux = this.contador + 1;
        }
        return aux;
     }
    
    //esta clase deberia ser abstracta pero como espero testear solo con tipos primitivos la implemento aqui
    public void recorrer(){
        if(!this.estaVacia()){
        Nodo auxiliar = this.inicio;
        while(auxiliar != null){
            //System.out.print("[" + auxiliar.getDato().toString() + "]--->");
            this.imprimir(auxiliar.getDato());
            auxiliar = auxiliar.getSiguiente();
        }
    }else{
            System.out.println("NADA QUE MOSTRAR: LA COLA ESTA VACIA");
        }
    }
    
    
   @Override
    public void meterConPrioridad(Object obj){
        if(this.estaVacia()){
            this.inicio = this.fin = new Nodo(obj);
            
        }else{
            if(this.esMenorQue(obj, this.fin.getDato()) || this.esIgual(obj, this.fin.getDato() )){
                
                this.fin.setSiguiente(new Nodo(obj));
                this.fin = this.fin.getSiguiente();
            }else{
                Nodo puntAux = this.inicio;
                if(inicio == fin){
                    if(esMayorQue(obj,puntAux.getDato())){
                        inicio = new Nodo(obj,inicio);
                        
                    }else{
                        inicio.setSiguiente(new Nodo(obj));
                        fin = fin.getSiguiente();
                        
                    }
                }else{
                    if(esMayorQue(obj, inicio.getDato())){
                        inicio = new Nodo(obj,inicio);
                        
                    }else{
                         while((this.esMenorQue(obj, puntAux.getSiguiente().getDato())|| this.esIgual(obj, puntAux.getSiguiente().getDato()))&&(puntAux != null)){
                    puntAux = puntAux.getSiguiente();
                }
                    puntAux.setSiguiente(new Nodo(obj,puntAux.getSiguiente()));
                    
                    }
                
               
            }
            }
            
        }
        
        this.contador++;
    }
    
    public abstract boolean esIgual(Object obj1, Object obj2);

    public abstract boolean esMayorQue(Object obj1, Object obj2);

    public abstract boolean esMenorQue(Object obj1, Object obj2);
    
    public abstract void imprimir(Object obj);


}
