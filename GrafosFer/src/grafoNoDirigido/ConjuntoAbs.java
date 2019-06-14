package grafoNoDirigido;

public abstract class ConjuntoAbs extends Lista implements IConjunto {

    @Override
    public abstract boolean esIgual(Object obj1, Object obj2);

    @Override
    public void mostrar() {
        System.out.println("(");
        for (int i = 0; i < this.tamanio(); i++) {
            System.out.print("-" + this.imprime(this.seek(i)) + "-");
        }
        System.out.printf(")\n");
    }

    public abstract String imprime(Object obj);

    //este metodo meter pertenece al conjunto porque no permite ingreso de elementos duplicados
    @Override
    public void meter(Object obj) {
        if (!this.estaVacia()) {
            if (buscar(obj) == -1) {
                this.meter(obj, 0);
            }
        }else{
            this.meter(obj, 0);
        }
    }

    //este metodo no altera al conjunto2 si lo hago con un while puedo desintegrar el conjunto2 mientras lo uno
    public void union(ConjuntoAbs conjunto1, ConjuntoAbs conjunto2) {
        for (int i = 0; i < conjunto1.tamanio(); i++) {
            this.meter(conjunto1.seek(i));
        }
        for (int i = 0; i < conjunto2.tamanio(); i++) {
            this.meter(conjunto2.seek(i));
        }
    }//fin metodo union

    public void interseccion(ConjuntoAbs conjunto1, ConjuntoAbs conjunto2) {

        for (int i = 0; i < conjunto1.tamanio(); i++) {
            if (conjunto2.buscar(conjunto1.seek(i)) != -1) {
                this.meter(conjunto1.seek(i));
            }
        }

    }//fin metodo union

    public void diferencia(ConjuntoAbs conjunto1, ConjuntoAbs conjunto2) {
        for (int i = 0; i < conjunto1.tamanio(); i++) {
            if (conjunto2.buscar(conjunto1.seek(i)) == -1) {
                this.meter(conjunto1.seek(i));
            }
        }
    }

    public boolean EstaIncluido(ConjuntoAbs conjunto1) {
        boolean bandera = true;
        for (int i = 0; i < conjunto1.tamanio(); i++) {
            if (this.buscar(conjunto1.seek(i)) != -1) {
                bandera = false;
            }
        }
        return bandera;
    }
    
    public boolean pertenece(Object obj){
       Nodo puntAux;
        boolean bandera = true;
        if(!this.estaVacia()){
            puntAux = this.getInicio();
             while( puntAux != null && bandera){
                if(this.esIgual(puntAux.getDato(), obj)){
                    bandera = false;
                }else{
                        puntAux = puntAux.getSiguiente();
                        }
             }
        }else{
            System.out.println("LA LISTA ESTA VACIA");
        }
        return !bandera;
    }

}
