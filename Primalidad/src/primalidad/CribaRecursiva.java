
package primalidad;

import java.util.*;


public class CribaRecursiva {
    
    public static void Cribar(int lsuperior){//inico cribar
        Boolean[] listado = new Boolean[lsuperior + 1];
        Arrays.fill(listado,true);
        LeerLista(listado);
        if(lsuperior < 2){
            Arrays.fill(listado,false);
            
        }else{
            int m = 0;
          //while(p != 0){
               Recorrer(listado,2);
              
         // }      
            System.out.println("");
            LeerLista(listado);
        }
               
        
    }//fin cribar
    
    public static void Recorrer(Boolean[] list, int posicion){
        System.out.printf("valor de posicion: %d",posicion);
        if(posicion > list.length-1){
            System.out.println("Saliendo de bucle");
            return;
        }else{
            System.out.printf("valor de l[%d]: %b %n",posicion,list[posicion]); 
            if(list[posicion]){
                int j=2;
                int k = j*posicion;
                while(k < list.length){
                    if(list[k]){
                        list[k] = false;
                    }
                    j++;
                    k = j*posicion;
                }
                
                
               /* for(int j=posicion + 1;j <=list.length;j=j*posicion){
                    list[j] = false;
                }*/
            }
            posicion++;
            Recorrer(list,posicion);
        }
     
    }
    
    public static void LeerLista(Boolean[] lista){
        System.out.println("");
        for(int i = 2; i < lista.length;i++){
            if(lista[i]){
                System.out.printf(" elemento[%d] = %b , ",i,lista[i]);
            }
        }
    }
    
    public static void main(String Args[]){
        Scanner entrada = new Scanner(System.in);
        System.out.println("INGRESE EL RANGO POR FAVOR");
        int ls = entrada.nextInt();
        Cribar(ls);
    }
    
}
