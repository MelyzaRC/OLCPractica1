
package analizadoresRep;

public class GeneradorDeAnalizadores {
    
    public static void main(String[] args) {
        generarCompilador();
    }

    private static void generarCompilador() {
        try {
            String ruta = "src/analizadoresRep/";
            String opcFlex[] = { ruta + "lexico.jflex", "-d", ruta };
            JFlex.Main.generate(opcFlex);
            String opcCUP[] = { "-destdir", ruta, "-parser", "parserRep", ruta + "sintactico.cup" };
            java_cup.Main.main(opcCUP);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
