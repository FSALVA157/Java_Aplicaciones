/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package complejos;

import sun.security.krb5.Realm;

/**
 *
 * @author xxavier
 */
public class Complejo implements ComplejoInterface{
    private double real;
    private double imaginaria;
    
    public Complejo(double r, double i){
        this.real = r;
        this.imaginaria = i;
        
    }

  /*  @Override
    public ComplejoInterface CreaComplejo(double r, double i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
*/
    @Override
    public double GetReal() {
       return this.real;
    }

    @Override
    public double GetImaginaria() {
        return this.imaginaria;
    }

    @Override
    public void SetReal(double r) {
        this.real = r;
    }

    @Override
    public void SetImaginaria(double i) {
        this.imaginaria = i;
    }

    @Override
    public void suma(Complejo a, Complejo b) {
        this.SetReal(a.GetReal()+ b.GetReal());
        this.SetImaginaria(a.GetImaginaria()+ b.GetImaginaria());
    }

    @Override
    public void resta(Complejo a, Complejo b) {
        this.SetReal(a.GetReal() - b.GetReal());
        this.SetImaginaria(a.GetImaginaria() - b.GetImaginaria());
    }

    @Override
    public void multiplica(Complejo a, Complejo b) {
        this.SetReal(a.GetReal()*b.GetReal() - a.GetImaginaria() * b.GetImaginaria());
        this.SetImaginaria(a.GetReal()*b.GetImaginaria() + a.GetImaginaria() * b.GetReal());
    }

    @Override
    public void divide(Complejo a, Complejo b) {
        this.SetReal((a.GetReal() * b.GetReal() + a.GetImaginaria() * b.GetReal())/(Math.pow(b.GetReal(), 2)) + (Math.pow(b.GetImaginaria(), 2)));
        this.SetImaginaria((a.GetImaginaria() * b.GetReal() - a.GetReal() * b.GetImaginaria())/(Math.pow(b.GetReal(), 2)) + (Math.pow(b.GetImaginaria(), 2)));
    }

    @Override
    public void conjugado(Complejo a) {
        this.SetReal(a.GetReal());
        this.SetImaginaria(-a.GetImaginaria());
    }

    @Override
    public double modulo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
