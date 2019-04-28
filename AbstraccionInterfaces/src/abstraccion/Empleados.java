
package abstraccion;


public abstract class Empleados {
    
    private final String nombre;
    private final String apellido;
    private final String seguroSocial;
    
    public Empleados(String nom, String apel,String seguro){
        this.nombre = nom;
        this.apellido = apel;
        this.seguroSocial = seguro;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getSeguroSocial() {
        return seguroSocial;
    }
    
    public String toString(){
        return String.format("%s%s %n Numero de Seguro Social: %s", this.getNombre(),this.getApellido(),this.getSeguroSocial());
    }
    
    public abstract double Ingresos();
    
}
