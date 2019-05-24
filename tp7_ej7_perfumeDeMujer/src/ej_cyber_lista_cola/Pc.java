package ej_cyber_lista_cola;


public class Pc {
private int numero;
private boolean estado;
private int reloj;
private String operador;

    public Pc(int numero, boolean estado, int reloj,String operador) {
        this.numero = numero;
        this.estado = estado;
        this.reloj = reloj;
        this.operador = operador;
    }

    public Pc() {
    }
    
    

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public int getReloj() {
        return reloj;
    }

    public void setReloj(int reloj) {
        this.reloj = reloj;
    }

    public String getOperador() {
        return operador;
    }

    public void setOperador(String operador) {
        this.operador = operador;
    }



}
