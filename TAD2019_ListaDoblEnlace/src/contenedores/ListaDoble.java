package contenedores;

import recursos.*;

public abstract class ListaDoble implements IListaDoble, IListaDoble2 {

    protected Nodo inicio, fin;
    protected int contador;

    //constructor
    public ListaDoble() {
        this.limpiar();
    }

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

    @Override
    public void pop(int posicion) {
        if (this.estaVacia()) {
            System.out.println("ERROR AL SACAR: LA LISTA ESTA VACIA");
        } else {
            if (posicion < 0 || posicion >= this.tamanio()) {
                System.out.println("ERROR AL SACAR: POSICION INVALIDA");
            } else {
                if (posicion == 0) {
                    if (this.inicio == this.fin) {
                        this.limpiar();
                    } else {
                        this.inicio = this.inicio.getSiguiente();
                        this.inicio.getAnterior().setSiguiente(null);
                        this.inicio.setAnterior(null);
                        this.contador--;
                    }
                }else{
                    if(posicion == this.tamanio()-1){
                        this.fin = this.fin.getAnterior();
                        this.fin.getSiguiente().setAnterior(null);
                        this.fin.setSiguiente(null);
                        this.contador--;
                    }else{
                        Nodo puntAnt = this.inicio;
                        Nodo puntSig = this.inicio.getSiguiente();
                        int contAux = 0;
                        while(contAux < posicion){
                            puntAnt = puntSig;
                            puntSig= puntSig.getSiguiente();
                            contAux++;
                        }
                        puntSig = puntSig.getSiguiente();
                        puntAnt.setSiguiente(puntSig);
                        puntSig.setAnterior(puntAnt);
                        this.contador--;
                    }
                }
            }
        }
    }

    @Override
    public void limpiar() {
        this.inicio = this.fin = null;
        this.contador = -1;
    }

    @Override
    public boolean estaVacia() {
        return this.inicio == null;
    }

    @Override
    public Object seek(int posicion) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int buscar(Object obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int tamanio() {
        int c = 0;
        if (this.estaVacia()) {
            c = this.contador + 1;
        }
        return c;
    }

    @Override
    public void push(Object obj, int posicion) {
        if (posicion < 0 || posicion > this.tamanio()) {
            System.out.println("ERROR DE PUSH: POSICION INVALIDA");
        } else {
            if (posicion == 0) {
                if (this.estaVacia()) {
                    this.inicio = this.fin = new Nodo(obj);
                } else {
                    this.inicio = new Nodo(obj, null, inicio);
                    this.inicio.getSiguiente().setAnterior(inicio);

                }
                if (posicion == this.tamanio()) {
                    this.fin = new Nodo(obj, fin, null);
                    this.fin.getAnterior().setSiguiente(fin);
                } else {
                    int contAux = 0;
                    Nodo puntAux = this.inicio;
                    while (contAux < posicion) {
                        puntAux = puntAux.getSiguiente();
                        contAux++;
                    }
                    puntAux.setSiguiente(new Nodo(obj, puntAux, puntAux.getSiguiente()));
                    puntAux.getSiguiente().getSiguiente().setAnterior(puntAux.getSiguiente());
                }
            }
            this.contador++;
        }
    }
    
    public abstract void imprimeElemento(Object obj);
    
    public void recorrer(){
       if(this.estaVacia()){
           System.out.println("NADA QUE MOSTRAR: LISTA VACIA");
       }else{
            Nodo puntAux = this.inicio;
            while(puntAux != null){
                this.imprimeElemento(puntAux.getDato());
                puntAux = puntAux.getSiguiente();
            }
       }
       
    }

}
