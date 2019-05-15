package contenedores;

import contenedores.ListaDoble;
import recursos.IListaDoble3;

public abstract class ListaDobleOrdenada extends ListaDoble implements IListaDoble3 {

    public abstract boolean esIgual(Object obj1, Object obj2);

    public abstract boolean esMayorQue(Object obj1, Object obj2);

    public abstract boolean esMenorQue(Object obj1, Object obj2);

    @Override
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
    public void imprimeElemento(Object obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void push(Object obj) {
        if (this.estaVacia()) {
            this.push(obj, 0);
        } else {
            if (this.esMenorQue(obj, seek(0))) {
                this.push(obj, 0);
            } else {
                if (this.esMayorQue(obj, seek(tamanio() - 1))) {
                    this.push(obj, tamanio());
                } else {
                    int medio;
                    int base = 0;
                    int techo = this.tamanio() - 1;
                    while (base <= techo) {
                        medio = (base + techo) / 2;
                        if (this.esIgual(obj, this.seek(medio))) {
                            this.push(obj, medio);
                        } else if (esMenorQue(obj, this.seek(medio))) {
                            techo = medio - 1;

                        } else {
                            base = medio + 1;
                        }
                    }
                    this.push(obj, techo + 1);
                }
            }
        }
    }

    @Override
    public void pop(Object obj) {
        if(!estaVacia()){
            //sacar la primera ocurrencia de un elemento
            int posicion = -1;
            posicion = this.buscar(obj);
            if(posicion != -1){
                this.pop(posicion);
            }
            
        }else{
            System.out.println("NADA QUE SACAR: LA LISTA ESTA VACIA");
        }

    }

}
