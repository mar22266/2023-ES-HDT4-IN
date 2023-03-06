package sp;

import java.io.File;
import java.util.Map;
import java.util.Scanner;

/**
 * @author Andre Marroquin
 * HDT 6
 * Algoritmos y estructuras de datos
 */

public class Archivo {

    public static Map<String, String> readfile(String TIPO, String ARCH) throws Exception{
        Factory<String, String> hashF = new Factory<String,String>();
        Map<String, String> hash = hashF.getMap(TIPO);
        try{
            File file = new File(ARCH);
            Scanner sc = new Scanner(file);
            while (sc.hasNextLine()){
                String linea = sc.nextLine();
                String[] datos = linea.split(" |\t");
                hash.put(datos[0],datos[1]);
            }
            sc.close();
        } catch (Exception e){
            throw new Exception("Error al leer el archivo");
        }
        return hash;
    }

    public static Map<String, String> readfile2(String TIPO, String ARCH, int cu) throws Exception{
        Factory<String, String> hashF = new Factory();
        Map<String, String> hash = hashF.getMap(TIPO);
        try{
            File file = new File(ARCH);
            Scanner sc = new Scanner(file);
            for(int i = 0; i < cu ; i ++){
                String linea = sc.nextLine();
                String[] datos = linea.split(" |\t");
                hash.put(datos[0],datos[1]);
            }
            sc.close();
        } catch (Exception e){
            throw new Exception("Error al leer el archivo");
        }
        return hash;
    }
}
