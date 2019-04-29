
package naturales;


public class NaturalImp implements Natural{
    private int valor;

   
    public NaturalImp(int numero) {
        if (valor < 0){
            System.out.println("El valor ingresado no es natural por lo que se iniciara con valor 0");
            this.valor = 0;
        }else{
            this.valor = numero;
        }
   
    }
    
    @Override
    public Natural CreaNatural(int numero) {
        return new NaturalImp(numero);
    }

    @Override
    public int GetValor() {
        return this.valor;
    }

    @Override
    public void SetValor(int valor) {
        if(valor < 0){
            throw new IllegalArgumentException("DEBE INGRESAR UN NUMERO MAYOR QUE CERO");
        }else{
            this.valor = valor;
        }
    }

    @Override
    public void Suma(Natural a, Natural b) {
        this.valor = a.GetValor() + b.GetValor();
    }

    @Override
    public void Producto(Natural a, Natural b) {
       this.valor = a.GetValor() * b.GetValor();
    }

    @Override
    public void Resta(Natural a, Natural b) {
       if (b.GetValor() < a.GetValor()){
           throw new IllegalArgumentException("ERROR EN LOS VALORES INGRESADOS EL (A > B)");
       }else{
           this.valor = b.GetValor() - a.GetValor();
       }
    }

    @Override
    public void Cociente(Natural a, Natural b) {
        this.valor = a.GetValor() / b.GetValor();
    }

    @Override
    public void Resto(Natural a, Natural b) {
        this.valor = a.GetValor() % b.GetValor();
    }

    @Override
    public void Potencia(Natural a, Natural b) {
       this.valor = (int) Math.pow(a.GetValor(), b.GetValor());
    }

    @Override
    public void Raiz(int a, int b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean Igual(Natural a, Natural b) {
     return (a.GetValor() == b.GetValor());   
    }

    
    
}
