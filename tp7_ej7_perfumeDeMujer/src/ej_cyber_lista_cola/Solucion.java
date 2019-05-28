package ej_cyber_lista_cola;

import java.security.SecureRandom;
import javax.swing.JOptionPane;

public class Solucion {

    public static void main(String Args[]) {
        ColaDeAlumnos filaDeEspera = new ColaDeAlumnos();
        Laboratorio labo = new Laboratorio();
        Alumno estudiante = new Alumno();
        Pc compu = new Pc();
        
        //creare el laboratorio de 15 computadoras (quizas convenia usar una matriz)
        for(int c = 0; c < 15; c++){
            labo.meter(compu, 0);
        }
        
        for (int i = 0; i < 10; i++) {
            //actualizar todos los relojes
            System.out.printf("Iniciando vuelata numero %d \n",i);
            System.out.println("actualizando los relojes");
            labo.actualizarEstado();
            System.out.println("--------------------ESTADO DEL LABORATORIO--------------");
                labo.mostrar();
            System.out.println("-----------------------------------------------------------------");

            //veamos si llega algun alumno
            SecureRandom moneda = new SecureRandom();
            int dado = 1 + moneda.nextInt(100);
            boolean llegada = (dado < 16) ? true : false;
            if (llegada) {
                JOptionPane.showMessageDialog(null, "HA INGRESADO UN ALUMNO AL LABORATORIO DEBE LLENAR EL REGISTRO CON SUS DATOS", "REGISTRO DE ALUMNO", 3);
                int dni = Integer.parseInt(JOptionPane.showInputDialog("INGRESE EL DNI DEL ESTUDIANTE"));
                String nombre = JOptionPane.showInputDialog("INGRESE EL NOMBRE DEL ESTUDIANTE");
                estudiante.setDni(dni);
                estudiante.setNombre(nombre);
                if (!labo.buscarPc(estudiante)) {
                    filaDeEspera.meter(estudiante);
                    System.out.println("----------------ESTADO DE LA FILA DE ESPERA---------------------");
                    filaDeEspera.recorrer();
                    System.out.println("-----------------------------------------------------------------");
                }
            }

        }
    }

}
