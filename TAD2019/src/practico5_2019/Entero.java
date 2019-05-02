
package practico5_2019;


public class Entero implements Operaciones {
    
    private int valor;
    
    public Entero(){
        
    }
    public Entero(int numero){
        this.valor = numero;
    }
    
    public void setEntero(int n){
        this.valor = n;
    }
    
    public int getEntero(){
        return this.valor;
    }
    
    public int resto(int dividendo, int divisor){
        return dividendo % divisor;
    }

    @Override
    public void suma(Object a, Object b) {
      this.valor = ((Entero)a).getEntero() + ((Entero)b).getEntero();
    }

    @Override
    public void resta(Object a, Object b) {
    this.valor = ((Entero)a).getEntero() - ((Entero)b).getEntero();
    }

    @Override
    public void multiplicacion(Object a, Object b) {
        this.valor = ((Entero)a).getEntero() * ((Entero)b).getEntero();
    }

    @Override
    public void potencia(Object base, Object exponente) {
     Entero b = new Entero((int)(base));
     Entero e = new Entero((int)(exponente));
     this.valor = (int)Math.pow((double)b.getEntero(),(double) e.getEntero());        
     
    }

    @Override
    public boolean igualdad(Object a, Object b) {
     return ((Entero)a).getEntero() == ((Entero)b).getEntero();
    }
    
    public int mcd(Entero a, Entero b){
        return MCDrecursivo.mcd(a.getEntero(), b.getEntero());
    }
    
}
