/**
 * @author Andre marroquin, 22266
 * HDT 9 - Estructura de datos
 */
public class Factory{

    /**
     * Selecciona el tipo de mapa
     * @param op eleccion del usuario
     * @return el tipo de mapa
     */

    public IMap gett(String op) {
        return switch (op) {
            case "HashMap" -> new HashMapa();
            case "RBT" -> new RBT();
            case "Splay" -> new Splay();
            default -> throw new IllegalArgumentException("ERROR");
        };
    }
}
