package grafoDirigido;

public class ColaSimple {

    NodoSimple frente;
    NodoSimple cola;

    public ColaSimple() {
        this.limpiar();
    }

//metodos
    public void limpiar() {
        this.frente = this.cola = null;
    }

    public boolean estaVacia() {
        return this.frente == null;
    }

    public void meter(Object obj) {
        if (this.estaVacia()) {
            this.frente = this.cola = new NodoSimple(obj);
        } else {
            this.cola.setNext(new NodoSimple(obj));
            this.cola = this.cola.getNext();
        }
    }

    public Object sacar() {
        Object objAux = null;
        if (!this.estaVacia()) {
            objAux = this.frente.getDato();
            if (this.frente == this.cola) {
                this.limpiar();
            } else {
                this.frente = this.frente.getNext();
            }
        } else {
            System.out.println("NADA QUE SACAR LA COLA ESTA VACIA");
        }
        return objAux;
    }
    
    public void recorrerCola(){
        if(!this.estaVacia()){
            NodoSimple puntAux = this.frente;
            while(puntAux != null){
                System.out.print("[" + puntAux.getDato().toString() + "]----->");
                puntAux = puntAux.getNext();
                
            }
        }else{
            System.out.println("NADA QUE MOSTRAR LA COLA ESTA VACIA");
        }
    }

}
