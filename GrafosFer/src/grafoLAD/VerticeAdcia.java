
package grafoLAD;
//este vertice es el elemento que tiene los datos del vertice y la lista de arcos(lista adcia)

import grafoDirigido.ListaDoble;
import grafoNoDirigido.ConjuntoAbs;

public class VerticeAdcia {
    private Object datos;
    private int orden;
    //pensando en que la lista Ady seria dinamica la defino como lista doble porque es mas facil de manejar
    //aunque por lógica se trataria de una lista simple
   ListaAdcia lad;    
    //constructor
    public VerticeAdcia(Object info){
        this.setDatos(info);
        this.setOrden(-1);
        this.lad = new ListaAdcia();
    }

    public Object getDatos() {
        return datos;
    }

    public void setDatos(Object info) {
        this.datos = info;
    }

    public int getOrden() {
        return orden;
    }

    public void setOrden(int orden) {
        this.orden = orden;
    }

    public ListaAdcia getListaAdy() {
        return lad;
    }

    public void setListaAdy(ListaAdcia listaAdy) {
        this.lad = listaAdy;
    }
    
    
    
}
