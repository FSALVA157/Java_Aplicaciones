

package maximoComunDivisor;

import java.util.Scanner;


public class MCDrecursivo {

public static int mcd(int op1,int op2){
    
    if((op1<0)||(op2<0)){
        op1 = Math.abs(op1);
        op2 = Math.abs(op2);
    }
    if(op1==0){
        return op2;
    }
    if(op2==0){
        return op1;
    }
    
    return mcd(op2,op1%op2);
}

public static void main (String Args[]){
    Scanner entrada = new Scanner(System.in);
    System.out.println("INGRESE EL PRIMER NUMERO");
    int a = entrada.nextInt();
    System.out.println("INGRESE EL SEGUNDO NUMERO");
    int b = entrada.nextInt();
    
    System.out.printf("MCD(%d,%d) = %d %n",a,b,mcd(a,b));
}    

}

