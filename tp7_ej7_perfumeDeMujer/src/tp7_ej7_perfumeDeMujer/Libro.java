
package tp7_ej7_perfumeDeMujer;

//clase Nodo que estructura un libro con prioridad y peso
public class Libro {
    private String nombre;
    private int peso;
    private int beneficio;

    public Libro(String nombre, int peso, int beneficio) {
        this.nombre = nombre;
        this.peso = peso;
        this.beneficio = beneficio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getBeneficio() {
        return beneficio;
    }

    public void setBeneficio(int beneficio) {
        this.beneficio = beneficio;
    }
  
    
    
    
    
    
    
}
