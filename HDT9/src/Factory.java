/**
 * @author Andre marroquin, 22266
 * HDT 9 - Estructura de datos
 */
public class Factory<K, V> {

    /**
     * metodo para ver que tipo de arbol se va a utilizar
     * @param op opcion de arbol
     * @return retorna el arbol
     */
    public IMap<K, V> getStack(int op){
        if(op==1){
            return null;
        }else if(op==2){
            return new HashMap<K, V>();
        }
        return null;
    }
}
