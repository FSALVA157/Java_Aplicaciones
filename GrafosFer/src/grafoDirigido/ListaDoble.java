package grafoDirigido;

//import com.sun.org.apache.xalan.internal.xsltc.compiler.Template;

public class ListaDoble {

    private NodoDoble inicio;
    private NodoDoble fin;
    private int ultimo;
    private int primero;

    //constructores
    public ListaDoble() {
        this.limpiarListaD();
    }

    //metodos
    public void limpiarListaD() {
        this.inicio = this.fin = null;
        this.ultimo = this.primero = -1;
    }

    public boolean estaVacia() {
        return this.inicio == null;
    }

    public int getTamanio() {
        if (this.estaVacia()) {
            return 0;
        } else {
            this.primero = 0;
            return this.ultimo + 1;
            
        }
    }

    public void meter(Object obj, int posicion) {
        if (posicion < 0 || posicion > this.getTamanio()) {
            System.out.println("ERROR AL METER ELEMENTO: LA POSICION ES INCORRECTA");
        } else {
            if (posicion == 0) {
                if (this.estaVacia()) {
                    this.inicio = this.fin = new NodoDoble(obj);
                    
                }else{
                    this.inicio = new NodoDoble(obj, this.inicio);
                    this.inicio.getNext().setPrev(this.inicio);
                }
            }else{
                //veamos que pasa si inserto al final
                if(posicion == this.getTamanio()){
                    this.fin = new NodoDoble(obj, this.fin,null);
                    this.fin.getPrev().setNext(fin);
                }else{
                    //insercion al medio de la lista
                    NodoDoble puntAux1 = this.inicio;
                    NodoDoble puntAux2 = this.inicio.getNext();
                    for(int count = 1; count < posicion;count++){
                        puntAux1 = puntAux1.getNext();
                        puntAux2 = puntAux2.getNext();
                    }
                    puntAux1.setNext(new NodoDoble(obj, puntAux1, puntAux2));
                    puntAux2.setPrev(puntAux1.getNext());
                }
            }
            this.ultimo++;
            
        }

    }
    
    public void sacar(int posicion){
        
        if(posicion < 0 || posicion > this.getTamanio()){
            System.out.println("ERROR AL SACAR: LA POSICION ES INVALIDA");
        }else{
            if(!this.estaVacia()){
                
                if(posicion == 0){//sacando de la cabeza
                    if(this.inicio == this.fin){//sacando cuando la lista tiene un solo elemento
        
                        this.limpiarListaD();
                    }else{//sacando de la cabeza cuando la lista tiene mas de un elemento
        
                        this.inicio = this.inicio.getNext();
                        this.inicio.setPrev(null);
                        this.ultimo--;
                    }
                }else{
                    if(posicion == this.getTamanio()-1){//sacando del final
        
                        this.fin = this.fin.getPrev();
                        this.fin.setNext(null);
                    }else{
                        //vamos a sacar del medio de la lista
                        NodoDoble puntAux1 = this.inicio;
                        NodoDoble puntAux2 = this.inicio.getNext();
                        for(int j=1; j < posicion; j++){
                            puntAux1 = puntAux1.getNext();
                            puntAux2 = puntAux2.getNext();
                        }
                            puntAux2 = puntAux2.getNext();
                            puntAux1.setNext(puntAux2);
                            puntAux2.setPrev(puntAux1);
                    }
                    this.ultimo--;
                }
                
            }else{
                System.out.println("ERROR AL SACAR: LA LISTA DOBLE ESTA VACIA");
            }
        }
    }

    public Object seek(int posicion){
       Object objAux = null;
       if(this.estaVacia()){
           System.out.println("NADA QUE MOSTRAR: LA LISTA ESTA VACIA");
       }else{
           if(posicion < 0 || posicion > this.getTamanio()-1){
               System.out.println("ERROR AL MOSTRAR: LA POSICION NO ES CORRECTA");
           }else{
               NodoDoble puntAux = this.inicio;
               for(int i = 0; i < posicion; i++){
                   puntAux = puntAux.getNext();
               }
               objAux = puntAux.getDato();
           }
       }
    return objAux;   
    }
    
    //metodo recorrer
    public void recorrer(){
        if(!this.estaVacia()){
            NodoDoble puntAux = this.inicio;
            while(puntAux != null){
                System.out.println("[" + puntAux.getDato().toString() +"]---");
                puntAux = puntAux.getNext();
            }
        }else{
            System.out.println("NADA QUE RECORRER: LA LISTA ESTA VACIA");
        }
    }
    
    //metodo actualizar que cambia el valor de un elemento de la lista
    public void actualiza(Object obj,int posicion){
        if(!this.estaVacia()){
            if(posicion < 0 || posicion >= this.getTamanio()){
                System.out.println("IMPOSIBLE ACTUALIZAR VALOR: LA POSICION NO EXISTE");
            }else{
                NodoDoble puntAux = this.inicio;
                for(int i = 0; i < posicion;i++){
                    puntAux = puntAux.getNext();
                }
                puntAux.setDato(obj);
            }
        }else{
            System.out.println("IMPOSIBLE ACTUALIZAR VALOR: LA LISTA ESTA VACIA");
        }
    }
    
    
}
