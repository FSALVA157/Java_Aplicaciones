
package recursividad;

import java.util.Scanner;


public class Factorial {
    
    public static int Fact(int numero){
        if(numero == 0){
            return 1;
        }
        return numero*Fact(numero-1);
    }
    
    public static void main(String[] Args){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese numero entero para calcular factorial");
        int num = entrada.nextInt();
        if (num >= 0){
            System.out.printf("EL FACTORIAL DEL NUMERO: %d ES %d",num,Fact(num));
            
        }else{
            System.out.println("DATO INCORRECTO - NO ES POSIBLE PROCESAR");
        }
    }
}
