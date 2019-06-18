
package grafoDirigido;

import java.util.Scanner;



public class GrafoDirigido extends AbsGrafoD{
    
    public GrafoDirigido(int ordenGrafo){
        super(ordenGrafo);
    }

    @Override
    public void cargaGrafo() {
        double currCost;
        Scanner entrada = new Scanner(System.in);     
        System.out.println("INGRESE EL PESO DE LA ARISTA (si no existe enlace ingrese -1)");
        for(int i = 0; i < this.getOrden(); i++){
            
            for(int j = 0; j < this.getOrden(); j++){
                if(i != j){
                    //System.out.println("INGRESE EL PESO DE LA ARISTA PARA [" + i + "," + j + "] (si no existe enlace ingrese -1)");
                    currCost = entrada.nextDouble();
                    if(currCost != -1){
                        this.matrizCosto.actualizaElemento(currCost, i, j);
                    }else{
                        this.matrizCosto.actualizaElemento(infinito, i, j);
                    }
                }else{
                     this.matrizCosto.actualizaElemento(infinito, i, j);
                }
            }
        }
    }
    
  
    
    
}
