
package recursividad;

//Determina si un numero natural es multiplo de 11

import java.security.SecureRandom;

//Regla: un Nº es multiplo de 11 si la suma de los digitos de las posiciones par
//menos la suma de los digitos de las posiciones impares es igual a cero o multiplo de 11
public class MultiplosDe11 {
    
    public static int Suma(int n){
        if(n < 10){
            return n;
        }else{
            return Suma(n/100) + n%10;
        }
    }
    
    public static Boolean  EsMultiplo11(int n){
        if (n < 0){
            throw new IllegalArgumentException("El Numero para Analizar debe ser Natural");
        }else{
            int sumaImpar = Suma(n);
            int sumaPar = Suma(n/10);
            int resta = sumaPar - sumaImpar;
            if ((resta == 0)||(resta % 11 ==0)){
                return true;
            }else{
                return false;
            }
            
        }
    }
    
    public static void main(String Args[]){
        SecureRandom aleatorio = new SecureRandom();
        
        for (int i = 1; i < 20; i++){
            int numero = 1111 + aleatorio.nextInt(99999);
            if(EsMultiplo11(numero)){
                System.out.printf("El numero %d SI es multiplo de 11 %n",numero);
            }else{
                System.out.printf("El numero %d NO es multiplo de 11 %n",numero);
            }
        }
    }
    
}
