import java.util.ArrayList;
import java.util.Scanner;

/**
 * @autor: Andre Marroquin
 * HDT 10 FLOYD WARSHALL
 * ESTRUCTURA DE DATOS
 */

public class Main extends Controladora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n-------Bienvenido al programa de Ruta más Corta------");

        while (true) {
            /**
             * Menu para seleccionar el tipo de mapa
             */
            Controladora controladora = new Controladora();
            System.out.println("Ingrese lo que desee hacer:\n ");
            System.out.println("1. Valor ruta más corta y ciudades de por medio");
            System.out.println("2. Ciudad del centro del grafo");
            System.out.println("3. Modificar grafo");
            System.out.println("4. Salir");
            int op = sc.nextInt();
            sc.nextLine();
            switch (op) {
                /**
                 * calcula la ruta mas corta entre dos ciudades y las ciudades de por medio
                 */
                case 1:
                    System.out.println("Ingrese la ciudad de origen: ");
                    String cityOr = sc.nextLine();
                    System.out.println("Ingrese la ciudad de destino: ");
                    String cityDest = sc.nextLine();
                    String men = "";
                    ArrayList<String> shortest = controladora.getRutaMasCorta(cityOr, cityDest);
                    for(int i = 0; i <shortest.size(); i++){
                        men += (i+1) + " " + shortest.get(i) + "\n";
                    }
                    System.out.println(men);
                    break;
                /**
                 * calcula la ciudad del centro del grafo
                 */
                case 2:
                    System.out.println("Centro del grafo: " + controladora.getCentroDelGrafo());
                    break;
                case 3:
                    while (true) {
                        String city1 = "";
                        String city2 = "";
                        String climas = "";
                        String lineas = "";
                        int tiempos [] = new int[4];
                        System.out.println("Ingrese lo que desees hacer:\n ");
                        System.out.println("1. Hay interrupción de tráfico entre ciudades");
                        System.out.println("2. Establecer conexión entre ciudades");
                        System.out.println("3. Cambiar el clima de una ciudad a otra");
                        System.out.println("4. Regresar");
                        int op2 = sc.nextInt();
                        sc.nextLine();
                        switch (op2) {
                            /**
                             * Elimina la conexion entre dos ciudades
                             */
                            case 1:
                            System.out.println("Ingrese la ciudad de origen: ");
                            city1 = sc.nextLine();
                            System.out.println("Ingrese la ciudad de destino: ");
                            city2 = sc.nextLine();
                            lineas = city1 + " " + city2;
                            controladora.Cambiarfile(op2, lineas, climas);
                                break;
                                /**
                                 * Establece una conexion entre dos ciudades
                                 */
                            case 2:
                                System.out.println("Ingrese la ciudad de origen: ");
                                city1 = sc.nextLine();
                                System.out.println("Ingrese la ciudad de destino: ");
                                city2 = sc.nextLine();
                                System.out.println("Ingrese el tiempo de viaje normal: ");
                                tiempos[0] = Integer.parseInt(sc.nextLine());
                                System.out.println("Ingrese el tiempo de viaje con lluvia: ");
                                tiempos[1] = Integer.parseInt(sc.nextLine());
                                System.out.println("Ingrese el tiempo de viaje con nieve: ");
                                tiempos[2] =Integer.parseInt(sc.nextLine());
                                System.out.println("Ingrese el tiempo de viaje con tormenta: ");
                                tiempos[3] = Integer.parseInt(sc.nextLine());
                                lineas = city1 + " "+ city2 + " " + tiempos[0] + " " + tiempos[1] + " " + tiempos[2] + " " + tiempos[3];
                                controladora.Cambiarfile(op2, lineas, climas);
                                
                                break;
                            /**
                             * Cambia el clima de una ciudad a otra
                             */
                            case 3:
                            System.out.println("Ingrese la ciudad de origen que quiere cambiar el clima: ");
                            city1 = sc.nextLine();
                            System.out.println("Ingrese la ciudad de destino que quiere cambiar el clima: ");
                            city2 = sc.nextLine();
                            lineas = city1 + " " + city2;
                            System.out.println("Ingrese el clima que quiere que tenga la ciudad como clima normal: \n1. Normal\n2. Lluvia\n3. Nieve\n4. Tormenta");
                            String clima = sc.nextLine();
                            controladora.Cambiarfile(op2, lineas, clima);
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

