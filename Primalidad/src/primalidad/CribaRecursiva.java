
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
            int p = 2;
          while(Recorrer(listado, p) != 0){
              p=Recorrer(listado,Recorrer(listado, p));
          }      
            System.out.println("");
            LeerLista(listado);
        }
               
        
    }//fin cribar
    
    public static int Recorrer(Boolean[] list, int posicion){
        if(posicion > list.length){
            return 0;
        }else{
            
            if(list[posicion]){
                int j=2;
                j = j*posicion;
                while(j<=list.length){
                    if(list[j]){
                        list[j] = false;
                    }
                    j = ++j*posicion;
                }
                
                
               /* for(int j=posicion + 1;j <=list.length;j=j*posicion){
                    list[j] = false;
                }*/
            }
        
        }
        return posicion++;
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
