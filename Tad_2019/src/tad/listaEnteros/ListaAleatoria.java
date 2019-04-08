//clase que utiliza la lista enlazada de enteros
package tad.listaEnteros;

import java.util.Random;


public class ListaAleatoria {//inicio clase principal
    
    public static void main(String Args[]){
        Random r;
        int d;
        Lista lista;
        int tamanio;
        
        r = new Random();
        lista = new Lista();
        tamanio = Math.abs(r.nextInt()%55);//el tamaño de la lista nunca sera mayor a 55
        
        //insertar elementos aleatorios a la lista
        for(;tamanio > 0; tamanio--){
            lista.insertarCabezaLista(r.nextInt()%99);
            
        }   
        //recorrer la lista
        lista.visualizar();
        
        //insertar al final de la lista
        
                
                
        
    }
    
    
}//fin clase principal
