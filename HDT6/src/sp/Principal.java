package sp;

import java.util.Map;
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
        boolean op = false;

        Factory<String, String> hashh = new Factory<String, String>();
        Map<String, String> collection = null;
        Map<String, String> Datos = null;

        while (!op) {
            System.out.println("------Bienvenido-----");
            System.out.println("Ingrese la opcion que desea: ");
            System.out.println(" 1.Hash Map\n 2.Tree Map\n 3.Linked Hash Map");
            System.out.println("Ingrese el tipo de mapa que desea utilizar");
            int des = sc.nextInt();
            sc.nextLine();
            try {
                collection = hashh.getMap(des);
                Datos = Archivo.readfile(des, "super.txt");
                op = true;
            } catch (Exception e) {
                System.out.println("Error");
            }
        }

        int decision = 0;
         do {
             System.out.println("Ingrese la opcion que desea: ");
             System.out.println(" 1. Agregar a la coleccion\n 2. Mostrar categoria del producto\n 3. Mostrar datos de producto en coleccion\n 4. Mostrar coleccion por tipo\n 5. Mostrar los productos existentes\n 6. Mostrar productos existentes ordenados por tipo\n 7. Salir ");


                 decision = sc.nextInt();
                 sc.nextLine();
                 switch (decision) {
                     case 1:
                         System.out.println("\nIngrese el nombre del producto a agregar");
                         String nombre = sc.nextLine();
                         try {
                             collection = Contro.Add(nombre, Datos, collection);
                             System.out.println("Producto agregado\n");
                         } catch (Exception e) {
                             System.out.println("Error no se encuentra ese producto\n");
                         }
                         break;
                     case 2:
                         System.out.println("\nIngrese el nombre de la carta para saber el tipo");
                         String nombre2 = sc.nextLine();
                         try {
                             System.out.println("Tipo de " + nombre2 + ": " + Contro.Tipo(nombre2, Datos) + "\n");
                         } catch (Exception e) {
                             System.out.println(e.getMessage() + "\n");
                         }
                         break;
                     case 3:
                         System.out.println(Contro.MostrarMap(collection, true));
                         System.out.println(Contro.MostrarMap(collection, false));
                         break;
                     case 4:
                         System.out.println(Contro.MostrarOrdenadp(collection, true));
                         System.out.println(Contro.MostrarOrdenadp(collection, false));
                         break;
                     case 5:
                         System.out.println(Contro.MostrarMap(Datos, true));
                         System.out.println(Contro.MostrarMap(Datos, false));
                         break;
                     case 6:
                         System.out.println(Contro.MostrarOrdenadp(Datos, true));
                         System.out.println(Contro.MostrarOrdenadp(Datos, false));
                         break;
                     case 7:
                         System.out.println("Gracias por usar el programa");
                         break;
                     default:
                         System.out.println("Opcion no valida");
                         break;
                 }


         } while (decision != 7);
    }

}