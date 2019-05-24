
package ej_cyber_lista_cola;


public class Laboratorio extends listaSimpleFer.Lista {

    @Override
    public boolean esIgual(Object obj1, Object obj2) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mostrar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
   public void actualizarEstado (){
       Pc compu = new Pc();
       if(!this.estaVacia()){
           int posicion = 0;
           while(posicion < this.tamanio()){
               compu = (Pc)this.seek(posicion);
               if(compu.isEstado()){
                   compu.setReloj(compu.getReloj()-1);
                   if(compu.getReloj() == 0){
                       compu.setEstado(false);
                       compu.setOperador("");
                   }
               }
               this.meter(compu, posicion);
           }
       }
   }
   public boolean buscarPc(Alumno op){
       boolean bandera = true;
       Pc compu = new Pc();
       int punt = 0;
       while((punt < this.tamanio())&& bandera){
           compu = (Pc)this.seek(punt);
           if(!compu.isEstado()){
               this.meter(op, punt);
               bandera = false;
           }
           punt++;
       }
       //si responde true si enconntro lugar si es falsa no lo logro
       return !bandera;
   }
}
