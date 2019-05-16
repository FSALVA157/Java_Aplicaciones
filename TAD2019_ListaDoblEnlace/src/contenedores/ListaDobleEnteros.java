package contenedores;

import contenedores.ListaDoble;
import javax.swing.JOptionPane;

public class ListaDobleEnteros extends ListaDoble {

    /*
    public ListaDobleEnteros() {
        super();
    }
     */
    @Override
    public void imprimeElemento(Object obj)    
    {
        System.out.print("[" + obj.toString() + "] --->");
    }

    

    @Override
    public int buscar(Object obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
