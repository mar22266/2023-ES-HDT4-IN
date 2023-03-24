import java.util.Scanner;

/**
 *@Author: Andre Marroquin
 * Estructuras de datos Hoja de trabajo 7
 */
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Controladora contr = new Controladora();
        File arch = new File();

        /**
         * Se lee el diccionario y la oracion a traducir
         */
        String diccionario = arch.FileReader("diccionario.txt");
        String oracion = arch.FileReader("texto.txt");
        contr.Agregar(diccionario);
        boolean salir = false;

        /**
         * Menu de opciones
         */
        while (!salir){
            System.out.println("---BIENVENIDO AL TRADUCTOR: ");
            System.out.println("1. Mostrar palabras INORDER (alfabetico) por lenguaje y su respectiva palabra en espaniol.");
            System.out.println("2. Traducir oracion del archivo a espaniol.");
            System.out.println("3. Salir.");
            int des = sc.nextInt();
            sc.nextLine();
            switch (des){
                /**
                 * Se muestra el diccionario en orden alfabetico
                 */
                case 1:
                    System.out.println("\n" + contr.MostrarInOrder() + "\n");
                    break;
                /**
                 * Se traduce la oracion del archivo a espaniol INGLES Y FRANCES
                 */
                case 2:
                    System.out.println("\nDETECTA EL IDIOMA AUTOMATICAMENTE Y LO TRADUCE A ESPAÑOL");
                    System.out.println("||||Se coloca * a las palabras que no se pueden traducir||||\n");
                    System.out.println("Oringinal: ");
                    for (int i = 0; i < 1; i++){
                        System.out.println(oracion);
                    }
                    System.out.println("Traducida: " + "\t" );
                    String IMPRESION = contr.TraductorAesp(oracion);
                    for(int i = 0; i< 1; i ++){
                        System.out.println(IMPRESION);
                    }
                    break;
                /**
                 * Se sale del programa
                 */
                case 3:
                    System.out.println("Saliendo...");
                    salir = true;
                    break;
            }
        }


    }
}