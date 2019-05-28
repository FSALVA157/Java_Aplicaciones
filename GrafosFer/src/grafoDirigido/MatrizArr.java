
package grafoDirigido;


public class MatrizArr {
    protected int nroFilas;
    protected int nroColumnas;
    protected Object[][] matriz;
    
    public MatrizArr(int filas, int columnas){
        this.nroFilas = filas;
        this.nroColumnas = columnas;
        matriz = new Object[this.nroFilas][this.nroColumnas];
        
    }

    public int getNroFilas() {
        return nroFilas;
    }

   
    public int getNroColumnas() {
        return nroColumnas;
    }

    public void limpiaMatriz(){
        for(int i = 0; i < this.getNroFilas();i++){
            for(int j = 0; j < this.getNroColumnas();j++){
                this.matriz[i][j] = null;
            }
        }
    }
    
    public void actualizaElemento(Object dato,int x,int y){
        if(x >= this.getNroFilas() || x < 0 ){
            System.out.println("LA POSICION DE LA FILA NO EXISTE");
        }else{
            if(y >= this.getNroColumnas() || y < 0){
                System.out.println("LA POSICION DE COLUMNA NO EXISTE");
            }else{
                this.matriz[x][y] = dato;
            }
        }
        
    }
    
    public Object seek(int x, int y){
        Object objAux = null;
        if(x >= this.getNroFilas() || x < 0 ){
            System.out.println("LA POSICION DE LA FILA NO EXISTE");
        }else{
            if(y >= this.getNroColumnas() || y < 0){
                System.out.println("LA POSICION DE COLUMNA NO EXISTE");
            }else{
                objAux = this.matriz[x][y];
            }
        }
    return objAux;
    }
    
    
}
