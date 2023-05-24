import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ControladoraTest {

    @Test
    void cambiarfile() {
        Controladora controladora = new Controladora();
        String linea = "";
        boolean flag = false;

        linea = "NY LA 5 10 15 20";
        flag = false;
        controladora.Cambiarfile(2, linea, "");
        for(int i = 0; i < controladora.lister.size(); i++){
            if(controladora.lister.get(i).contains(linea)){
                flag = true;
            }
        }
        assertEquals(true, flag);
        linea = "NY LA";
        flag = false;
        controladora.Cambiarfile(3, linea, "2");
        for(int i = 0; i < controladora.lister.size(); i++){
            if(controladora.lister.get(i).contains(linea)){
                String [] datos = controladora.lister.get(i).split(" ");
                if(datos[2].equals(datos[3])){
                    flag = true;
                }
            }
        }
        assertEquals(true, flag);
        linea = "NY LA";
        controladora.Cambiarfile(1, linea, "");
        flag = false;
        for(int i = 0; i < controladora.lister.size(); i++){
            if(controladora.lister.get(i).contains(linea)){
                flag = true;
            }
        }
        assertEquals(false, flag);
    }

    @Test
    void getCentroDelGrafo() {
        Controladora controladora = new Controladora();
        String centroDelGrafo = controladora.getCentroDelGrafo();
        assertEquals("Denver", centroDelGrafo);
    }


}