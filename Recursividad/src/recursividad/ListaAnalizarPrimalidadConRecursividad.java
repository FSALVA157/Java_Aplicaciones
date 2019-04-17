
package recursividad;

import java.security.SecureRandom;


public class ListaAnalizarPrimalidadConRecursividad {
    
    //metodo que determina si un numero es primo, utilizando recursividad
    public static Boolean Primalidad(int num,int factor){
        if(factor > (int)Math.sqrt(num)){
            return true;
        }else{
            return num%factor==0?false:Primalidad(num, factor+1);
        }
        
    }
    
    public static void main(String args[]){
        SecureRandom n = new SecureRandom();
        int[] lista = new int[10];
        Boolean[] prim = new Boolean[10];
        for (int i=0; i < 10; i++){
            lista[i] = 1 + n.nextInt(30);
            prim[i] = Primalidad(lista[i], 2);
        }
        
        for (int i=0; i < 10; i++){
            System.out.printf(" %d - ",lista[i]);
           
            System.out.printf(" %b - ",prim[i]);
        }
        
        
        
    }
    
    
    
}
