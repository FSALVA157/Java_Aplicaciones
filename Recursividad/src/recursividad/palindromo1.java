
package recursividad;

//determina si un string que es solo una palabra o numero es un palindromo

import java.util.Scanner;

public class palindromo1 {
    
    public static Boolean palindromo(String texto, int posicion){
        if(posicion >texto.length()/2){
            return true;
        }else{
         
             if(texto.charAt(posicion) == texto.charAt(texto.length()-1-posicion)){  
                return palindromo(texto, posicion+1);
            }else{
                 //bandera = false;
                 return false;
             }
        }
    }
    
    
    public static void main(String Args[]){
        Scanner entrada = new Scanner(System.in);
        System.out.println("INGRESE UN TEXTO PARA ANALIZAR");
        String palabra = entrada.nextLine();
        if(palindromo(palabra,0)){
            System.out.println("LA PALABRA INGRESADA SI ES UN PALINDROMO");    
        }else{
            System.out.println("LA PALABRA INGRESADA NO ES UN PALINDROMO");    
        }
        
    }
    
}
