
package recursividad;

import java.util.Scanner;

/*ejercicio de parcial 2017
Un número primo tiene solamente 2 factores (o divisores), mientras que un número
compuesto tiene más de 2.
Defina la función
menorDivisor n, la cual devuelve el menor divisor de n y mayor a 1. Por ejemplo,
menorDivisor 14 devuelve 2
menorDivisor 15 devuelve 3
Para ello, escriba una función auxiliar sigteDivisor k n, la cual devuelve el menor divisor de n y mayor a k.
De esta manera, puede definirse menorDivisor usando sigteDivisor y éste último por recursión.
Luego defina (reusando lo anterior)
cantDivisores n, la cual obtiene la cantidad de factores de n, en el rango 1..n.
*/
public class MenorDivisorParcial2017 {
    
    public static int sgteDivisor(int k, int n){
        k++;
        if((n % k) == 0){
            return k;
        }else{
            return sgteDivisor(k, n);
        }
    }
    
    public static int menorDivisor(int x){
        return sgteDivisor(1, x);
    }
    
    public static int cantFactores(int numero){
        return sgteDivisor(sgteDivisor(1, numero), numero)+1;
        
    }
    
    public static void main (String Args[]){
        Scanner entrada = new Scanner(System.in);
        System.out.println("INGRESE EL NUMERO A ANALIZAR");
        int valor = entrada.nextInt();
        //System.out.printf("EL PRIMER DIVISOR DE %d es el numero %d %n",valor, sgteDivisor(1, valor));
        System.out.printf("LA CANTIDAD DE DIVISORES DEL NUMERO %d es %d %n",valor, cantFactores(valor));
                
    }
    
}
