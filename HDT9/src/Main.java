import java.util.Scanner;

/**
 * @author Andre marroquin, 22266
 * HDT 9 - Estructura de datos
 */

/**
 * Clase main interaccion con el usuario
 */
public class Main {
    public static void main(String[] args) {
        IMap<String, String> datos;
        String res = "";
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        System.out.println("\n-------Bienvenido al programa de traduccion de palabras------");
        while (flag){
            /**
             * Menu para seleccionar el tipo de mapa
             */
            System.out.println("Ingrese el tipo de mapa que desea utilizar: ");
            System.out.println("1. HashMap");
            System.out.println("2. RBT");
            System.out.println("3. Splay");
            System.out.println("4. Salir");
            Factory fact = new Factory();
            int op = sc.nextInt();
            switch (op){
                //case 1: HashMapa
                case 1:
                    res = "HashMap";
                    datos = fact.gett(res);
                    Archivo rd = new Archivo();
                    rd.lectura(datos);
                    rd.oracion(datos);
                    break;
                case 2:
                    //case 2: RBT
                    res = "RBT";
                    datos = fact.gett(res);
                    Archivo rd2 = new Archivo();
                    rd2.lectura(datos);
                    rd2.oracion(datos);
                    break;
                case 3:
                    //case 3: Splay
                    res = "Splay";
                    datos = fact.gett(res);
                    Archivo rd3 = new Archivo();
                    rd3.lectura(datos);
                    rd3.oracion(datos);
                    break;
                case 4:
                    //case 4: Salir
                    flag = false;
                    System.out.println("Gracias por utilizar el programa");
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
            }

        }

        }
    }
