
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
    
    public static void concatenarColas(Cola cola1,Cola cola2){
        //voy a concatenar cola2 a continuacion de cola 1
        System.out.println("-----COLA 1 ORIGINAL ---");
        cola1.recorrer();
        System.out.println("-----COLA 2 ORIGINAL ---");
        cola2.recorrer();
        while(!cola2.estaVacia()){
            cola1.meter(cola2.sacar());
    }
        System.out.println("-----COLA CONCATENADA---");
        cola1.recorrer();
    }
    
    
    
    public static void main(String Args[]){
         //voy a llenar una cola de forma aleatoria 
         SecureRandom ran = new SecureRandom();
         Cola stack = new Cola();
         Cola stack2 = new Cola();
         for(int i = 0; i < 7;i++){
             int valor = 1 + ran.nextInt(99);
             stack.meter(valor);
          }
         
         for(int i = 0; i < 3;i++){
             int valor = 1 + ran.nextInt(99);
             stack2.meter(valor);
          }
        concatenarColas(stack, stack2);
         
         /*
         System.out.println("el tamaño de la cola es: " + cardinal(stack));
         //stack.recorrer();
         invertirCola(stack);
         */
         
        
        
        
    }
    
}
