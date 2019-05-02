
package practico5_2019;


public class Racional extends Entero implements Operaciones  {

    private int numerador;
    private int denominador;
    
    public Racional(int n, int d){
        this.numerador = n;
        this.denominador = n;
    }

    public int getNumerador() {
        return numerador;
    }

    public void setNumerador(int numerador) {
        this.numerador = numerador;
    }

    public int getDenominador() {
        return denominador;
    }

    public void setDenominador(int denominador) {
        this.denominador = denominador;
    }
   
        
    @Override
    public void suma(Object a, Object b) {
      Racional r1 = (Racional)(a);
      Racional r2 = (Racional)(b);
      if(super.igualdad(r1.denominador, r2.getDenominador())){
          this.setDenominador(r1.getDenominador());
          //this.setNumerador(super.suma(r1.getNumerador(),r2.getNumerador()));
          this.setNumerador(r1.getNumerador() + r2.getNumerador());
      }else{
          this.setDenominador(r1.getDenominador()*r2.getDenominador());
          this.setNumerador(r1.getNumerador() * r2.getNumerador() + r2.getNumerador()*r1.getDenominador());
      }
    }

    @Override
    public void resta(Object a, Object b) {
       Racional r1 = (Racional)(a);
      Racional r2 = (Racional)(b);
      if(super.igualdad(r1.denominador, r2.getDenominador())){
          this.setDenominador(r1.getDenominador());
          this.setNumerador(r1.getNumerador() + r2.getNumerador());
      }else{
          this.setDenominador(r1.getDenominador()*r2.getDenominador());
          this.setNumerador(r1.getNumerador() * r2.getNumerador() - r2.getNumerador()*r1.getDenominador());
      } 
    }

    @Override
    public void multiplicacion(Object a, Object b) {
      Racional r1 = (Racional)(a);
      Racional r2 = (Racional)(b);
      
          this.setDenominador(r1.getDenominador()*r2.getDenominador());
          this.setNumerador(r1.getNumerador() * r2.getNumerador());
       
    }

    @Override
    public void potencia(Object base, Object exponente) {
        Racional r1 = (Racional)(base);
        Entero e = (Entero)(exponente);
        Entero d = new Entero(r1.getNumerador());
        d.potencia(d.getEntero(), e.getEntero());
        r1.setNumerador(d.getEntero());
        
        //voy a trabajar el denominador sin usar la superclase
        r1.setDenominador((int)Math.pow(r1.getDenominador(), e.getEntero()));
    }

    @Override
    public boolean igualdad(Object a, Object b) {
        Racional r1 = (Racional)(a);
        Racional r2 = (Racional)(b);
        Entero n = new Entero();
        Entero d = new Entero();
        d.multiplicacion(r1.getDenominador(), r2.getNumerador());
        n.multiplicacion(r1.getNumerador(), r2.getDenominador());
        return super.igualdad(d.getEntero(),n.getEntero() );
      }
    
    public void simplificar(){
        Entero e1 = new Entero(this.getNumerador());
        Entero e2 = new Entero(this.getDenominador());
        
       int mcd = super.mcd(e1,e2);
       this.setNumerador(this.numerador/mcd);
       this.setDenominador(this.denominador/mcd);
       
    }

    
}
