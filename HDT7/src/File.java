import java.io.*;

/**
 *@Author: Andre Marroquin
 * Estructuras de datos Hoja de trabajo 7
 */
public class File {

    /**
     * Metodo que lee un archivo
     * @param path ruta del archivo
     * @return devuelve la entrada del archivo
     */
    public String FileReader(String path) {
        String entrada = "";
        try {
            BufferedReader bf = new BufferedReader(new FileReader(path));
            String var = "";
            String line;
            while ((line = bf.readLine()) != null) {
                var = var + line;
            }
            entrada = var;
        } catch (Exception e) {
            System.err.println("No se encontro el archivo");
        }
        return entrada;
    }

    /**
     * Metodo que escribe en un archivo
     * @param salida aarchivos
     * @param path ruta del archivo
     * @return devuelve el archivo
     */
    public String FileWriter(String salida, String path) {
        String text = salida;
        try{
            BufferedWriter bw = new BufferedWriter(new FileWriter(path));
            bw.write(salida);
            bw.close();
        }
        catch (IOException e) {
            System.err.println("No se encontro el archivo");
        }

    return salida;
    }
}