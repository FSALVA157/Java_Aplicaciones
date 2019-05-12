
package practico_6_2019;

//utilizando la pila dinamica dare solucion correcta al problema del string con parentesis

import java.util.Scanner;
import pilaDinamica.pilaDinamica;
import recursos.*;

public class Parentesis extends pilaDinamica{
    
    //metodo balanceo que evalua la cadena de texto
    public static boolean balanceo(String frase){
     pilaDinamica pila = new pilaDinamica();
     pilaDinamica pilaAux = new pilaDinamica();
     boolean bandera = true;
     for(int i = frase.length()-1; i >= 0 ;i--){
         pila.meter(frase.charAt(i));
     }
     
     while((bandera)&&(!pila.estaVacia())){
         String caracter = pila.sacar().toString();
         if(caracter.equals(")")){
             if(!pilaAux.estaVacia()){
                 pilaAux.sacar();
             }else{
                 bandera = false;
             }
          }
          if(caracter.equals("(")){
                     pilaAux.meter(caracter);
                     }
     }
     return bandera;
     
     
    }
    
    public static void main(String Args[]){
        Scanner entrada = new Scanner(System.in);
        System.out.println("INGRESE LA FRASE PARA ANALIZAR");    
        String cadena = entrada.nextLine();
        if(balanceo(cadena)){
            System.out.println("LA FRASE ESTA BALANCEADA");
        }else{
            System.out.println("LA FRASE NO ESTA BALANCEADA");
        }
    }
    
    
    
}
