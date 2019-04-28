
package abstraccion;


public class EmpleadoAsalariado extends Empleados{
    
    private double salarioSemanal;
    
    public EmpleadoAsalariado(String nombre, String apellido, String seguro, double salario){
        super(nombre, apellido, seguro);
       if(salario < 0){
           throw new IllegalArgumentException("El salario debe ser un numero positivo");
       }else{
            this.salarioSemanal = salario;
       }
    }

    public double getSalarioSemanal() {
        return salarioSemanal;
    }

    public void setSalarioSemanal(double salarioSemanal) {
        if (salarioSemanal < 0){
        throw new IllegalArgumentException("El salario debe ser un numero positivo");
    }else{
            this.salarioSemanal = salarioSemanal;
            }
        
    }
    

    @Override
    public double Ingresos() {
       return getSalarioSemanal();
    }
    
    public String toString(){
        return String.format("%s %n Salario Semanal: $%,.2f", super.toString(),getSalarioSemanal());
    }
    
}
