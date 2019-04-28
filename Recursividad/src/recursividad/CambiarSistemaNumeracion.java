
package recursividad;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class CambiarSistemaNumeracion {
    
    public static void Conversor(int numero, int sistema, ArrayList lista){
        if (numero < sistema){
            lista.add(numero);
        }else{
            lista.add(numero % sistema);
            Conversor(numero/sistema, sistema,lista);
        }
    }
    
    public static void RecorreLista(ArrayList list){
        System.out.println(list);
    }
    
    
    public static void main(String[] Args){
        Scanner entrada = new Scanner(System.in);
        System.out.println("INGRESE EL NUMERO A CONVERTIR");
        int num = entrada.nextInt();
        System.out.println("INGRESE EL SISTEMA DE NUMERACION DE SALIDA (DEBE SER MENOR QUE DIEZ)");
        int sist = entrada.nextInt();
        if(sist >= 10){
           throw new IllegalArgumentException("ERROR HA INGRESADO UN SISTEMA DE NUMERACION INVALIDO");
        }
        
        ArrayList<Integer> secuencia = new ArrayList<Integer>();
        Conversor(num, sist, secuencia);
        RecorreLista(secuencia);
        //falta convertir la secuencia en un numero entero!!!!
        
    }
}
