
package primalidad;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


public class Primalidad {


    public static void main(String[] args) {//inicio main
        Scanner entrada = new Scanner(System.in);
        System.out.println("INGRESE EL NUMERO LIMITE");
        int l = entrada.nextInt();
        
        criba(l);

    }//fin main
    
    public static Boolean[] criba(int numero){
        int lim = (int)(Math.sqrt(numero))+1;
        Boolean[] primos = new Boolean[lim];
        Arrays.fill(primos, true);
        LeerLista(primos);
        for(int i=2; i< primos.length;i++)
            if(primos[i]){
                int n = 2;
                 int j=i * n;
               
                    while(j < primos.length){
                        System.out.printf("valor de j %d %n",j);
                                if(primos[j]){
                                        primos[j] = false;
                                         }
                                        n++;
                                        j=i*n;
                          
                               
                         }
                    }
        LeerLista(primos);
        return primos;
    }
    
    public static void LeerLista(Boolean[] lista){
        System.out.println("");
        for(int i = 2; i < lista.length;i++){
            if(lista[i]){
                System.out.printf(" elemento[%d] = %b , ",i,lista[i]);
            }
        }
    }
    
}
