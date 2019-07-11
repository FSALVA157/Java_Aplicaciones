
package grafoLAD;

//voy a implementar la lista de vertices con una lista doble 

import grafoLAD.recursos.VerticeAdcia;
import grafoLAD.contenedores.Persona;
import grafoDirigido.ListaDoble;
import grafoNoDirigido.ConjuntoAbs;

public class GrafoAdcia extends ConjuntoAbs{
    Persona persona;   
    VerticeAdcia vertice;

    @Override
    public boolean esIgual(Object obj1, Object obj2) {
        
    }

    @Override
    public String imprime(Object obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public VerticeAdcia getVertice() {
        return vertice;
    }

    public void setVertice(VerticeAdcia vertice) {
        this.vertice = vertice;
    }
    
    
    
}
