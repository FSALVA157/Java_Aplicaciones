
package pilaArray;

//solucion que usa la estructura pila para determinar si una expresion tiene equilibrio de parentesis
public class PilaParentesis extends clsPilaArr {
    
    //constructor
    public PilaParentesis(int tamano){
        super(tamano);
    }

    //metodo que analiza la expresion
    public boolean equilibrio(String exp) {
        int valor = 0;
        PilaParentesis pila = new PilaParentesis(exp.length());
        //introducir la expresion en una pila caracter a caracter de atras para adelante
        for(int i = exp.length() -1 ; i >= 0 ;i--){
            pila.meter(exp.charAt(i));
             }
        //evaluemos la expresion
        while ((!pila.estaVacia())&&(valor>=0)){
            char c = (Character)pila.sacar();
            if(c == '('){
                valor++;
            }
            if(c == ')'){
                valor--;
            }
        }
        
        if(valor < 0){
            return false;
        }else{
            return true;
        }
    }
    
}
