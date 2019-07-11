
package grafoLAD;

import grafoLAD.recursos.Arco;
import grafoNoDirigido.ConjuntoAbs;


public class ListaAdcia extends ConjuntoAbs {
private Arco arco;

  

    @Override
    public boolean esIgual(Object obj1, Object obj2) {
     return ((Arco)obj1).getDestino() == ((Arco)obj2).getDestino();
    }

    @Override
    public String imprime(Object obj) {
        return "[destino: " + ((Arco)(obj)).getDestino() + "| peso: " + ((Arco)(obj)).getPeso();
    }

}
