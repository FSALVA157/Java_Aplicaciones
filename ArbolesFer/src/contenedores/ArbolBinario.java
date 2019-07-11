
package contenedores;

import recursos.IArbolBinario;
import recursos.NodoAB;


public abstract class ArbolBinario implements IArbolBinario{
    protected NodoAB raiz;
    
     @Override
    public abstract void push(Object nodoDato);
    
    @Override
    public abstract void pop(Object nodoDato);
    
     @Override
    public abstract boolean esta(Object nodoDato);
    
    @Override
    public abstract NodoAB seek(Object dato);
    
    public abstract void imprimeDatoNodo(Object dato);
    

    @Override
    public boolean EstaVacio() {
        return raiz == null;
    }
     

    @Override
    public void limpiar() {
        this.raiz = null;
    }

    
    @Override
    public int cantNodos(NodoAB nodo) {
        if(nodo == null){
           return 0; 
        }else{
            return 1 + cantNodos(nodo.getHijoIzq()) + cantNodos(nodo.getHijoDer());
        }
    }
    
    public int cuentaNodosArbol(){
        return cantNodos(raiz);
    }

    @Override
    public int cantHojas() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int alturaArbol() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int nivelNodo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void preOrder(NodoAB nodo) {
        if(nodo != null){
            this.imprimeDatoNodo(nodo.getNodoInfo());
            inOrder(nodo.getHijoIzq());
            inOrder(nodo.getHijoDer());
        }
    }
    
    public void muestraPreOrder(){
        this.preOrder(raiz);
    }

    @Override
    public void inOrder(NodoAB nodo) {
        if(nodo != null){
            inOrder(nodo.getHijoIzq());
            this.imprimeDatoNodo(nodo.getNodoInfo());
            inOrder(nodo.getHijoDer());
        }
    }
    
    public void muestraInOrder(){
        this.inOrder(raiz);
    }

    @Override
    public void postOrder(NodoAB nodo) {
        inOrder(nodo.getHijoIzq());
        inOrder(nodo.getHijoDer());
        this.imprimeDatoNodo(nodo.getNodoInfo());
    }
    
    public void muestraPostOrder(){
        this.postOrder(raiz);
    }
    
}
