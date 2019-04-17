
package recursividad;
import java.security.SecureRandom;

public class DigitosRecursivo {

public static int ContarDigitos(int n){
    if(n < 10){
        return 1;
    }else{
        return ContarDigitos(n/10) + 1;
    }
    
}

public static void main(String Args[]){
     SecureRandom n = new SecureRandom();
    
     for(int i = 0;i < 10;i++){
         int valor = 10+ n.nextInt(10000);
         System.out.printf(" %d - tiene: %d digitos %n",valor,ContarDigitos(valor));
         
     }
}
    
}
