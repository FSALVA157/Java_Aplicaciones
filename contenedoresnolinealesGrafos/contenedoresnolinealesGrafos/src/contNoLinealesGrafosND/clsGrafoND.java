package contNoLinealesGrafosND;

import java.util.Scanner;

public class clsGrafoND extends clsAbsGrafoND{
	public clsGrafoND(int ordenGrafo){
		super(ordenGrafo);
	}
	
	public void cargaGrafo(){
		double currCost;		
		Scanner scanner = new Scanner(System.in);
		
		for (int i=0; i<getOrden();i++){
			for (int j=i;j<getOrden();j++){
				if (i!=j){
					System.out.println("Ingrese costo[" + i + "," + j + "] (sino -1)");
					currCost=scanner.nextDouble();
					if (currCost!=-1){
						this.matrizCosto.actualiza(currCost, i, j);
						this.matrizCosto.actualiza(currCost, j, i);
					}else{
						this.matrizCosto.actualiza(infinito, i, j);
						this.matrizCosto.actualiza(infinito, j, i);
					}					
				}else{
					this.matrizCosto.actualiza(infinito, i, j);
				}
			}
		} 
   	
	}
}