
package primalidad;

import java.util.*;


public class CribaRecursiva {
    
    public static void Cribar(int lsuperior){//inico cribar
        Boolean[] listado = new Boolean[lsuperior + 1];
        Arrays.fill(listado,true);
        LeerLista(listado);
        if(lsuperior < 2){
            return;
        }else{
            
          //while(p != 0){
              Recorrer(listado,2);
         // }      
            System.out.println("");
            LeerLista(listado);
        }
               
        
    }//fin cribar
    
    public static void Recorrer(Boolean[] list, int posicion){
        if(posicion > list.length){
            return;
        }else{
            
            if(list[posicion]){
                int j=2;
                int k = j*posicion;
                while(k <= list.length){
                    if(list[k]){
                        list[j] = false;
                    }
                    k = (j+1)*posicion;
                }
                
                
               /* for(int j=posicion + 1;j <=list.length;j=j*posicion){
                    list[j] = false;
                }*/
            }
            Recorrer(list,posicion+1);
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
