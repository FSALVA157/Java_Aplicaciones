
package vector;

import java.util.Scanner;


public class Main {

//metodo que usa el objeto vector
    public static void main(String[] Args){
        Scanner entrada = new Scanner(System.in);
        System.out.println("INGRESE LA COORDENADA X DEL VECTOR 1");
        int x = entrada.nextInt();
        System.out.println("INGRESE LA COORDENADA Y DEL VECTOR 1");
        int y = entrada.nextInt();
        
        Vector v1 = new Vector(x,y);
        System.out.printf("El Vector 1 creado es: (%d,%d) %n",v1.getX(),v1.getY());
        
        System.out.println("INGRESE LA COORDENADA X DEL VECTOR 2");
        int x2 = entrada.nextInt();
        System.out.println("INGRESE LA COORDENADA Y DEL VECTOR 2");
        int y2 = entrada.nextInt();
        
        Vector v2 = new Vector(x2,y2);
        System.out.printf("El Vector 2 creado es: (%d,%d) %n",v2.getX(),v2.getY());
        
        System.out.println("INGRESE UN NUMERO ENTERO PARA PROBAR EL PRODUCTO POR UN ESCALAR");
        int escal = entrada.nextInt();
        Vector p = new Vector();
        p = v1.ProductoPorUnEscalar(escal);
        
        System.out.printf("el producto escalar del vector1 por el escalar es: (%d,%d)%n",p.getX(),p.getY());
        p = v1.SumaVectores(v2);
        System.out.printf("la suma escalar de v1 y v2 es (%d,%d)%n",p.getX(),p.getY());
        
         double m = v1.Modulo();
        System.out.printf("el modulo de v1 es %f %n",m);
        
         double pe = v1.ProductoEscalar(v2);
        System.out.printf("el producto escalar de v1 y v2 es %f %n",pe);
    }
    
}
