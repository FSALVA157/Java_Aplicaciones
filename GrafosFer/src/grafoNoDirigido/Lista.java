package grafoNoDirigido;

public abstract class Lista implements ILista {

    private Nodo inicio;
    private Nodo fin;
    private int cardinal;

    public Nodo getInicio() {
        return inicio;
    }

    public void setInicio(Nodo inicio) {
        this.inicio = inicio;
    }

    public Nodo getFin() {
        return fin;
    }

    public void setFin(Nodo fin) {
        this.fin = fin;
    }

    //constructor    
    public Lista() {
        this.limpiar();
    }
   
    @Override
    public void meter(Object elemento, int posicion) {
        if ((posicion < 0) || (posicion > this.tamanio())) {
            System.out.println("ERROR AL INSERTAR: POSICION INVALIDA");
        } else {
            //insercion al inicio
            if (posicion == 0) {
                if (!this.estaVacia()) {
                    this.inicio = new Nodo(elemento, inicio);
                } else {
                    this.inicio = this.fin = new Nodo(elemento);
                }
            } else {
                //insercion al final
                if (posicion == this.cardinal) {
                    this.fin.setSiguiente(new Nodo(elemento));
                    this.fin = this.fin.getSiguiente();
                } else {
                    Nodo puntAux = this.inicio;
                    for (int i = 1; i < posicion; i++) {
                        puntAux = puntAux.getSiguiente();
                    }
                    puntAux.setSiguiente(new Nodo(elemento, puntAux.getSiguiente()));
                }
            }
            this.cardinal++;
        }
    }

    @Override
    public void sacar(int posicion) {
      //  posicion--;
        Object auxObj = null;
        if (!this.estaVacia()) {
            if (posicion < 0 || posicion > this.cardinal) {
                System.out.println("ERRO AL ELIMINAR: POSICION INVALIDA");
            } else {
                //sacar del inicio
                if (posicion == 0) {
                    if (inicio == fin) {//si tengo un solo elemento
                        this.limpiar();
                    } else {
                        this.inicio = this.inicio.getSiguiente();
                        this.cardinal--;
                    }
                } else {
                    if (posicion == this.cardinal) {//sacar del final
                        Nodo puntAux = this.inicio;
                        for (int i = 0; i < this.cardinal; i++) {
                            puntAux = puntAux.getSiguiente();
                        }
                        this.fin = puntAux;
                        this.fin.setSiguiente(null);
                    } else {
                        Nodo puntAux = this.inicio;
                        for (int i = 1; i < posicion; i++) {
                            puntAux = puntAux.getSiguiente();
                        }
                        puntAux.setSiguiente(puntAux.getSiguiente().getSiguiente());
                    }
                    this.cardinal--;
                }
            }
        } else {
            System.out.println("ERROR AL ELIMINAR: LA LISTA ESTA VACIA");
        }
    }

    @Override
    public void limpiar() {
        this.inicio = this.fin = null;
    }

    @Override
    public boolean estaVacia() {
        return (this.inicio == null);
    }

    @Override
    public Object seek(int posicion) {
        Object objAux = null;
        if (this.estaVacia()) {
            System.out.println("ERROR DE SEEK: LA PILA ESTA VACIA");
        } else {
            if (posicion < 0 || posicion > this.cardinal) {
                System.out.println("ERROR DE SEEK: LA POSICION ES INVALIDA");
            } else {
                Nodo puntAux = this.inicio;
                for (int i = 0; i < posicion; i++) {
                    puntAux = puntAux.getSiguiente();
                }
                objAux = puntAux.getDato();
                //dudas acerca de la posicion pero si inicio en posicion cero
                //antes de empezar a contar deberia funcionar
            }
        }
        return objAux;
    }

    @Override
    public int buscar(Object obj) {
       int posicion = -1;
        int c = 0;
        Object objAux = null;
        Nodo punteroAux = this.inicio;
        if(!this.estaVacia()){
            while(posicion == -1 && punteroAux != null){
                objAux = punteroAux.getDato();
                if(this.esIgual(objAux, obj)){
                    posicion = c;
                }else{
                    c++;
                    punteroAux = punteroAux.getSiguiente();
                }
                     }
        }else{
            System.out.println("ERROR AL BUSCAR: LISTA VACIA");
        }
        return posicion;
    }

    @Override
    public void reemplazar(Object nuevo, int posicion) {
        if (this.estaVacia()) {
            System.out.println("ERROR AL REEMPLAZAR: LA LISTA ESTA VACIA");
        } else {
            if (posicion < 0 || posicion >= this.tamanio()) {
                System.out.println("ERROR AL REEMPLAZAR: LA POSICION NO ES VALIDA");
            } else {
                if (posicion == 0) {
                    this.inicio.setDato(nuevo);
                } else {
                    if (posicion == this.tamanio() - 1) {
                        this.fin.setDato(nuevo);
                    } else {
                        Nodo puntAux = inicio;
                        for (int i = 0; i < posicion; i++) {
                            puntAux = puntAux.getSiguiente();
                        }
                        puntAux.setDato(nuevo);
                    }
                }
            }
        }
    }

    @Override
    public int tamanio() {
        int t = 0;
        if (!this.estaVacia()) {

            t = this.cardinal;
        }
        return t;
    }
    
    
    public abstract boolean esIgual(Object obj1,Object obj2);
    
    
    public abstract void mostrar();
    
    
    
}           
