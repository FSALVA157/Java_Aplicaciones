//calculo del mcm de varios numeros utilizando mcd y agrupamiento de a dos
package maximoComunDivisor;


public class MCMmultiple {//inicio clase principal
    
    public static int McmMul(int [] secuencia){
        int i =0;
        while(i+2<=secuencia.length){
            CalculaMCM(secuencia[i], CalculaMCM(secuencia[i+1], i))
        }
    }
    
    //voy a realizar una pequeña modificacion al metodo que devuelve mcm de dos numeros para que tenga condicion de recursividad
    public static int CalculaMCM(int operador1,int operador2){//inicio calculaMCM
        if (operador2 < 0){
            return operador1;
        }else{
            int mcd = MCDrecursivo.mcd(operador1, operador2);
            return (operador1*operador2)/mcd;
        }
    }//fin calculaMCM
    
}//fin clase principal
