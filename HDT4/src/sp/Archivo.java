package sp;

import java.io.*;
import java.util.ArrayList;

public class Archivo {

    public static final String path = "C:\\Users\\andre\\OneDrive\\Desktop\\HT\\HDTES\\HDT4\\data.txt";


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
