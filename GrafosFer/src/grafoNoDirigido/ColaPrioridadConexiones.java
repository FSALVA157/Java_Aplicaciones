
package grafoNoDirigido;


public class ColaPrioridadConexiones extends ColaAbs {

    @Override
    public boolean esIgual(Object obj1, Object obj2) {
        
        return (((Conexion)obj1).getConnectionCost() == ((Conexion)obj2).getConnectionCost())
                && (((Conexion)obj1).getVertexI() == ((Conexion)obj2).getVertexI())
                && (((Conexion)obj1).getVertexJ() == ((Conexion)obj2).getVertexJ());
    }

    @Override
    public boolean esMayorQue(Object obj1, Object obj2) {
        return (((Conexion)obj1).getConnectionCost() > ((Conexion)obj2).getConnectionCost());
                
    }

    @Override
    public boolean esMenorQue(Object obj1, Object obj2) {
        return (((Conexion)obj1).getConnectionCost() < ((Conexion)obj2).getConnectionCost());
    }

    @Override
    public void imprimir(Object obj) {
        Conexion arco;
        
        arco = (Conexion)(obj);
        System.out.println(arco.getVertexI() + "-------" + arco.getVertexJ() + " COSTO: " + arco.getConnectionCost());
        
    }
    
}
