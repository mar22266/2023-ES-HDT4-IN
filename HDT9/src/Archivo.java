import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Andre marroquin, 22266
 * HDT 9 - Estructura de datos
 * clase para leer archivos
 */

public class Archivo {

    /**
     * Hace la lectura del archivo de texto y lo almacena en un mapa.
     * @param tree
     */
    public void lectura(IMap tree){
        try {
            File file = new File("Spanish.txt");
            Scanner reader = new Scanner(file);
            int i = 0;
            while (reader.hasNextLine()) {
                i++;
                String dictionary = reader.nextLine();
                String[]  words = dictionary.split("	");
                String[] words2 = words[1].split(",");
                tree.add(words[0], words2[0]);
            }
            reader.close();
        } catch (FileNotFoundException e) {
            System.out.println("Archivo no encontrado.");
            e.printStackTrace();
        }

    }

    /**
     * hace la traduccion de las oraciones del archivo
     * @param map
     */
    public void oracion(IMap map){
        try {
            File myObj = new File("texto.txt");
            Scanner myReader = new Scanner(myObj);
            ArrayList<String> lines = new ArrayList<>();
            while (myReader.hasNextLine()) {
                String line = myReader.nextLine();
                lines.add(line);
            }
            myReader.close();

            for (String data : lines) {
                String[] temp = data.split("\\.");
                StringBuilder res = new StringBuilder();
                for (String s : temp) {
                    String[] oracion = s.split(" ");
                    System.out.println("\nOracion original: " + s + "\n");
                    for(String i: oracion){
                        if(map.find(i.toLowerCase())){
                            res.append(" ");
                            res.append(map.get(i));
                            res.append(" ");
                        } else{
                            res.append(" ").append("*").append(i).append("*").append(" ");
                        }
                    }
                }
                System.out.println("\nTraduccion al espanol: " + res + "\n");
            }
        }catch (Exception e) {
            System.out.println("Archivo no encontrado ERROR");
            e.printStackTrace();
        }
    }
}
