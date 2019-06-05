
package tokenizer;

import java.io.*;


public class Tokenizador {
    static String archivoPath = "C:\\Windows\\Temp\\twitters.txt";
    //metodo que convierte el archivo en string
    public static String toText(String archivoPath) throws FileNotFoundException, IOException{
        StringBuilder sb = new StringBuilder();
        String linea;
        String archString;
        File archivo = null;
        FileReader fr = null;
        BufferedReader br = null;
        try {
                archivo = new File(archivoPath);
                fr = new FileReader(archivo);
                br = new BufferedReader(fr);
                
                while((linea = br.readLine()) != null){
                    sb.append(linea);
                }
                archString = sb.toString();
                
        } catch (Exception e) {
            archString = e.getMessage(); 
        }
        finally{
            fr.close();
            br.close();
            
        }
        return archString;
               
    }
    
    
    public static String[] tokens(String texto){
        String[] arrayTokens = null;
        
        try {
                if(texto  != null){
                    arrayTokens = texto.toLowerCase().trim().split("[^a-z]+");
                }
        } catch (Exception e) {
            return null;
        }
        return arrayTokens;
    }
    
    public static void mostrarTokens(String[] arrayPalabras){
        for(String s:arrayPalabras){
            System.out.println(s);
        }
    }
    
    public static void main(String[] Args) throws FileNotFoundException, IOException{
        //System.out.println(toText(archivoPath));
        mostrarTokens(tokens(toText(archivoPath)));
    }
    
}
