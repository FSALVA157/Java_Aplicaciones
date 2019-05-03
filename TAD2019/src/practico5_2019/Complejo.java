
package practico5_2019;


public class Complejo implements Operaciones {
    private double real;
    private double imaginaria;

    public Complejo(double real, double imaginaria) {
        this.real = real;
        this.imaginaria = imaginaria;
    }

    public Complejo() {
    }

    public double getReal() {
        return real;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public double getImaginaria() {
        return imaginaria;
    }

    public void setImaginaria(double imaginaria) {
        this.imaginaria = imaginaria;
    }
    
    public void divide(Complejo a, Complejo b) {
        this.setReal((a.getReal() * b.getReal() + a.getImaginaria() * b.getImaginaria())/(Math.pow(b.getReal(), 2)) + (Math.pow(b.getImaginaria(), 2)));
        this.setImaginaria((a.getImaginaria() * b.getReal() - a.getReal() * b.getImaginaria())/(Math.pow(b.getReal(), 2)) + (Math.pow(b.getImaginaria(), 2)));
    }
    
    public void conjugado(Complejo a) {
        this.setReal(a.getReal());
        this.setImaginaria(-a.getImaginaria());
    }
    
    

    @Override
    public void suma(Object a, Object b) {
        Complejo c1 = (Complejo)a;
        Complejo c2 = (Complejo) b;
        
         this.setReal(c1.getReal()+ c2.getReal());
        this.setImaginaria(c1.getImaginaria()+ c2.getImaginaria());
        
    }

    @Override
    public void resta(Object a, Object b) {
        Complejo c1 = (Complejo)a;
        Complejo c2 = (Complejo) b;
        
         this.setReal(c1.getReal()- c2.getReal());
        this.setImaginaria(c1.getImaginaria() - c2.getImaginaria());
    }

    @Override
    public void multiplicacion(Object a, Object b) {
         Complejo c1 = (Complejo)a;
         Complejo c2 = (Complejo) b;
        this.setReal(c1.getReal()*c2.getReal() - c1.getImaginaria() * c2.getImaginaria());
        this.setImaginaria(c1.getReal()* c2.getImaginaria() + c1.getImaginaria() * c2.getReal());
        
      
    }

    @Override
    public void potencia(Object base, Object exponente) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean igualdad(Object a, Object b) {
        Complejo c1 = (Complejo)a;
        Complejo c2 = (Complejo) b;
        return ((c1.getReal()==c2.getReal())&&(c1.getImaginaria()==c2.getImaginaria())); 
    }
    
}
