package grafoDirigido;

import java.util.Scanner;

public class TestGrafoD {

    public static void main(String[] Args) {
        int grado, j, i;
        GrafoDirigido grafo;

        Scanner entrada = new Scanner(System.in);
        System.out.println("INGRESE EL ORDEN DEL GRAFO POR FAVOR");
        grado = entrada.nextInt();
        if (grado > 0) {
            grafo = new GrafoDirigido(grado);
            grafo.cargaGrafo();
            grafo.muestraGrafo();
            grafo.muestraDijkstra(0);
         //  grafo.muestraFloyd();
     //    grafo.muestraBPF();
        } else {
            System.out.println("ERROR: EL ORDEN DEL GRAFO DEBE SER POSITIVO");
        }

    }

}
