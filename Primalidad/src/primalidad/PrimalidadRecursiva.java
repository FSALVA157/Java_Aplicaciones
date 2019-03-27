
package primalidad;

import java.util.Scanner;


public class PrimalidadRecursiva {

public static Boolean Primalidad(int numero) {
		int ls = (int)(Math.sqrt(numero));
		Boolean bandera = true;
		
			bandera = Calculo(2,ls,numero);
			return bandera;
		
		
		
		
	}
	
	public static Boolean Calculo(int li,int ls,int numero) {
		Boolean respuesta = true;
		if(li <= ls) {
			respuesta = numero % li == 0? false:Calculo(li+1,ls,numero);
			
		}
		return  respuesta;
	}
	
	
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("INGRESE UN NUMERO PARA ANALIZAR PRIMALIDAD");
		int n = entrada.nextInt();
		if(Primalidad(n)) {
			System.out.println("EL NUMERO SI ES PRIMO");
		}else {
			System.out.println("EL NUMERO NO ES PRIMO");
		}
		

	}


    
}
