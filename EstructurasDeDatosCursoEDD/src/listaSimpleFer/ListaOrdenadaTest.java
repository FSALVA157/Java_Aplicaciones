
package listaSimpleFer;

//En esta clase trabajare con una lista ordenada de enteros

import javax.swing.JOptionPane;

public class ListaOrdenadaTest extends ListaOrdenada {
    
    //constructor
        public ListaOrdenadaTest() {
            super();
    }

    @Override
    public boolean esMayorQue(Object obj1, Object obj2) {
        return ((int)obj1 > (int)obj2);
    }

    @Override
    public boolean esMenorQue(Object obj1, Object obj2) {
        return ((int)obj1 < (int)obj2);
    }

    @Override
    public void imprime(Object obj) {
        System.out.print("[" + obj.toString() + "] --->");
    }
    
    public boolean esIgual(Object obj1, Object obj2) {
        return ((int)obj1 == (int)obj2);
    }
    
    
    public static void main(String Args[]) {
        int opcion = 0;
        ListaOrdenadaTest lista = new ListaOrdenadaTest();
        int elemento;
        int posicion;
        do {
            try {
                opcion = Integer.parseInt(JOptionPane.showInputDialog(null, "1. Agregar un elemento a la lista\n 2. Eliminar un elemento de la lista\n 3. Recorrer Lista"
                        + "\n 4. Mostrar el Tamaño de la Lista\n 5. Buscar un Elemewnto\n"
                        + " 6. Mostrar Elemento segun Posicion\n 7. Salir", "Menú de Opciones para Listas Ordenadas", 3));
                switch (opcion) {
                    case 1:
                        try {
                            elemento = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un Número Entero para Insertar a la lista",
                                    "Insertando elemento", 3));
                                                        
                            lista.meter(elemento);

                        } catch (Exception n) {
                            JOptionPane.showMessageDialog(null, n.getMessage(), "Error en el Push", 3);
                        }
                        break;
                    case 2:
                        try {
                            elemento = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el Entero a eliminar de la lista",
                                    "Eliminar Elemento", 3));
                            lista.pop(elemento);
                        } catch (Exception e) {
                            JOptionPane.showMessageDialog(null, e.getMessage(), "Error en el Pop", 3);
                        }
                        break;
                    case 3:
                        lista.mostrar();
                        break;
                    case 4:
                        JOptionPane.showMessageDialog(null, "La Lista tiene " + lista.tamanio() + "elementos", "Tamaño de la Lista", 3);
                        break;
                    case 5:
                        try {
                            int objetivo = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un Entero para localizar",
                                    "Busqueda de un elemento", 3));
                            if (lista.buscar(objetivo) == -1) {
                                JOptionPane.showMessageDialog(null, "El elemento buscado no existe en la lista", "Resultado de la Busqueda", 3);
                            } else {
                                JOptionPane.showMessageDialog(null, "El elemento buscado SI existe en la lista y esta ubicado en el lugar " + lista.buscar(objetivo), "Resultado de la Busqueda", 3);
                            }
                        } catch (Exception e) {
                            JOptionPane.showMessageDialog(null, e.getMessage(), "Error en la busqueda de un Entero:  de Tipo de Dato", 3);
                        }
                        break;
                    case 6:
                        try {
                            posicion = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la posicion del elemento a Mostrar",
                                    "Posición de Acceso", 3));
                            JOptionPane.showMessageDialog(null, "El elemento de la Posicion: " + posicion + " es: " + (int) lista.seek(posicion) , "Mostrar Elemento", 3);
                            
                        } catch (Exception e) {
                            JOptionPane.showMessageDialog(null, e.getMessage(), "Error de Tipo de Dato al Mostrar", 3);
                        }
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
