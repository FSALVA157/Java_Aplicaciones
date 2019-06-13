
package grafoNoDirigido;


public class Conexion {
    int vertexI, vertexJ;
    double connectionCost;
    
    public Conexion(int vertexI,int vertexJ,double connectionCoast){
        this.vertexI = vertexI;
        this.vertexJ = vertexJ;
        this.connectionCost = connectionCoast;
    }

    public int getVertexI() {
        return vertexI;
    }

    public int getVertexJ() {
        return vertexJ;
    }

    public double getConnectionCost() {
        return connectionCost;
    }
    
    
}
