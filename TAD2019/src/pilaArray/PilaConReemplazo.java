
package pilaArray;

//solucion al problema de cambiar un elemento por otro en una pila de enteros
public class PilaConReemplazo extends clsPilaArr{
    
    //constructor
    public PilaConReemplazo (int tam){
        super(tam);
    }    
    
    //metodo que recorre la pila de enteros
    public void recorrePila(PilaConReemplazo pila){
        Integer numero;
        PilaConReemplazo pilaAux = new PilaConReemplazo(pila.getTamano());
        try {
            while(!pila.estaVacia()){
                numero = (Integer)(pila.sacar());
                pilaAux.meter(numero);
                System.out.print(numero + "==> ");
            }
            //retorno la pila original a su estado inicial
            while(!pilaAux.estaVacia()){
                pila.meter(pilaAux.sacar());
            }
        } catch (Exception e) {
                System.err.println(e);
        }
        
            
        
    }
    
    
    //metodo que efectua la operacion reemplazo
    public void reemplazar(PilaConReemplazo pila, int nuevo, int viejo){
        clsPilaArr pilaAux = new clsPilaArr(pila.getTamano());
        boolean bandera = true;
        while(bandera || !pila.estaVacia()){
            if((int)pila.seek() == viejo){
                pila.sacar();
                pila.meter(nuevo);
                bandera = false;
        
            }else{
                pilaAux.meter(pila.sacar());
            }
        }
        
                
        if(!bandera){
            System.out.println("SE HA EFECTUADO EL REEMPLAZO CON EXIT0");
        }else{
            System.out.println("EL ELEMENTO BUSCADO NO EXISTE EN LA PILA");
        }
                while(!pilaAux.estaVacia()){
                    pila.meter(pilaAux.sacar());
                }
    }
    
    
    
}
