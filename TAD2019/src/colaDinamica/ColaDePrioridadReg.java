
package colaDinamica;


public class ColaDePrioridadReg extends ColaAbs{

    
    @Override
    public boolean esIgual(Object obj1, Object obj2) {
        RegistroBancario obja, objb;
        String resp;
        obja=(RegistroBancario) obj1;
        objb=(RegistroBancario) obj2;
        
         System.out.println(obja.getPrioridad()==objb.getPrioridad()? "ES IGUAL":"NO ES IGUAL");
        return (obja.getPrioridad() == objb.getPrioridad());
      
       
    }

    @Override
    public boolean esMayorQue(Object obj1, Object obj2) {
    RegistroBancario obja, objb;
        
        obja=(RegistroBancario) obj1;
        objb=(RegistroBancario) obj2;
        
        System.out.println(obja.getPrioridad()> objb.getPrioridad()? "ES MAYOR":"NO ES MAYOR");
        return obja.getPrioridad() > objb.getPrioridad();    
    }

    @Override
    public boolean esMenorQue(Object obj1, Object obj2) {
         RegistroBancario obja, objb;
        
        obja=(RegistroBancario) obj1;
        objb=(RegistroBancario) obj2;
        
        System.out.println(obja.getPrioridad()< objb.getPrioridad()? "ES MENOR":"NO ES MENOR");
        return obja.getPrioridad() < objb.getPrioridad();  
    }

    @Override
    public void imprimir(Object obj) {
        RegistroBancario reg;
        reg = (RegistroBancario)obj;
        System.out.println("-----------------------------REGISTRO-----------------------------------------------------");
        System.out.printf("id : %d \n nombre: %s \n PRIORIDAD: %d \n",reg.getId(),reg.getNombre(),reg.getPrioridad());
        System.out.println("-----------------------------FIN REGISTRO-----------------------------------------------------");
    }
    
}
