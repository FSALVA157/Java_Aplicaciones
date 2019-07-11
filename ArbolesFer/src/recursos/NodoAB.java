
package recursos;


public class NodoAB {
    private NodoAB hijoIzq,hijoDer;
    private Object nodoInfo;
    
     public NodoAB(Object dato, NodoAB hi,NodoAB hd){
        this.setNodoInfo(dato);
        this.setHijoIzq(hi);
        this.setHijoDer(hd);
    }
    
    public NodoAB(){
        this(null, null, null);
    }
    
    public NodoAB(Object dato){
        this(dato,null,null);
    }

    public NodoAB getHijoIzq() {
        return hijoIzq;
    }

    public void setHijoIzq(NodoAB hijoIzq) {
        this.hijoIzq = hijoIzq;
    }

    public NodoAB getHijoDer() {
        return hijoDer;
    }

    public void setHijoDer(NodoAB hijoDer) {
        this.hijoDer = hijoDer;
    }

    public Object getNodoInfo() {
        return nodoInfo;
    }

    public void setNodoInfo(Object nodoInfo) {
        this.nodoInfo = nodoInfo;
    }
    
    
}
