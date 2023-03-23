import java.util.ArrayList;
import java.util.Comparator;

/**
 *@Author: Andre Marroquin and MAAG, Internet
 * Estructuras de datos Hoja de trabajo 7
 */
public class BST<K,V> implements IBST<K,V>{

    /**
     * Atributos del binary search tree
     */
    private Association<K,V> raiz;
    private Comparator<K> comparador;
    private int contador;

    /**
     * Constructor del binary search tree
     * @param comparador comparadora de llaves
     */
    public BST(Comparator<K> comparador){
        this.comparador = comparador;
        contador = 0;
        raiz = null;
    }

    /**
     * Metodo que inserta un valor en el arbol
     * @param key
     * @param value
     */
    @Override
    public void insert(K key, V value) {
        if (isEmpty()){
            raiz = new Association<K,V>(key,value);
            contador++;
        }
        else{
            internalInsert(raiz,key,value);
        }

    }

    /**
     * Metodo que inserta un valor adentro en el arbol
     * @param actual valor actual
     * @param key llave
     * @param value valor
     */
    private void internalInsert(Association<K, V> actual, K key, V value) {
        int result = comparador.compare(actual.getKey(),key);
        /**
         * Si el resultado es mayor a 0, se inserta a la izquierda
         */
        if (result > 0) {
            if (actual.getIzquierda() == null) {
                Association<K, V> newNode = new Association<K, V>(key, value);
                actual.setIzquierda(newNode);
                newNode.setPadre(actual);
                 contador++;
            }
            else {
                internalInsert(actual.getIzquierda(), key, value);
            }
            /**
             * Si el resultado es menor a 0, se inserta a la derecha
             */
        } else if (result < 0) {
            if (actual.getDerecha() == null) {
                Association<K, V> newNode = new Association<K, V>(key, value);
                actual.setDerecha(newNode);
                newNode.setPadre(actual);
                contador++;
            } else {
                internalInsert(actual.getDerecha(), key, value);
            }
        }

    }

    /**
     * Metodo que realiza la busqueda de un valor en el arbol
     * @param key
     * @return
     */
    public V find(K key) {
        return internalFind(raiz,key);
    }

    /**
     * Metodo que realiza la busqueda de un valor en el arbol
     * @param actual
     * @param key
     * @return
     */
    private V internalFind(Association<K, V> actual, K key) {
        if (actual != null) {
            int result = comparador.compare(actual.getKey(), key);

            if (result > 0) {
                return internalFind(actual.getIzquierda(), key);
            } else if (result < 0) {
                return internalFind(actual.getDerecha(), key);
            } else {
                return actual.getValue();
            }

        } else {
            return null;
        }
    }

    /**
     * Metodo que elimina un valor en el arbol
     * @param key
     * @return
     */
    public V delete(K key) {
        if (!isEmpty()) {
            int result = comparador.compare(raiz.getKey(), key);
            if (result > 0) {
                return internalDelete(raiz.getIzquierda(), key, true);
            } else if (result < 0) {
                return internalDelete(raiz.getDerecha(), key, false);
            } else {

                if (count() == 1) {

                    V temp = raiz.getValue();
                    raiz = null;
                    contador--;
                    return temp;

                }
                else {

                    V valorTemporal = raiz.getValue();

                    if (raiz.getDerecha() != null) {

                        Association<K, V>  IzquierdaDeLaDerecha = raiz.getDerecha();

                        while(IzquierdaDeLaDerecha.getIzquierda() != null) {
                            IzquierdaDeLaDerecha = IzquierdaDeLaDerecha.getIzquierda();
                        }


                        IzquierdaDeLaDerecha.setIzquierda(raiz.getIzquierda());
                        if (IzquierdaDeLaDerecha.getIzquierda() != null)
                            IzquierdaDeLaDerecha.getDerecha().setPadre(IzquierdaDeLaDerecha);


                        if (comparador.compare(raiz.getDerecha().getKey(), IzquierdaDeLaDerecha.getKey()) != 0) {
                            IzquierdaDeLaDerecha.getPadre().setIzquierda(null);

                            Association<K, V> NuevaDerechaRaiz = IzquierdaDeLaDerecha;

                            while (NuevaDerechaRaiz.getDerecha() != null) {
                                NuevaDerechaRaiz = NuevaDerechaRaiz.getDerecha();
                            }

                            NuevaDerechaRaiz.setDerecha(raiz.getDerecha());
                            if (NuevaDerechaRaiz.getDerecha() != null) {
                                NuevaDerechaRaiz.getDerecha().setPadre(NuevaDerechaRaiz);;
                            }

                        }


                        if (IzquierdaDeLaDerecha.getDerecha() != null)
                            IzquierdaDeLaDerecha.getDerecha().setPadre(IzquierdaDeLaDerecha);

                        IzquierdaDeLaDerecha.setPadre(null);
                        raiz = IzquierdaDeLaDerecha;

                        contador--;
                        return valorTemporal;

                    } else {

                        Association<K, V> DerechaDeLaIzquierda = raiz.getIzquierda();

                        while(DerechaDeLaIzquierda.getDerecha() != null) {
                            DerechaDeLaIzquierda = DerechaDeLaIzquierda.getDerecha();
                        }


                        DerechaDeLaIzquierda.setDerecha(raiz.getDerecha());
                        if (DerechaDeLaIzquierda.getDerecha() != null)
                            DerechaDeLaIzquierda.getDerecha().setPadre(DerechaDeLaIzquierda);


                        if (comparador.compare(raiz.getIzquierda().getKey(), DerechaDeLaIzquierda.getKey()) != 0) {
                            DerechaDeLaIzquierda.getPadre().setDerecha(null);

                            Association<K, V> NuevaRaizIzquierda = DerechaDeLaIzquierda;

                            while (NuevaRaizIzquierda.getIzquierda() != null) {
                                NuevaRaizIzquierda = NuevaRaizIzquierda.getIzquierda();
                            }

                            NuevaRaizIzquierda.setIzquierda(raiz.getIzquierda());
                            if (NuevaRaizIzquierda.getIzquierda() != null) {
                                NuevaRaizIzquierda.getIzquierda().setPadre(NuevaRaizIzquierda);;
                            }

                        }


                        if (DerechaDeLaIzquierda.getIzquierda() != null)
                            DerechaDeLaIzquierda.getIzquierda().setPadre(DerechaDeLaIzquierda);

                        DerechaDeLaIzquierda.setPadre(null);
                        raiz = DerechaDeLaIzquierda;

                        contador--;
                        return valorTemporal;
                    }
                }
            }
        }
        return null;
    }

    /**
     * Metodo que elimina un valor del arbol interno
     * @param actual valor actual
     * @param key llave
     * @param isLeft verifica la izquierda
     * @return
     */
    private V internalDelete(Association<K, V> actual, K key, boolean isLeft) {
        if (actual != null) {
            int result = comparador.compare(actual.getKey(), key);
            if (result > 0) {
                return internalDelete(actual.getIzquierda(), key, true);
            } else if (result < 0) {
                return internalDelete(actual.getDerecha(), key, false);
            } else {

                if ( (actual.getIzquierda() == null) && (actual.getDerecha() == null) ) {
                    V valorTemporal = actual.getValue();
                    if (isLeft) {
                        actual.getPadre().setIzquierda(null);
                        actual.setPadre(null);
                    } else {
                        actual.getPadre().setDerecha(null);
                        actual.setPadre(null);
                    }
                    contador--;
                    return valorTemporal;
                } else {

                    V valorTemporal = actual.getValue();

                    if (actual.getDerecha() != null) {

                        Association<K, V> IzquierdaDeLaDerecha = actual.getDerecha();

                        while(IzquierdaDeLaDerecha.getIzquierda() != null) {
                            IzquierdaDeLaDerecha = IzquierdaDeLaDerecha.getIzquierda();
                        }

                        IzquierdaDeLaDerecha.setIzquierda(actual.getIzquierda());
                        if (IzquierdaDeLaDerecha.getIzquierda() != null)
                            IzquierdaDeLaDerecha.getIzquierda().setPadre(IzquierdaDeLaDerecha);


                        if (comparador.compare(actual.getDerecha().getKey(), IzquierdaDeLaDerecha.getKey()) != 0) {
                            IzquierdaDeLaDerecha.getPadre().setIzquierda(null);

                            Association<K, V> NuevaDerechaRaiz = IzquierdaDeLaDerecha;

                            while (NuevaDerechaRaiz.getDerecha() != null) {
                                NuevaDerechaRaiz = NuevaDerechaRaiz.getDerecha();
                            }

                            NuevaDerechaRaiz.setDerecha(actual.getDerecha());
                            if (NuevaDerechaRaiz.getDerecha() != null) {
                                NuevaDerechaRaiz.getDerecha().setPadre(NuevaDerechaRaiz);;
                            }

                        }


                        if (IzquierdaDeLaDerecha.getDerecha() != null)
                            IzquierdaDeLaDerecha.getDerecha().setPadre(IzquierdaDeLaDerecha);


                        IzquierdaDeLaDerecha.setPadre(actual.getPadre());
                        if (isLeft) {
                            IzquierdaDeLaDerecha.getPadre().setIzquierda(IzquierdaDeLaDerecha);
                        } else {
                            IzquierdaDeLaDerecha.getPadre().setDerecha(IzquierdaDeLaDerecha);
                        }

                        contador--;
                        return valorTemporal;

                    } else {

                        Association<K, V> DerechaDeLaIzquierda = actual.getDerecha();

                        while(DerechaDeLaIzquierda.getDerecha() != null) {
                            DerechaDeLaIzquierda = DerechaDeLaIzquierda.getDerecha();
                        }


                        DerechaDeLaIzquierda.setDerecha(actual.getDerecha());
                        if (DerechaDeLaIzquierda.getDerecha() != null)
                            DerechaDeLaIzquierda.getDerecha().setPadre(DerechaDeLaIzquierda);


                        if (comparador.compare(actual.getIzquierda().getKey(), DerechaDeLaIzquierda.getKey()) != 0) {
                            DerechaDeLaIzquierda.getPadre().setDerecha(null);

                            Association<K, V> NuevaRaizIzquierda = DerechaDeLaIzquierda;

                            while (NuevaRaizIzquierda.getIzquierda() != null) {
                                NuevaRaizIzquierda = NuevaRaizIzquierda.getIzquierda();
                            }

                            NuevaRaizIzquierda.setIzquierda(actual.getDerecha());
                            if (NuevaRaizIzquierda.getIzquierda() != null) {
                                NuevaRaizIzquierda.getIzquierda().setPadre(NuevaRaizIzquierda);;
                            }

                        }
                        if (DerechaDeLaIzquierda.getIzquierda() != null)
                            DerechaDeLaIzquierda.getIzquierda().setPadre(DerechaDeLaIzquierda);

                        DerechaDeLaIzquierda.setPadre(actual.getPadre());
                        if (isLeft) {
                            DerechaDeLaIzquierda.getPadre().setIzquierda(DerechaDeLaIzquierda);
                        } else {
                            DerechaDeLaIzquierda.getPadre().setDerecha(DerechaDeLaIzquierda);
                        }

                        contador--;
                        return valorTemporal;

                    }

                }

            }

        } else {
            return null;
        }
    }

    /**
     * Metodo que retorna el numero de elementos del arbol
     * @return
     */
    public int count() {
        return contador;
    }

    /**
     * Metodo que verifica si el arbol esta vacio
     * @return
     */
    public boolean isEmpty() {
        return contador == 0;
    }


    /**
     * Metodo que retorna los elementos del arbol
     * @return lista de elementos
     */
    public ArrayList<V> getElements() {
        ArrayList<V> list = new ArrayList<V>();

        internalGetElements(list, raiz);

        return list;
    }

    /**
     * Metodo que retorna los elementos del arbol
     * @param list lista de elementos
     * @param actual valor actual
     */
    private void internalGetElements(ArrayList<V> list, Association<K, V> actual) {
        if (actual != null) {
            internalGetElements(list, actual.getDerecha());

            list.add((V)(actual.getKey() + "=" + actual.getValue()));

            internalGetElements(list, actual.getDerecha());
        }
    }
}
