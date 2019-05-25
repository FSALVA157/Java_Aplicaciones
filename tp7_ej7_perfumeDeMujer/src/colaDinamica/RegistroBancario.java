
package colaDinamica;


public class RegistroBancario {
private int id;
private String nombre;
private int prioridad;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(int prioridad) {
        this.prioridad = prioridad;
    }

    public RegistroBancario(int id, String nombre, int prioridad) {
        this.id = id;
        this.nombre = nombre;
        this.prioridad = prioridad;
    }

    public RegistroBancario() {
    }
    
    


}
