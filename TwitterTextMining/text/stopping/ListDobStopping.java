
package stopping;

import contenedores.ListaDoble;


public class ListDobStopping extends ListaDoble {

    //el metodo buscar adaptado para el stopping recibira un string que sera el archivo de stopwords y buscara si el nodo esta contenido
    //devolviendo la posicion para limpieza
    @Override
    public int buscar(Object obj) {
       throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void imprimeElemento(Object obj) {
        System.out.printf("[ %s ]<-->", obj.toString());
    }
    
    public boolean esStopWord(int posicion,String stopWords){
        String palabra = this.seek(posicion).toString();
        return stopWords.contains(palabra);
    }
    
    public void limpiarStopWords(String stopWords){
        if(!this.estaVacia()){
            int i = 0;
            //String palabra;
            while(i < this.tamanio()){
                //palabra = this.seek(i).toString();
                if(esStopWord(i, stopWords)){
                    this.pop(i);
                }else{
                    i++;
                }
            }
        }else{
            System.out.println("LA LISTA ESTA VACIA");
        }
        
    }
    
    
    
     
}
