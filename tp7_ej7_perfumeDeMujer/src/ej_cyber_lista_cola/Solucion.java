
package ej_cyber_lista_cola;

import java.security.SecureRandom;
import javax.swing.JOptionPane;


public class Solucion {
    
    public static void main(String Args[]){
        ColaDeAlumnos filaDeEspera = new ColaDeAlumnos();
        Laboratorio labo = new Laboratorio();
        Alumno estudiante = new Alumno();
        Pc compu = new Pc();
        for(int i = 0; i < 600; i++){
            SecureRandom moneda = new SecureRandom();
            int dado = 1 + moneda.nextInt(100);
            boolean llegada = (dado < 16)? true: false;
            if(llegada){
                JOptionPane.showMessageDialog(null, "HA INGRESADO UN ALUMNO AL LABORATORIO DEBE LLENAR EL REGISTRO CON SUS DATOS", "REGISTRO DE ALUMNO", 3);
                int dni = Integer.parseInt(JOptionPane.showInputDialog("INGRESE EL DNI DEL ESTUDIANTE"));
                String nombre = JOptionPane.showInputDialog("INGRESE EL NOMBRE DEL ESTUDIANTE");
                estudiante.setDni(dni);
                estudiante.setNombre(nombre);
                if (labo.buscarPc(estudiante)){
                    
                }
            }
            
        }
    }
    
}
