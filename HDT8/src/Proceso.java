/**
 * @author Andre Marroquin
 * HDT8 algoritmos y estructuras de datos
 */

/**
 * Clase Proceso
 */
public class Proceso implements Comparable<Proceso> {
    /**
     * Atributos
     */
    private String nombreProceso;
    private String nombreUsuario;
    private int valorNice;

    /**
     * Constructor
     * @param nombreProceso nombre del proceso
     * @param nombreUsuario nombre del usuario
     * @param valorNice valor de nice
     */

    public Proceso(String nombreProceso, String nombreUsuario, int valorNice) {
        this.nombreProceso = nombreProceso;
        this.nombreUsuario = nombreUsuario;
        this.valorNice = valorNice;
    }

    /**
     * meodo que obtiene el nombre del proceso
     * @return
     */
    public String getNombreProceso() {
        return nombreProceso;
    }

    /**
     * metodo que obtiene el nombre del usuario
     * @return
     */
    public String getNombreUsuario() {
        return nombreUsuario;
    }

    /**
     * metodo que obtiene el valor de nice
     * @return
     */
    public int getValorNice() {
        return valorNice;
    }

    /**
     * metodo que obtiene la prioridad
     * @return
     */
    public int getPrioridad() {
        return (20 + valorNice)+100;
    }

    /**
     * metodo que compara los procesos
     * @param o onjeto que se va a comparar
     * @return la prioridad del proceso
     */
    public int compareTo(Proceso o) {
        return Integer.compare(this.getPrioridad(), o.getPrioridad());
    }

    /**
     * metodo que imprime los procesos
     * @return
     */
    @Override
    public String toString() {
        return getNombreProceso() + "," + getNombreUsuario()+ "," + getValorNice() + ",PR=" + getPrioridad();
    }
}
