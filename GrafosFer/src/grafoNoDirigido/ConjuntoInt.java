
package grafoNoDirigido;


public class ConjuntoInt extends ConjuntoAbs{

    @Override
    public boolean esIgual(Object obj1, Object obj2) {
        return (int)obj1 == (int)obj2;
    }

   

    @Override
    public String imprime(Object obj) {
         return obj.toString();
    }
    
}
