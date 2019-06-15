
package grafoLAD;

//en esta clase estan los componentes de la lista de adyacencia
public class Arco {
    int destino;
    double peso;
    
    public Arco(int verticeD, double costo){
        this.setDestino(verticeD);
        this.setPeso(costo);
    }

    public int getDestino() {
        return destino;
    }

    public void setDestino(int destino) {
        this.destino = destino;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
    
    
    
}
