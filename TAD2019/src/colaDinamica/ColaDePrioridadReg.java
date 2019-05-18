
package colaDinamica;


public class ColaDePrioridadReg extends ColaAbs{

    
    @Override
    public boolean esIgual(Object obj1, Object obj2) {
        RegistroBancario obja, objb;
        
        obja=(RegistroBancario) obj1;
        objb=(RegistroBancario) obj2;
        
        
        return obja.getPrioridad() == objb.getPrioridad();
    }

    @Override
    public boolean esMayorQue(Object obj1, Object obj2) {
    RegistroBancario obja, objb;
        
        obja=(RegistroBancario) obj1;
        objb=(RegistroBancario) obj2;
        
        
        return obja.getPrioridad() > objb.getPrioridad();    
    }

    @Override
    public boolean esMenorQue(Object obj1, Object obj2) {
         RegistroBancario obja, objb;
        
        obja=(RegistroBancario) obj1;
        objb=(RegistroBancario) obj2;
        
        
        return obja.getPrioridad() < objb.getPrioridad();  
    }
    
}
