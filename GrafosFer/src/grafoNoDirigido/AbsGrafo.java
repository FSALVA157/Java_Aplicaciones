
package grafoNoDirigido;

import grafoDirigido.MatrizGrafo;


public abstract class AbsGrafo implements IOperacionesG {
    protected MatrizGrafo matrizCosto;
    protected int ordenGrafo;
    protected static double infinito = 10000;
    
    public AbsGrafo(int ordenGrafo){
        this.ordenGrafo = ordenGrafo;
        matrizCosto = new MatrizGrafo(this.getOrden());
    }
    
    public int getOrden(){
        return this.ordenGrafo;
    }
    
    public abstract void cargarGrafo();
    public abstract void muestraGrafo();

    
    
    @Override
    public void muestraBEA() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void muestraBPF() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
