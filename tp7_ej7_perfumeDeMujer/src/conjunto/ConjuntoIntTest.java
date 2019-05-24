package conjunto;

import javax.swing.JOptionPane;
import listaSimpleFer.*;

public class ConjuntoIntTest {

    public static void main(String Args[]) {
        int opcion = 0;
        ConjuntoInt conjunto = new ConjuntoInt();
        int elemento;

        do {
            try {
                opcion = Integer.parseInt(JOptionPane.showInputDialog(null, "1. Agregar un elemento al conjunto\n 2. Eliminar un elemento del conjunto\n 3. Recorrer conjunto"
                        + "\n 4. Mostrar el Tamaño del conjunto\n 5. Unir dos conjuntos\n"
                        + " 6. Interseccion de dos conjuntos\n 7. Inclusion de un conjuntos\n 8. Salir", "Menú de Opciones para Conjuntos", 3));
                switch (opcion) {
                    case 1:
                        try {
                            elemento = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un Número Entero para Insertar al conjunto",
                                    "Insertando elemento", 3));

                            conjunto.meter(elemento);

                        } catch (Exception n) {
                            JOptionPane.showMessageDialog(null, n.getMessage(), "Error en el Push", 3);
                        }
                        break;
                    case 2:
                        try {
                            elemento = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el Entero a eliminar de la lista",
                                    "Eliminar Elemento", 3));
                            //conjunto.sacar();
                        } catch (Exception e) {
                            JOptionPane.showMessageDialog(null, e.getMessage(), "Error en el Pop", 3);
                        }
                        break;
                    case 3:
                        conjunto.mostrar();
                        break;
                    case 4:
                        JOptionPane.showMessageDialog(null, "La Lista tiene " + conjunto.tamanio() + " elementos", "Tamaño del conjunto", 3);
                        break;
                    case 5:
                        try {
                            ConjuntoInt conjunto1 = new ConjuntoInt();
                            ConjuntoInt conjunto2 = new ConjuntoInt();
                            ConjuntoInt conjuntoUnion = new ConjuntoInt();
                            int entero = 0;
                            JOptionPane.showMessageDialog(null, "SE LE SOLICITARAN ELEMENTOS PARA EL PRIMER CONJUNTO PARA FINALIZAR INGRESE EL VALOR -1", "CARGA DE CONJUNTO 1", 3);
                            do {             
                                entero = Integer.parseInt(JOptionPane.showInputDialog(null, "INGRESE UN NUMERO ENTERO PARA EL CONJUNTO", "CARGA DE CONJUNTO Nº 1", 3));
                                if(entero != -1){
                                conjunto1.meter(entero);
                                }
                            } while (entero != -1);
                            
                             JOptionPane.showMessageDialog(null, "SE LE SOLICITARAN ELEMENTOS PARA EL SEGUNDO CONJUNTO PARA FINALIZAR INGRESE EL VALOR -1", "CARGA DE CONJUNTO 2", 3);
                            do {             
                                entero = Integer.parseInt(JOptionPane.showInputDialog(null, "INGRESE UN NUMERO ENTERO PARA EL CONJUNTO", "CARGA DE CONJUNTO Nº 2", 3));
                                if(entero != -1){
                                conjunto2.meter(entero);
                                }
                            } while (entero != -1);
                            
                            conjuntoUnion.union(conjunto1, conjunto2);
                            System.out.println("CONJUNTO 1");
                            conjunto1.mostrar();
                            System.out.println("CONJUNTO 2");
                            conjunto2.mostrar();
                            System.out.println("CONJUNTO UNION");
                            conjuntoUnion.mostrar();
                            

                        } catch (Exception e) {
                            JOptionPane.showMessageDialog(null, e.getMessage(), "Error en la busqueda de un Entero:  de Tipo de Dato", 3);
                        }
                        break;
                    case 6:
                        try {
                            ConjuntoInt conjunto1 = new ConjuntoInt();
                            ConjuntoInt conjunto2 = new ConjuntoInt();
                            ConjuntoInt conjuntoIntersec = new ConjuntoInt();
                            int entero = 0;
                            JOptionPane.showMessageDialog(null, "SE LE SOLICITARAN ELEMENTOS PARA EL PRIMER CONJUNTO PARA FINALIZAR INGRESE EL VALOR -1", "CARGA DE CONJUNTO 1", 3);
                            do {             
                                entero = Integer.parseInt(JOptionPane.showInputDialog(null, "INGRESE UN NUMERO ENTERO PARA EL CONJUNTO", "CARGA DE CONJUNTO Nº 1", 3));
                                if(entero != -1){
                                conjunto1.meter(entero);
                                }
                            } while (entero != -1);
                            
                             JOptionPane.showMessageDialog(null, "SE LE SOLICITARAN ELEMENTOS PARA EL SEGUNDO CONJUNTO PARA FINALIZAR INGRESE EL VALOR -1", "CARGA DE CONJUNTO 2", 3);
                            do {             
                                entero = Integer.parseInt(JOptionPane.showInputDialog(null, "INGRESE UN NUMERO ENTERO PARA EL CONJUNTO", "CARGA DE CONJUNTO Nº 2", 3));
                                if(entero != -1){
                                conjunto2.meter(entero);
                                }
                            } while (entero != -1);
                            
                            conjuntoIntersec.interseccion(conjunto1, conjunto2);
                            System.out.println("CONJUNTO 1");
                            conjunto1.mostrar();
                            System.out.println("CONJUNTO 2");
                            conjunto2.mostrar();
                            System.out.println("CONJUNTO INTERSECCION");
                            conjuntoIntersec.mostrar();
                            

                        } catch (Exception e) {
                            JOptionPane.showMessageDialog(null, e.getMessage(), "Error de Tipo de Dato al Mostrar", 3);
                        }
                        break;

                    case 7:
                        try {

                        } catch (Exception e) {
                            JOptionPane.showMessageDialog(null, e.getMessage(), "Error de Tipo de Dato al Mostrar", 3);
                        }
                        break;
                    case 8:
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Opcion Incorrecta");

                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage(), "Error", 3);
            }
        } while (opcion != 8);
    }

}
