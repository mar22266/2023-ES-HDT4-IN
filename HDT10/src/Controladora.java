import java.io.*;
import java.util.*;
/**
 * @autor: Andre Marroquin
 * HDT 10 FLOYD WARSHALL
 * ESTRUCTURA DE DATOS
 */


public class Controladora extends Nodo {

    /**
     * crea el mapa de ciudades y el arraylist y demas atributos necesarios
     */
    private Map<String, Integer> CitiesIn = new HashMap<>();
    private FloydWarshall floydWarshall;
    private Map<String, Nodo> ciudades = new HashMap<>();
    private String[] cities;
    ArrayList<String> lister = new ArrayList<>();


    /**
     * Constructor de la clase
     */
    public Controladora() {
        readFile();
        crearFloydWarshall();
    }


    /**
     * Crea el objeto de la clase FloydWarshall
     */
    public FloydWarshall getFloydWarshall() {
        return floydWarshall;
    }

    /**
     * Lee el archivo de texto
     */
    public void readFile() {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(".\\src\\logistica.txt"));

            String linea;
            while ((linea = reader.readLine()) != null) {
                lister.add(linea);
                String[] datos = linea.split(" ");
                if (datos.length != 6) {
                    System.out.println("Línea con formato incorrecto: " + linea);
                    continue; 
                }
                String cityOrigin = datos[0];
                String cityDestiny = datos[1];

                Integer[] tiempos = new Integer[4];
                for (int i = 0; i < 4; i++) {
                    tiempos[i] = Integer.parseInt(datos[i + 2]);
                }
                Nodo ciudadOrigen = ciudades.getOrDefault(cityOrigin, new Nodo(cityOrigin));
                ciudadOrigen.AgregarDistancia(cityDestiny, tiempos);
                ciudades.putIfAbsent(cityOrigin, ciudadOrigen);
                Nodo ciudadDestino = ciudades.getOrDefault(cityDestiny, new Nodo(cityDestiny));
                ciudadDestino.AgregarDistancia(cityOrigin, tiempos);  
                ciudades.putIfAbsent(cityDestiny, ciudadDestino);
            }
            reader.close();
        } catch (IOException e) {
            System.out.println("Error al leer el archivo");
            e.printStackTrace();
        }
    }

    /**
     * cambia el archivo de texto
     * @param opcion
     * @param linea
     * @param clima
     */
    public void Cambiarfile(int opcion , String linea, String clima){

        if(opcion == 1){
            for(int i = 0; i < lister.size(); i++){
                if(lister.get(i).contains(linea)){
                    lister.remove(i);
                }
            }
        }
        if(opcion == 2){
            lister.add(linea);
        }
        if(opcion == 3){
            for(int i = 0; i < lister.size(); i++){
                if(lister.get(i).contains(linea)){
                    String [] datos = lister.get(i).split(" ");
                    switch (clima){
                        case "1":
                            datos[2] = datos[2];
                            break;
                        case "2":
                            datos[2] = datos[3];
                            break;
                        case "3":
                            datos[2] = datos[4];
                            break;
                        case "4":
                            datos[2] = datos[5];
                            break;
                        default:
                            System.out.println("Opcion no valida");
                            break;
                    }
                    lister.set(i, datos[0] + " " + datos[1] + " " + datos[2] + " " + datos[3] + " " + datos[4] + " " + datos[5]);
                }
            }
        }
        File archivo = new File(".\\src\\logistica.txt");
        try {
            FileWriter miEscritor = new FileWriter(archivo);
            for (int i = 0; i < lister.size(); i++) {
                miEscritor.write(lister.get(i) + "\n");
            }
            miEscritor.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Crea el algoritmo de FloydWarshall
     * @return
     * @throws Exception
     */
    private void crearFloydWarshall() {
        int n = ciudades.size();
        int[][] distancias = new int[n][n];
        String[][] recorridos = new String[n][n];

        for (int i = 0; i < n; i++) {
            Arrays.fill(distancias[i], Integer.MAX_VALUE);
            distancias[i][i] = 0;
            Arrays.fill(recorridos[i], "-");
        }
        cities = new String[n];
        for (int i = 0; i < n; i++) {
            cities[i] = (String) ciudades.keySet().toArray()[i];
            CitiesIn.put(cities[i], i);
        }

        //matriz de recorridos
        for (int j = 0; j < n; j++) {
            for (int i = 0; i < n; i++) {
                if (i != j && recorridos[i][j].equals("-")) {
                    recorridos[i][j] = cities[j];
                }
            }
        }

        //matriz de distancias
        for (Nodo ciudad : ciudades.values()) {
            for (Map.Entry<String, Integer[]> entry : ciudad.getTripTimes().entrySet()) {
                int origen = getIndexByName(ciudad.getName());
                int destino = getIndexByName(entry.getKey());
                if (origen != -1 && destino != -1) { 
                    distancias[origen][destino] = entry.getValue()[0];
                }
            }
        }

        this.floydWarshall = new FloydWarshall(distancias, recorridos, n, cities);

        floydWarshall.CalcularRutas();
        recorridos = floydWarshall.getRecorridos();
        distancias = floydWarshall.getDistancias();

    }


    /**
     * @param nombre
     * @return
     * retorna el indice de la ciudad
     */
    public Integer getIndexByName(String nombre) {
        Integer indice = CitiesIn.get(nombre);
        if (indice == null) {
            System.out.println("No se encontro: " + nombre);
            return -1; 
        } else {
            return indice;
        }
    }


    /**
     * @param ciudadOrigen
     * @param ciudadDestino
     * calcula el centro del grafo
     * @return
     */
    public String getCentroDelGrafo() {
        int[][] distancias = floydWarshall.getDistancias();
        int minMaxDistancia = Integer.MAX_VALUE;
        String centro = null;
        for (String ciudad : ciudades.keySet()) {
            int indiceCiudad = getIndexByName(ciudad);
            int maxDistancia = Integer.MIN_VALUE;
            for (int i = 0; i < distancias[indiceCiudad].length; i++) {
                if (i != indiceCiudad) {
                    maxDistancia = Math.max(maxDistancia, distancias[indiceCiudad][i]);
                }
            }
            if (maxDistancia < minMaxDistancia) {
                minMaxDistancia = maxDistancia;
                centro = ciudad;
            }
        }
        return centro;
    }


    public ArrayList<String> getRutaMasCorta(String ciudadSalida, String ciudadDestino) {
        int indiceOrigen = getIndexByName(ciudadSalida);
        int indiceDestino = getIndexByName(ciudadDestino);

        if (indiceOrigen == -1 || indiceDestino == -1) {
            return null;
        }

        String[][] recorridos = floydWarshall.getRecorridos();

        ArrayList<String> ruta = new ArrayList<>();
        ruta.add(ciudadSalida);

        while (!recorridos[indiceDestino][indiceOrigen].equals(ciudadSalida)) {
            ruta.add(recorridos[indiceDestino][indiceOrigen]);
            indiceDestino = getIndexByName(recorridos[indiceDestino][indiceOrigen]);
        }

        ruta.add(ciudadDestino);
        return ruta;
    }


}