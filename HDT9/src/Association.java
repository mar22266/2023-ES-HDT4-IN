/**
 * @author Andre marroquin, 22266
 * HDT 9 - Estructura de datos
 */
public class Association<K,V> implements I_In<K,V> {

    /**
     * Clase que crea una asociacion entre una llave y un valor
     */
    protected K Key;
    protected V Value;

    /**
     * Constructor de la clase
     * @param key
     * @param value
     */
    public Association(K key, V value)
    {
        Key = key;
        Value = value;
    }

    /**
     * constructor de la clase
     * @param key
     */
    public Association(K key)
    {
        this(key,null);
    }

    /**
     * Compara si dos objetos son iguales
     * @param other
     * @return
     */
    public boolean equals(Object other)
    {
        Association otherAssoc = (Association)other;
        return getKey().equals(otherAssoc.getKey());
    }


    /**
     * obtiene el hashcode
     * @return
     */
    public int hashCode()
    {
        return getKey().hashCode();
    }

    /**
     * obtiene el valor
     * @return
     */
    public V getValue()
    {
        return Value;
    }

    /**
     * Compara si dos objetos son iguales
     * @param o
     * @return
     */
    @Override
    public boolean equeals(Object o) {
        return false;
    }

    /**
     * obtiene la llave
     * @return
     */
    public K getKey()
    {
        return Key;
    }

    /**
     * setea un valor al hashmap
     * @param value
     * @return
     */
    public V setValue(V value)
    {
        V oldValue = Value;
        Value = value;
        return oldValue;
    }


}


