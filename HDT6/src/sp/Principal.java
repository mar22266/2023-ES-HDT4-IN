package sp;

import java.util.Scanner;

/**
 *
 * @author Andre Marroquin
 * HDT 6
 * Algoritmos y estructuras de datos
 */
public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("-----Bienvenido-----");
        String menu = "1. HashMap\n 2. TreeMap \n 3. LinkedHashMap\n 4. Salir\n";
        System.out.println(menu);
        int opcion;
        opcion = sc.nextInt();
        sc.nextLine();
        switch (opcion) {
            case 1:

                System.out.println(menu);
                break;

            case 2:

                System.out.println(menu);
                break;

            case 3:
                System.out.println(menu);
                break;

            case 4:
                System.out.println("Gracias por usar el programa");
                break;
            default:
                System.out.println("Opcion no valida");
                break;
        }
        System.out.println(menu);
        opcion = sc.nextInt();
        sc.nextLine();
    }
}
