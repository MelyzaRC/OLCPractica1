
package almacenamiento;

public class Errores {
    public int linea;
    public int columna;
    public int tipo;
    public String descripcion;
    public String siguiente;
    public String actual;
    public String archivo;
    
    public Errores(int linea, int columna, int tipo, String descripcion, String siguiente, String actual, String archivo) {
        this.linea = linea;
        this.columna = columna;
        this.tipo = tipo;
        this.descripcion = descripcion;
        this.siguiente = siguiente;
        this.actual = actual;
        this.archivo = archivo;
    }

    public Errores() {
        this.linea = 0;
        this.columna = 0;
        this.tipo = 0;
        this.descripcion = "";
        this.siguiente = "";
        this.actual = "";
        this.archivo = "";
    }
   
}
