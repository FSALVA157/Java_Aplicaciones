
package ej_cyber_lista_cola;

import colaDinamica.ColaAbs;


public class ColaDeAlumnos extends ColaAbs {

    @Override
    public boolean esIgual(Object obj1, Object obj2) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean esMayorQue(Object obj1, Object obj2) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean esMenorQue(Object obj1, Object obj2) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void imprimir(Object obj) {
        Alumno persona = new Alumno();
        persona = (Alumno) obj;
        System.out.printf("alumno: %s --- dni: %d\n",persona.getNombre(),persona.getDni());
    }
    
}
