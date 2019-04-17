
package recursividad;

import java.util.Scanner;



public class FibonaccioRecursivo {
    
    public static int Fibonacci(int numero){
        if((numero == 1)||(numero == 2)){
            return 1;
        }
        
        return Fibonacci(numero-1)+Fibonacci(numero-2);
    }
    
    public static void main(String[] Args){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el tamaño de la serie fibonacci que desea generar");
        int num = entrada.nextInt();
        if (num > 0){
            for(int i = 1; i <= num;i++){
                System.out.printf("%d, ",Fibonacci(i));
            }
            
        }else{
            System.out.println("DATO INCORRECTO - NO ES POSIBLE PROCESAR");
        }
    }
}
