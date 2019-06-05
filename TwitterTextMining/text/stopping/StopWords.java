package stopping;

import java.io.*;
import jdk.nashorn.internal.codegen.CompilerConstants;
import static tokenizer.Tokenizador.toText;
import static tokenizer.Tokenizador.tokens;

/*Aqui en enfoque consiste en volcar la lista tokenizada a una lista doble con la cual hare el stopping el stemming y sera la base para la nube
voy a comparar la lista de tokens con el arhivo de stopWords convertido en un string ver si cada token esta contenido y eliminarlo
limpiando de esta manera la lista
 */
public class StopWords {

    static ListDobStopping ldPalabras = new ListDobStopping();
    static String stopWordsString = null;
    static File archivoSW = null;
    static FileReader fr = null;
    static BufferedReader br = null;
    static StringBuilder sb = new StringBuilder();
    
//metodo que convierte el archivo de StopWords a un string
    public static void obtenerStopWords(String archSWPath) throws FileNotFoundException, IOException {
        try {
            String linea = null;
            //primero voy a trabajar con el path del archivo de stopwords para convertirlo en string
            archivoSW = new File(archSWPath);
            fr = new FileReader(archivoSW);
            br = new BufferedReader(fr);
            while ((linea = br.readLine())!= null) {
               sb.append(linea);
                }
            stopWordsString = sb.toString();
               
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        finally{
            fr.close();
            br.close();
            }
        //return stopWordsString;
    }
    
    //metodo que vuelca el array de tokens a una lista doble
    public static void conversorDeArrayTokens(String[] arrayWords){
        try {
            for(String s:arrayWords){
            ldPalabras.push(s,ldPalabras.tamanio());
        }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
    

    public static void main(String[] Args) throws IOException {
        //primero voy obtener las stop words
        String ruta = "C:\\Windows\\Temp\\stopwords-es.txt";
        String rutaTwits = "C:\\Windows\\Temp\\twitters.txt";
        obtenerStopWords(ruta);
        conversorDeArrayTokens(tokens(toText(rutaTwits)));
        System.out.println("-----------LISTA DOBLE ORIGINAL---------");
        ldPalabras.recorrer();
        System.out.println("------------------------------");
        ldPalabras.limpiarStopWords(stopWordsString);
         System.out.println("-----------LISTA DOBLE LUEGO DE LIMPIEZA---------");
        ldPalabras.recorrer();
        System.out.println("------------------------------");

    }

}
