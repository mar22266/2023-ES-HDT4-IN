package sp;
import java.util.*;

/**
 *
 * @author Andre Marroquin
 * HDT 6
 * Algoritmos y estructuras de datos
 */
public class Contro {

    public static String Tipo(String key,Map<String,String> mapa) throws Exception{
        String valor =mapa.get(key);
        if (valor ==null){
            throw new Exception("Error carta no esta en las existentes");
        }
        return valor;
    }


    public static String MostrarMap(Map<String,String> mapa,boolean PRINT){
        String var = "";
        if (mapa.isEmpty()){
            var ="\nCollecion vacia";
        } else {
            if (PRINT){
                var ="\nDatos en la coleccion";
                for (String dato: mapa.keySet()){
                    var = var + "\nCategoria: "+mapa.get(dato)+"\t\t"+" Nombre: "+dato;
                }
            }
        }
        return var;
    }

    public static Map<String,String> Add(String key,Map<String,String> mapa,Map<String,String> colection) throws Exception{
        colection.put(key,Tipo(key,mapa));
        return colection;
    }




        public static String MostrarOrdenadp(Map<String,String> mapa,boolean PRINT){
        String var = "";
        Comparator<Map.Entry> compareByKeyType = new Comparator<Map.Entry>() {
            public int compare(Map.Entry a1, Map.Entry a2) {
                Comparable value1 = (Comparable) a1.getValue();
                Comparable value2 = (Comparable) a2.getValue();
                return value1.compareTo(value2);
            }
        };
        Set entrySet = mapa.entrySet();
        ArrayList<Map.Entry> sortedEntries = new ArrayList(entrySet);
        sortedEntries.sort(compareByKeyType);
        if (mapa.isEmpty()){
            var ="\nCollecion vacia";
        } else {
            if(PRINT){
                var = "\nDatos: ";
                for (Map.Entry entry:
                        sortedEntries) {
                    var = var + "\n Categoria: " +entry.getValue() + "\t\t"+ " Nombre: "+ entry.getKey();
                }
            }
        }
        return var;
    }
}