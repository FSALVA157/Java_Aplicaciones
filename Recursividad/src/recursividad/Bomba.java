
package recursividad;

import java.util.Scanner;


//dados numeros enteros N Y B con B<N podemos explotar a N usando B
//causando una reaccion en cadena que termina cuando los fragmentos son menores a B
public class Bomba {
    
    public static void Explosion(int N, int B){
        if(N < B){
            System.out.println("fragmento: " + N);
            return;
        }else{
            Explosion(N/B, B);
            Explosion(N-(N/B), B);
            
        }
    }
    
    public static void main(String Args[]){
        Scanner entrada = new Scanner(System.in);
        System.out.println("INGRESE N");
        int N = entrada.nextInt();
        System.out.println("INGRESE B");
        int B = entrada.nextInt();
        Explosion(N,B);
    }
    
}
