
package recursividad;

import java.security.SecureRandom;



public class SumaMatriz {
    
    //metodo que suma una matriz
    public static int SumaVector(int [][] fila,int posx,int posy){
        if (posy >= fila[posx].length){
            return 0;
        }else{
            return SumaVector(fila,posx,posy+1) + fila[posx][posy];
        }
    }
    
    public static int SumaMatriz(int[][] matriz,int p){
        if(p >= matriz.length){
            return 0;
        }else{
            return SumaVector(matriz,p,0) + SumaMatriz(matriz, p+1);
        }
    }
    
    public static void main(String Args[]){
        
        int[][] vector = new int[3][3];
        SecureRandom numAl = new SecureRandom();
        for (int i = 0; i < vector.length;i++){
            for(int j = 0; j < vector[i].length; j++){
                vector[i][j] = 1 + numAl.nextInt(100);
            }
            
        }
        for(int[] fila : vector){
            for(int num : fila ){
            System.out.printf(" %d - ",num);
            }
            System.out.println("");
        }
        System.out.println("");
        System.out.printf("LA SUMA DE LA MATRIZ ES %d",SumaMatriz(vector, 0));
        
    }
    
}
