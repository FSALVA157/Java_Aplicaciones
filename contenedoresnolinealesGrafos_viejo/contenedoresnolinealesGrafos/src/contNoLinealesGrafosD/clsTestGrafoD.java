package contNoLinealesGrafosD;
import java.util.Scanner;

public class clsTestGrafoD {
	
	public static void main(String[] args) {
		clsGrafoDirigido grafo;
		int grado,i,j;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Ingrese orden grafo ");
		grado=scanner.nextInt();
		if (grado>0){
			grafo=new clsGrafoDirigido(grado);
			grafo.cargaGrafo();
			grafo.muestraGrafo();
			grafo.muestraDijkstra(0); // lo hare con vertice inicial
			//grafo.muestraBPF();
			//grafo.muestraFloyd();
			
						
		} else{
			System.out.println("Error carga inicial grafo.");
		}
	}

}



