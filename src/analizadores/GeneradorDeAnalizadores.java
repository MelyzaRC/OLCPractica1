
package analizadores;

import java.io.BufferedReader;
import java.io.StringReader;

public class GeneradorDeAnalizadores {
    public static void main(String[] args) {
        generarCompilador();
    }

    private static void generarCompilador() {
        try {
            String ruta = "src/analizadores/";
            String opcFlex[] = { ruta + "lexico.jflex", "-d", ruta };
            JFlex.Main.generate(opcFlex);
            String opcCUP[] = { "-destdir", ruta, "-parser", "parser", ruta + "sintactico.cup" };
            java_cup.Main.main(opcCUP);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
