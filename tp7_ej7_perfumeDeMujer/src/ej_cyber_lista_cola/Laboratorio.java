
package ej_cyber_lista_cola;

import java.security.SecureRandom;
import java.time.ZonedDateTime;
import listaSimpleFer.Nodo;


public class Laboratorio extends listaSimpleFer.Lista {

    @Override
    public boolean esIgual(Object obj1, Object obj2) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    //este metodo en este caso no esta bien que deba ser implementado en esta capa pero estoy heredando y bueno :( (no sabia bien lo que hacia ;|)
    @Override
    public void mostrar() {
        Nodo punteroAux = this.getInicio();
        Pc terminal = new Pc();
        if (this.estaVacia()) {
            System.out.println("EL LABORATORIO NO TIENE COMPUTADORAS!!");
        } else {
            System.out.println("");
            while (punteroAux != null) {
                terminal = (Pc)punteroAux.getDato();
                System.out.print("[" + (terminal.isEstado()?"PC OCUPADA":"PC LIBRE") + " OPERADOR: " + terminal.getOperador() + "TIEMPO RESTANTE: " + String.valueOf(terminal.getReloj())+"] --->");
                punteroAux = punteroAux.getSiguiente();
            }
        }
    }
    
   public void actualizarEstado (){
       Pc compu = new Pc();
       if(!this.estaVacia()){
           int posicion = 0;
           System.out.println("al iniciar la actualizacion de relojes el tamaño es " + this.tamanio());
           while(posicion < this.tamanio()){
               compu = (Pc)this.seek(posicion);
               if(!compu.isEstado()){
                   compu.setReloj(compu.getReloj()-1);
                   if(compu.getReloj() == 0){
                       compu.setEstado(false);
                       compu.setOperador("");
                   }
                  this.reemplazar(compu, posicion);
               }
                             
               posicion++;
           }
       }else{
           System.out.println("NADA QUE ACTUALIZAR LA LISTA ESTA VACIA");
       }
   }
   public boolean buscarPc(Alumno op){
       boolean bandera = true;
       Pc compu = new Pc();
       int punt = 0;
       ZonedDateTime fechaHora = ZonedDateTime.now();
       while((punt < this.tamanio())&& bandera){
           compu = (Pc)this.seek(punt);
           if(!compu.isEstado()){
               System.out.println("ESTA POR OCUPAR LA COMPUTADORA NUMERO: " + punt);
               compu.setEstado(true);
               compu.setOperador(op.getNombre());
               bandera = false;
               //voy a calcular el tiempo de ocupacion
               SecureRandom dado = new SecureRandom();
               int time = 30 + dado.nextInt(30);
               compu.setReloj(time);
               this.reemplazar(compu, punt);
               //voy a imprimir para la respuesta del problema
               System.out.printf("* USUARIO: %s ---- HORA DE LLEGADA: %tc --- TIEMPO: %d \n",compu.getOperador(),fechaHora,compu.getReloj());
           }
           punt++;
       }
       //si responde true si enconntro lugar si es falsa no lo logro
       return !bandera;
   }
}
