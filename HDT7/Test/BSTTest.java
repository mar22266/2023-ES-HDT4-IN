import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BSTTest {

    /**
     * Metodo que hace la busqueda
     * se agregan los valores de la llave y su respectivo valor luego se llama la llave y se compara con el valor si es el que se espera
     */
    @Test
    void insert() {
        BST<String, String> bst = new BST<String, String>(new Comparadora<String>());
        bst.insert("Edad", "15");
        bst.insert("Nombre", "Diego");
        assertEquals("15", bst.find("Edad"));
        assertEquals("Diego", bst.find("Nombre"));
    }

    /**
     * Metodo que comprueba si hace bien la insercion de los valores en el arbol
     * se insertan 4 llaves con su respectivo valor
     * luego se ve si el arbol esta vacio y si tiene 4 valores
     * si el arbol devuleve false a vacio y 4 a count es porque si hizo bien la insercion
     */
    @Test
    void find() {
        BST<String,String> bst = new BST<String, String>(new Comparadora<String>());
        bst.insert("5","primero");
        bst.insert("3","segundo");
        bst.insert("7","tercero");
        bst.insert("1","cuarto");

        assertEquals(4, bst.count());
        assertEquals(false, bst.isEmpty());
    }

}