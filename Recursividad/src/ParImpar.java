
import java.util.Scanner;



public class ParImpar {

public static boolean par(int n){
    if(n==0){
        return true;
    }else{
        return impar(n-1);
    }
}

public static boolean impar(int m){
    if(m==0){
        return false;
    }else{
        return par(m - 1);
    }
}

public static void main(String Args[]){
    Scanner entrada = new Scanner(System.in);
    System.out.println("INGRESE UN NUMERO");
    int numero = entrada.nextInt();
    if(par(numero)){
        System.out.println("EL NUMERO ES PAR");
    }else{
        System.out.println("EL NUMERO ES IMPAR");
    }
}
    
}
