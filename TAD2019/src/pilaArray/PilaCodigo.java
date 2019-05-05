
package pilaArray;

//clase que soluciona el problema de un string codificado utilizando una pila
public class PilaCodigo extends clsPilaArr {
    
    public PilaCodigo(int tam){
        super(tam);
    }
    
    //metodo que desencripta
    public static String desencripta(String codigo){
        PilaCodigo pila = new PilaCodigo(codigo.length());
        StringBuilder frase = new StringBuilder();
        int i = 0;
        
        while(i<(codigo.length()-1)){
           // try{
            System.out.println("ENTRANDO A LA ITERACION DE LECTURA CHAR A CHAR");
            if((String.valueOf(codigo.charAt(i)) + String.valueOf(codigo.charAt(i+1))).equals("ZX")){
                System.out.println("ENTRANDO A CICLO ANIDADO 1");
                i = i + 2;
                pila.meter(String.valueOf(' '));
               // while (String.valueOf(codigo.charAt(i)) + String.valueOf(codigo.charAt(i+1)) != "XZ"){
                while (!(String.valueOf(codigo.charAt(i)) + String.valueOf(codigo.charAt(i+1))).equals("ZX")){
                    pila.meter(codigo.charAt(i));
                    System.out.println("apilando: " + codigo.charAt(i));
                    i++;
                }
                i = i +2;
            }
            i++;
            //}catch(Exception ex){
              //  System.out.println(ex.getMessage());
          //  }
                       
        }
        
        while(!pila.estaVacia()){
            frase.append((String) pila.sacar() );
        }
        return frase.toString();
    }
    
    public static void main(String Args[]){
        String codigo = "PZZXATSEXZYTZXERBOSXZ2Z6ZXLEXZUYZXOIROTIRCSEXZ2PP8U";
        String resultado = desencripta(codigo);
        System.out.println("LA FRASE ES: " + resultado);
    }
}
