
package collaPrioridadTest;

import colaDinamica.ColaDePrioridadReg;
import colaDinamica.RegistroBancario;
import javax.swing.JOptionPane;
import jdk.nashorn.internal.codegen.CompilerConstants;


public class ColaPrioridadRegistroTest extends ColaDePrioridadReg {
    
     public static void main(String Args[]) {
         RegistroBancario reg = new RegistroBancario();
        int opcion = 0;
        ColaDePrioridadReg cola = new ColaDePrioridadReg();
        int elemento;
        int posicion;
        do {
            try {
                opcion = Integer.parseInt(JOptionPane.showInputDialog(null, "1. Agregar un elemento a la cola\n 2. Eliminar un elemento de la cola\n 3. Recorrer cola"
                        + "\n 4. Mostrar el Tamaño de la cola\n 5. Buscar un Elemewnto\n"
                        + " 6. Mostrar Elemento segun Posicion\n 7. Salir", "Menú de Opciones para Listas Ordenadas", 3));
                switch (opcion) {
                    case 1:
                        try {
                            int id = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un Número ID para el cliente Bancario",
                                    "ID", 3));
                            reg.setId(id);
                            String nombre = JOptionPane.showInputDialog(null, "Ingrese el nombre del cliente",
                                    "NOMBRE", 3);
                            reg.setNombre(nombre);
                            int prioridad = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la prioridad del cliente",
                                    "IPRIORIDAD", 3));
                            reg.setPrioridad(prioridad);
                                                        
                            cola.meterConPrioridad(new RegistroBancario(id, nombre, prioridad));

                        } catch (Exception n) {
                            JOptionPane.showMessageDialog(null, n.getMessage(), "Error en el Push", 3);
                        }
                        break;
                    case 2:
                        try {
                            cola.sacar();
                           
                        } catch (Exception e) {
                            JOptionPane.showMessageDialog(null, e.getMessage(), "Error en el Pop", 3);
                        }
                        break;
                    case 3:
                        cola.recorrer();
                        break;
                    case 4:
                        JOptionPane.showMessageDialog(null, "La Lista tiene " + cola.cardinal() + "elementos", "Tamaño de la Lista", 3);
                        break;
                    case 5:
                        break;
                    case 6:
                       
                        break;
                    case 7:
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Opcion Incorrecta");

                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage(), "Error", 3);
            }
        } while (opcion != 7);
    }
    
   
    
    
    
    
}
