package contNoLinealesGrafosND;
import java.util.Scanner;


public class clsTestGrafoND {
	public static void main(String[] args) {		
		clsGrafoND grafo;
		int grado;		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Ingrese orden grafo ");
		grado=scanner.nextInt();
		if (grado>0){
			grafo=new clsGrafoND(grado);
			grafo.cargaGrafo();
			grafo.muestraGrafo();
			grafo.muestraPrim(0);
			//grafo.muestraBEA();
			//grafo.muestraKruskal();
			//grafo.muestraDijkstra(0);
		} else{
			System.out.println("Error carga inicial grafo.");
		}
	}

}
