package listaSimpleFer;

public abstract class ListaOrdenada extends Lista implements ILista, ILista2 {
    
    public abstract void imprime(Object obj);

    @Override
    public boolean esIgual(Object obj1, Object obj2) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mostrar() {
        Nodo punteroAux = this.getInicio();
        if (this.estaVacia()) {
            System.out.println("LA LISTA ESTA VACIA");
        } else {
            System.out.println("");
            while (punteroAux != null) {
                this.imprime(punteroAux.getDato());
                punteroAux = punteroAux.getSiguiente();
            }
        }
    }

    @Override
    public void meter(Object obj) {
        if (this.estaVacia()) {
            this.meter(obj, 0);
        } else {
            if (this.esMenorQue(obj, seek(0))) {
                this.meter(obj, 0);
            } else {
                if (this.esMayorQue(obj, seek(tamanio() - 1))) {
                    this.meter(obj, tamanio());
                } else {
                    int medio;
                    int base = 0;
                    int techo = this.tamanio() - 1;
                    while (base <= techo) {
                        medio = (base + techo) / 2;
                        if (this.esIgual(obj, this.seek(medio))) {
                            this.meter(obj, medio);
                        } else if (esMenorQue(obj, this.seek(medio))) {
                            techo = medio - 1;

                        } else {
                            base = medio + 1;
                        }
                    }
                    this.meter(obj,techo+1);
                }
            }
        }
    }

    public abstract boolean esMayorQue(Object obj1, Object obj2);

    public abstract boolean esMenorQue(Object obj1, Object obj2);

    public int buscar(Object obj) {
        int medio;
        int base = 0;
        int techo = this.tamanio() - 1;
        while (base <= techo) {
            medio = (base + techo) / 2;
            if (this.esIgual(obj, this.seek(medio))) {
                return medio;
            } else if (esMenorQue(obj, this.seek(medio))) {
                techo = medio - 1;

            } else {
                base = medio + 1;
            }
        }
        return -1;
    }
    
    @Override
    public void pop(Object obj){
        if(this.estaVacia()){
            System.out.println("ERROR AL SACAR: LA LISTA ESTA VACIA");
        }else{
            int posicion = -1;
            posicion = this.buscar(obj);
            if(posicion != -1){
                this.sacar(posicion);
            }
                    }
    }

}
