
package practico_6_2019;
import colaDinamica.*;
import java.security.SecureRandom;
import jdk.nashorn.internal.codegen.CompilerConstants;
import recursos.*;
import pilaDinamica.pilaDinamica;

public class ColaTest extends Cola {
    
    //obtener el cardinal de una cola
    public static int cardinal(Cola cola){
        return cola.cardinal();
    }
            
    //invertir una cola
    public static void invertirCola(Cola cola){
        
        System.out.println("-----COLA ORIGINAL--------");
       cola.recorrer();
        pilaDinamica pila = new pilaDinamica();
        //vuelco la cola en una pila auxiliar
        while(!cola.estaVacia()){
            pila.meter(cola.sacar());
        }
        System.out.println("");
        //ahora vuelvo a formar una cola a partir de la pila auxiliar
        while(!pila.estaVacia()){
            cola.meter(pila.sacar());
        }
        System.out.println("-----COLA INVERTIDA--------");
        cola.recorrer();
    }
    
    public static void main(String Args[]){
         //voy a llenar una cola de forma aleatoria 
         SecureRandom ran = new SecureRandom();
         Cola stack = new Cola();
         for(int i = 0; i < 7;i++){
             int valor = 1 + ran.nextInt(99);
             stack.meter(valor);
          }
         System.out.println("el tamaño de la cola es: " + cardinal(stack));
         stack.recorrer();
         invertirCola(stack);
         
         
        
        
        
    }
    
}
