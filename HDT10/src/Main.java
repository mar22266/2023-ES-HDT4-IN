import java.util.Scanner;

/**
 * @autor: Andre Marroquin
 * HDT 10 FLOYD WARSHALL
 * ESTRUCTURA DE DATOS
 */

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n-------Bienvenido al programa de Ruta más Corta------");

        while (true) {
            /**
             * Menu para seleccionar el tipo de mapa
             */
            System.out.println("Ingrese el tipo de mapa que desea utilizar: ");
            System.out.println("1. Valor ruta más corta y ciudades de por medio");
            System.out.println("2. Ciudad del centro del grafo");
            System.out.println("3. Modificar grafo");
            System.out.println("4. Salir");
            int op = sc.nextInt();
            sc.nextLine();
            switch (op) {
                case 1:
                    break;
                case 2:

                    break;
                case 3:
                    while (true) {
                        System.out.println("Ingrese el tipo de mapa que desea utilizar: ");
                        System.out.println("1. Hay interrupción de tráfico entre ciudades?");
                        System.out.println("2. Establecer conexión entre ciudades");
                        System.out.println("3. Indicar el clima");
                        System.out.println("4. Regresar");
                        int op2 = sc.nextInt();
                        sc.nextLine();
                        switch (op2) {
                            case 1:

                                break;
                            case 2:

                                break;
                            case 3:

                                break;
                            case 4:
                                break;
                            default:
                                System.out.println("Opción no válida");
                                break;
                        }
                        if (op2 == 4) {
                            break;
                        }
                    }
                    break;
                case 4:
                    //case 4: Salir
                    System.out.println("Gracias por utilizar el programa, Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida");
                    break;
            }

            if (op == 4) {
                break;
            }
        }
        sc.close();
    }
}

