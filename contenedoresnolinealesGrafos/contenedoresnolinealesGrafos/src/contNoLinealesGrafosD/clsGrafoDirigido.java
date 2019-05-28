package contNoLinealesGrafosD;

import java.util.Scanner;

public class clsGrafoDirigido extends clsAbsGrafoD{
	public clsGrafoDirigido(int ordenGrafo){
		super(ordenGrafo);
	}
	
	public void cargaGrafo(){
		double currCost;		
		Scanner scanner = new Scanner(System.in);
		
		for (int i=0; i<getOrden();i++){
			for (int j=0;j<getOrden();j++){
				if (i!=j){
					System.out.println("Ingrese costo[" + i + "," + j + "] (sino -1)");
					currCost=scanner.nextDouble();
					if (currCost!=-1){
						this.matrizCosto.actualiza(currCost, i, j);	
					}else{
						this.matrizCosto.actualiza(infinito, i, j);
					}					
				}else{
					this.matrizCosto.actualiza(infinito, i, j);
				}
			}
		} 
   	
	}
}
