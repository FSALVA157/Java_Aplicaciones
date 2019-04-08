
package maximoComunDivisor;

//Calculo del minimo comun multiplo de dos numeros enteros

import java.util.*;

//utilizando el mcd 
public class MCM {//inicio clase principal
    
    public static int CalculaMCM(int operador1,int operador2){//inicio calculaMCM
        if ((operador1 > 0)&&(operador2 > 0)){
        int mcd = MCDrecursivo.mcd(operador1, operador2);
        return (operador1*operador2)/mcd;
        }else{
            //el minimo comun multiplo de un entero y el numero cero es indefinido
            return -1;
        }
    }//fin calculaMCM
    
    //probemos la funcion mcm
    public static void main(String Args[]){
        Scanner entrada = new Scanner(System.in);
        System.out.println("INGRESE EL PRIMER OPERADOR(DEBE SER UN NUMERO POSITIVO)");
        int numero1 = entrada.nextInt();
        System.out.println("INGRESE EL SEGUNDO OPERADOR(DEBE SER UN NUMERO POSITIVO)");
        int numero2 = entrada.nextInt();
        int minimoCM = CalculaMCM(numero1, numero2);
        System.out.println(minimoCM==-1?"ERROR LOS OPERADORES NO SON ENTEROS POSITIVOS":minimoCM);
    }
    
    
}//fin clase principal
