import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.PriorityQueue;
import java.util.Scanner;

/**
 * @author Andre Marroquin
 * HDT8 algoritmos y estructuras de datos
 */

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        boolean salir = false;
        while (!salir) {
            System.out.println("\nBienvenido al programa");
            System.out.println(" 1. Utilizar JCF PriorityQueue\n 2. Utilizar VectorHeap Realizada\n 3. Salir");
            System.out.println("Ingrese el numero de la opcion que desea realizar: ");
            int opcion = sc.nextInt();
            sc.nextLine();
            switch (opcion) {
                case 1:
                    /**
                     * Crea la prioruty queue
                     * Leer el archivo procesos.txt
                     */
                    PriorityQueue<Proceso> QUEUE = new PriorityQueue<>();
                    try (BufferedReader br = new BufferedReader(new FileReader("procesos.txt"))) {
                        String line;
                        while ((line = br.readLine()) != null) {
                            String[] tokens = line.split(",");
                            String nombre = tokens[0];
                            String usuario = tokens[1];
                            int nice = Integer.parseInt(tokens[2]);
                            Proceso p = new Proceso(nombre, usuario, nice);
                            QUEUE.add(p);
                        }
                    } catch (IOException e) {
                        e.printStackTrace();
                    }

                    /**
                     * Imprimir los procesos ordenados por prioridad
                     */
                    while (!QUEUE.isEmpty()) {
                        Proceso proces = QUEUE.poll();
                        StringBuilder union = new StringBuilder();
                        union.append(proces.getNombreProceso()).append(",");
                        union.append(proces.getNombreUsuario()).append(",");
                        union.append(proces.getValorNice()).append(",");
                        union.append("PR=").append(proces.getPrioridad());
                        System.out.println(union.toString());
                    }
                    break;

                case 2:
                    /**
                     * Crea el vector heap
                     * Leer el archivo procesos.txt
                     */
                    VectorHeap<Proceso> HEAP = new VectorHeap<>();
                    try (BufferedReader br = new BufferedReader(new FileReader("procesos.txt"))) {
                        String line;
                        while ((line = br.readLine()) != null) {
                            String[] tokens = line.split(",");
                            String nombre = tokens[0];
                            String usuario = tokens[1];
                            int nice = Integer.parseInt(tokens[2]);
                            Proceso p = new Proceso(nombre, usuario, nice);
                            HEAP.add(p);
                        }
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    /**
                     * Imprimir los procesos ordenados por prioridad
                     */
                    while (!HEAP.isEmpty()) {
                        Proceso proces = HEAP.remove();
                        StringBuilder union = new StringBuilder();
                        union.append(proces.getNombreProceso()).append(",");
                        union.append(proces.getNombreUsuario()).append(",");
                        union.append(proces.getValorNice()).append(",");
                        union.append("PR=").append(proces.getPrioridad());
                        System.out.println(union.toString());
                    }
                    break;

                case 3:
                    salir = true;
                    System.out.println("Saliendo del programa");
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
            }

        }

    }
}
