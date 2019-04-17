
package recursividad;


public class DvisionPorRestasSucesivas {

public static int Dividir(int dividendo, int divisor){
    
    if(dividendo < divisor){
        return 0;
        }else{
        
        return Dividir(dividendo-divisor,divisor)+1;
    }
    
}
    
}
