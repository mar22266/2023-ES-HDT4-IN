import java.util.ArrayList;

/**
 *@Author: Andre Marroquin
 * Estructuras de datos Hoja de trabajo 7
 */
public class Controladora {

    /**
     * Archivo que se va a leer
     */
    File archivo = new File();

    /**
     * Arreglo que almacena el diccionario
     */
    ArrayList<String> almacenador = new ArrayList<>();
    /**
     * Arboles binarios de busqueda
     */
    BST<String, String> InglesBST = new BST<String, String>(new Comparadora<String>());
    BST<String, String> EspanolBST = new BST<String, String>(new Comparadora<String>());
    BST<String, String> FrancesBST = new BST<String, String>(new Comparadora<String>());


    /**
     * Metodo que agrega los datos al arbol
     *
     * @param almacenador
     */
    public void Agregar(String almacenador) {
        String[] line = almacenador.split("\n");
        for (String Trans : line) {
            String[] word = Trans.split(",");
            if (!word[0].equals(" ") && !word[1].equals(" ")) {
                InglesBST.insert(word[0].toLowerCase().trim(), word[1].toLowerCase().trim());
            }
            if (!word[0].equals(" ") && !word[1].equals(" ")) {
                EspanolBST.insert(word[1].toLowerCase().trim(), word[1].toLowerCase().trim());
            }
            if (!word[0].equals(" ") && !word[1].equals(" ")) {
                FrancesBST.insert(word[2].toLowerCase().trim(), word[1].toLowerCase().trim());
            }

        }
    }

    /**
     * Metodo que muestra los arboles en orden
     *
     * @return
     */

    public String MostrarInOrder() {
        String TIT;
        ArrayList<String> valoresIngles = InglesBST.getElements();
        String titleIngles = "--INGLES--\n";
        for (String valorIngles : valoresIngles) {
            titleIngles += valorIngles + "\n";
        }

        ArrayList<String> valoresEspanol = EspanolBST.getElements();
        String titleEspanol = "--ESPANOL--\n";
        for (String valorEspanol : valoresEspanol) {
            titleEspanol += valorEspanol + "\n";
        }

        ArrayList<String> valoresFrances = FrancesBST.getElements();
        String titleFrances = "--FRANCES--\n";
        for (String valorFrances : valoresFrances) {
            titleFrances += valorFrances + "\n";
        }

        TIT = titleIngles + "\n" + titleEspanol + "\n" + titleFrances;
        return TIT;
    }

    /**
     * Metodo que traduce las oraciones del archivo a espaniol
     * @param texto la entrada
     * @return
     */
    public String traducirOracionesAEsp(String texto) {
        String[] oraciones = texto.split("\\.");
        for (String oracion : oraciones) {
            oracion = oracion.replaceAll("[.,;:]", "");
            oracion = oracion.replaceAll("\n", "");
            oracion = oracion.toLowerCase();
            String[] palabras = oracion.split(" ");
            ArrayList<String> ingles = InglesBST.getElements();
            ArrayList<String> frances = FrancesBST.getElements();
            ArrayList<String> espanol = EspanolBST.getElements();
            String[] linea;

            StringBuilder builder = new StringBuilder();
            boolean flag = false;
            for (String palabra : palabras) {
                for (String wordI : ingles) {
                    linea = wordI.split("=");
                    if (linea[0].equals(palabra)) {
                        flag = true;
                        builder.append(linea[1]).append(" ");
                    }
                }
                for (String wordF : frances) {
                    linea = wordF.split("=");
                    if (linea[0].equals(palabra)) {
                        flag = true;
                        builder.append(linea[1]).append(" ");
                    }
                }
                for (String wordE : espanol) {
                    linea = wordE.split("=");
                    if (linea[0].equals(palabra)) {
                        flag = true;
                        builder.append(linea[1]).append(" ");
                    }
                }
                if (!flag) {
                    builder.append("*").append(palabra).append("* ").append(" ");
                }
                flag = false;
            }

            System.out.println(builder.toString().trim());
        }
        return "\nYa se tradujeron las oraciones...\n";
    }
}
