package sp;

import java.io.*;
import java.util.ArrayList;
/**
 * Clase Archivo
 * @author Andre marroquin
 */
public class Archivo {

    /**
     * Ruta del archivo
     */
    public static final String path = "C:\\Users\\andre\\OneDrive\\Desktop\\HT\\HDTES\\HDT4\\data.txt";

    /**
     * Metodo que lee el archivo
     * @return
     * @throws IOException
     */
    public static String[] readFile() throws IOException {
        File doc = new File(path);

        BufferedReader obj = new BufferedReader(new FileReader(doc));
        ArrayList<String> Llist = new ArrayList<String>();


        String linea;
        while ((linea = obj.readLine()) != null) {
            Llist.add(linea);
           }

        obj.close();

        return Llist.toArray(new String[Llist.size()]);
    }


    /**
     * Metodo que escribe en el archivo
     * @param text
     * @throws IOException
     */
    public static void writeFile(String text) throws IOException {
        File archivo = new File(path);
        if (!archivo.exists()) {
            archivo.createNewFile();
        }

        FileWriter fw = new FileWriter(archivo);

        fw.write(text);
        fw.close();

        }

}
