package sp;

import java.util.Arrays;
import java.util.Scanner;

public class Main {



    private static int IntV(Scanner sc,String m, boolean abso, Integer... validValues) {

        while (true) {

                System.out.println(m);
                int valor = sc.nextInt();
                sc.nextLine();

                if (Arrays.asList(validValues).contains(valor) || validValues.length == 0)
                    return abso ? Math.abs(valor) : valor;
                else
                    System.out.println("Intente otra vez con numero valido");


        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CalculatorSingleton calc = CalculatorSingleton.getInstance();
        boolean flag = false;

        System.out.println("Bienvenido a la calculadora");
        System.out.println("Debe Ingresa la direccion del archivo con la operacion que desea realizar en la clase archivo donde esta la variable path");
        while (!flag){
            String m = "\nIngrese como quiere realizar su operacion: \n1. Vector\n2. ArrayList\n3. SingleLinkedList\n4. DoubleLinkedList";

            int im = IntV(sc, m, false, 1, 2, 3, 4);
            m = "\n1.Ejecutar archivo\n2.Salir del programa";

            int des = IntV(sc, m, false, 1, 2);

            switch (des){
                case 1:
                    String [] arch = null;
                    boolean rp = true;
                    while(rp){
                        try{
                            arch = Archivo.readFile();
                            rp = false;
                        }
                        catch (Exception e){
                            System.out.println("Error al leer el archivo/ o no fue encontrado\n");
                        }
                    }
                    System.out.println("\nPerfecto si se encontro su archivo");
                    int cont = 1;
                    for(String sector: arch){
                        try{
                            System.out.println("--------------------------------------------");
                            System.out.println("lINEA: "+cont);
                            System.out.println("Operacion: "+sector);
                            String posti = calc.ItoPCalc(sector, im);
                            System.out.println("Post: "+posti);
                            System.out.println("Resultado: "+calc.calculate(posti));
                            System.out.println("--------------------------------------------");

                        }
                        catch (Exception e){
                            System.out.println("Error en la linea "+cont);
                        }
                        cont++;
                    }
                    break;

                case 2:
                    System.out.println("CERRANDO CALCULADORA");
                    flag = true;
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;



            }
        }


    }
}