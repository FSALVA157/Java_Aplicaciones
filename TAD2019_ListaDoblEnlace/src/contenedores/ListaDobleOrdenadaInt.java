
package contenedores;

import contenedores.ListaDobleOrdenada;
import javax.swing.JOptionPane;


public class ListaDobleOrdenadaInt extends ListaDobleOrdenada{

    @Override
    public boolean esIgual(Object obj1, Object obj2) {
        if (((Integer)obj1).intValue()==((Integer)obj2).intValue()){
			return true;
		}else {
			return false;
		}
    }

    @Override
    public boolean esMayorQue(Object obj1, Object obj2) {
        return ((int)obj1 > (int)obj2);
    }

    @Override
    public boolean esMenorQue(Object obj1, Object obj2) {
      return ((int)obj1 < (int)obj2);
    }

    @Override
    public void imprimeElemento(Object obj) {
        System.out.print("[" + obj.toString() + "] --->");
    }
    
    
    
    
    
    
}//fin clase principal
