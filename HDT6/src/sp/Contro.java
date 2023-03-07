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
                var ="\nCategorias en la coleccion";
                for (String dato: mapa.keySet()){
                    var = var + "\n Nombre: "+dato +", Categoria: "+mapa.get(dato);
                }
            }
        }
        return var;
    }

    public static Map<String,String> Add(String key,Map<String,String> mapa,Map<String,String> colection) throws Exception{
        colection.put(key,Tipo(key,mapa));
        return colection;
    }



}