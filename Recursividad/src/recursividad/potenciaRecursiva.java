
package recursividad;

import java.util.Scanner;


public class potenciaRecursiva {
    
    public static int Potencia(int base,int potencia){
        if(potencia == 0){
            return 1;
        }else{
            return Potencia(base,potencia-1)*base;
        }
    }
    
    public static void main(String Args[]){
        Scanner entrada = new Scanner(System.in);
        System.out.println("INGRESE LA BASE DE LA POTENCIA");
        int base = entrada.nextInt();
        System.out.println("INGRESE EL EXPONENTE DE LA POTENCIA");
        int exponente = entrada.nextInt();
        
        System.out.printf("%d^%d = %d",base,exponente,Potencia(base,exponente));
        
    }
    
}
