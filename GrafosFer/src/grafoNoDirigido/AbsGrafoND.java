
package grafoNoDirigido;

import grafoDirigido.ListaDoble;


public abstract class AbsGrafoND extends AbsGrafo implements IGrafoND {

    public AbsGrafoND(int ordenGrafo) {
        super(ordenGrafo);
    }

    @Override
    public void cargarGrafo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void muestraGrafo() {
        double currCost;
		for (int i=0; i<getOrden();i++){
			for (int j=i+1; j<getOrden();j++){				
				currCost=(double)this.matrizCosto.seek(i, j);
				if (currCost!=infinito){
					System.out.println("costo " + i + " a " + j + "->" + currCost);
				}								
			}			
		}		
    }
    
    public void Prim(int vertex){
        ListaDoble listaMenorCosto = new ListaDoble();
        ListaDoble listaMasCercano = new ListaDoble();
        double currCost, minCost, newCost;
        int w, minVertex;
        
        for(int i = 0; i < this.getOrden(); i++){
            listaMenorCosto.meter(this.matrizCosto.seek(vertex, i), i);
            listaMasCercano.meter(vertex, i);
        }
        
        for(int i = 1; i < this.getOrden(); i++){
            minCost = infinito;
            minVertex = -1;
            for(int j = 0; j < this.getOrden(); j++){
                if(j != vertex){
                    currCost = (double) listaMenorCosto.seek(j);
                    if(currCost < minCost){
                        minCost = currCost;
                        minVertex = j;
                    }
                    
                }
            }
            
        }
        
        
    }

    @Override
    public void muestraPrim(int k) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void muestraKruskal() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
