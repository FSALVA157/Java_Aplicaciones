
package grafoDirigido;


public class MatrizGrafo extends MatrizArr{
    
    public MatrizGrafo(int ordenGrafo){
        super(ordenGrafo,ordenGrafo);
    }
    
    //metodo que indica si existe conexion entre dos nodos analizando el valor de la posicion
    public boolean isConnected(int x, int y){
        boolean respuesta = false;
        if(x>=0 && x < this.getNroFilas() && y >= 0 && y < this.getNroColumnas()){
            if (this.matriz[x][y] != null){
                respuesta = true;
            }
        }
        return respuesta;
    }
    
    
}
