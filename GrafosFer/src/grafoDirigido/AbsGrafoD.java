package grafoDirigido;



public abstract class AbsGrafoD implements TADGrafoD {

    protected int ordenGrafo;
    protected MatrizGrafo matrizCosto, matrizCostoF, matrizCaminoF;
    static final double infinito = 10000.0;
    protected ListaDoble listaSolucion, listaCamino, listaDistancia;
    
    public AbsGrafoD(int ordenGrafo) {
        this.ordenGrafo = ordenGrafo;
        this.matrizCosto = new MatrizGrafo(this.ordenGrafo);
    }

    @Override
    public abstract void cargaGrafo();

    @Override
    public int getOrden() {
        return this.ordenGrafo;
    }

    //trabajare sobre dijkstra
    private void Dijkstra(int startVertex) {
        double minCost, currCost, arcCost;
        int minVertex, vertex;

        this.listaSolucion = new ListaDoble();
        this.listaCamino = new ListaDoble();
        this.listaDistancia = new ListaDoble();

        //iniciar las listas
        for (int i = 0; i < this.getOrden(); i++) {
            this.listaSolucion.meter(-1, i);
            this.listaCamino.meter(-1, i);
            this.listaDistancia.meter(infinito, i);
        }

        //establecer el primer nodo del camino
        this.listaSolucion.actualiza(startVertex, 0);

        //primer vuelta adonde se establecen los valores saliendo del vertice inicial
        for (int i = 0; i < this.getOrden(); i++) {
            if (i != startVertex) {
                this.listaCamino.actualiza(startVertex, i);
                this.listaDistancia.actualiza(this.matrizCosto.seek(startVertex, i), i);
            }
        }

        //ahora empiezo a saltar por los siguientes niveles del grafo
        for (int i = 1; i < this.getOrden(); i++) {
            minVertex = -1;
            minCost = infinito;

            for (int w = 0; w < this.getOrden(); w++) {
                
                if (w != startVertex) {
                    
                    vertex = (int) listaSolucion.seek(w);
                    currCost = (double) listaDistancia.seek(w);
                    if ((vertex == -1) && (currCost < minCost)) {
                        
                        minVertex = w;
                        minCost = currCost;
                        
                    }
                }
            }
                System.out.println("it " + i + " minVertex " + minVertex + " minCost " + minCost);

                this.listaSolucion.actualiza(minVertex, minVertex);
                this.listaDistancia.actualiza(minCost, minVertex);

                for (int v = 0; v < this.getOrden(); v++) {
                    vertex = (int) this.listaSolucion.seek(v);
                    if (vertex == -1) {
                        currCost = (double) this.listaDistancia.seek(v);
                        
                        arcCost = (double) this.matrizCosto.seek(minVertex, v);
                        if (minCost + arcCost < currCost) {
                            this.listaCamino.actualiza(minVertex, v);
                            this.listaDistancia.actualiza(minCost + arcCost, v);
                        }

                    }
                }

            
        }

    }

    //metodo que utiliza dijkstra para generar y mostrar la solucion
    @Override
    public void muestraDijkstra(int startVertex) {
        double currCost;
        int w;

        Dijkstra(startVertex);
        for (int v = 0; v < this.getOrden(); v++) {
            System.out.println("vertice " + v);
            if (v != startVertex) {
                currCost = (double) this.listaDistancia.seek(v);
                System.out.println("costo desde " + startVertex + " a " + v + "->" + currCost);
                System.out.println("mostrando un camino desde " + v + " a " + startVertex);

                w = (int) this.listaCamino.seek(v);//busco el primer vertice que me lleva al destino
                //aqui empiezo a desandar el camino
                do {
                    System.out.println("camino " + w);
                    w = (int) this.listaCamino.seek(w);
                } while (w != -1);//recordemos que el unico que tiene valor -1 en la lista es el vertice origen o sea startVertex

            }

        }

    }

    public void bea(ListaDoble listaMarca,int v){
        boolean marca;
        double currentCoast;
        ColaSimple cola = new ColaSimple();
        int w;
        
        listaMarca.actualiza(true, v);
        System.out.println("vertice" + v);        
        cola.meter(v);
        
        while(!cola.estaVacia()){
            
        }
        
    }
    
    @Override
    public void muestraBEA() {
        ListaDoble listaMarca = new ListaDoble();
        boolean marca;
        
        for(int v = 0 ; v < this.getOrden(); v++){
            listaMarca.meter(false, v);
        }
        
        for(int w = 0; w < this.getOrden(); w++){
            marca = (boolean)listaMarca.seek(w);
            if(!marca){
                bea(listaMarca,w);
            }
        }
                
    }

    
    public void bpf(ListaDoble listaMarca,int v) {
        double currCost;
        boolean marcado;
        
        //la lista ya viene llenada con falsos
        //comienzo el recorrido marcando la posicion del vector a verdadero
        listaMarca.actualiza(true, v);
        System.out.println("VERTICE:" + v);
        for(int w = 0; w < this.getOrden(); w++){
            marcado = (boolean)listaMarca.seek(w);
            currCost = ((Number)this.matrizCosto.seek(v, w)).doubleValue();
            if((currCost != infinito)&&(!marcado)){
                bpf(listaMarca, w);
            }
        }
      }
    
     @Override
    public void muestraBPF() 
    {
        boolean marca;
        ListaDoble listaMarca = new ListaDoble();
        
        //llenar la lista de falsos
        for(int v=0; v < this.getOrden(); v++){
            listaMarca.meter(false, v);
        }
        
        for(int v=0; v < this.getOrden(); v++){
           if(!(boolean)listaMarca.seek(v)){
                bpf(listaMarca, v);
           }
        }
    }
    

    @Override
    public void muestraFloyd() {
        this.matrizCostoF = new MatrizGrafo(this.getOrden());
        this.matrizCaminoF = new MatrizGrafo(this.getOrden());
        //voy a volcar la matriz de costo original en la nueva matriz para floyd
        //tambien voy a llenar la matriz de camino de floyd con -1 (valor del propio arco)
        for (int i = 0; i < this.getOrden(); i++) {
            for (int j = 0; j < this.getOrden(); j++) {
                matrizCostoF.actualizaElemento(matrizCosto.seek(i, j), i, j);
                matrizCaminoF.actualizaElemento(-1, i, j);
            }
        }
        //vamos a llenar la diagonal de ceros
        for(int w = 0; w < this.getOrden(); w++){
            this.matrizCostoF.actualizaElemento(0, w, w);
        }
        
        //verifiquemos el estado de las dos matrices
        System.out.println("------------La matriz de costos inicial para floyd es----------");
        this.matrizCostoF.recorrerMatriz();
        System.out.println("----------------------");
        System.out.println("------------La matriz de caminos inicial para floyd es----------");
        this.matrizCaminoF.recorrerMatriz();
        System.out.println("----------------------");
        //ahora empieza el corazon del algoritmo
              
        //ahora debo recorrer las filas y columnas parado en el nodo k y comparar los costos de su suma y el actual
        for (int k = 0; k < this.getOrden(); k++) {
            for (int i = 0; i < this.getOrden(); i++) {
                for (int j = 0; j < this.getOrden(); j++) {
                  
                    if(((Number)this.matrizCostoF.seek(k, j)).doubleValue() + ((Number)this.matrizCostoF.seek(i,k)).doubleValue() < ((Number) this.matrizCostoF.seek(i, j)).doubleValue()){
                        this.matrizCostoF.actualizaElemento(((Number)this.matrizCostoF.seek(k, j)).doubleValue() + ((Number)this.matrizCostoF.seek(i,k)).doubleValue(), i, j);
                        this.matrizCaminoF.actualizaElemento(new Integer(k), i, j);
                    }

                }
            }
        }
         System.out.println("------------MATRIZ SOLUCION PARA FLOYD----------");
        this.matrizCostoF.recorrerMatriz();
        System.out.println("----------------------");
        System.out.println("------------MATRIZ DE CAMINOS SOLUCION PARA FLOYD----------");
        this.matrizCaminoF.recorrerMatriz();
        System.out.println("----------------------");

    }
    public void buscaCaminoFloyd(int i,int j){
        Object valor = null;
        if (((Number)matrizCaminoF.seek(i, j)).intValue() != -1){
            int k = ((Number)matrizCaminoF.seek(i, j)).intValue();
            buscaCaminoFloyd(i, k);
            System.out.print("" + k);
            buscaCaminoFloyd(k, j);
        }
    }
    
    public void muestraCaminoFloyd(int origen, int destino){
        System.out.print("camino entre " + origen + " y " + destino + ":");
        System.out.print(origen);
        buscaCaminoFloyd(origen, destino);
        System.out.print(" " + destino);
        System.out.println("");
    }

    @Override
    public void muestraGrafo() {
        double currCost;
        for (int i = 0; i < this.getOrden(); i++) {
            for (int j = 0; j < this.getOrden(); j++) {
                currCost = (double) this.matrizCosto.seek(i, j);
                if (currCost != infinito) {
                    System.out.println("costo " + i + " a " + j + "->" + currCost);
                }
            }
        }
    }

}
