package almacenamiento;

import java.util.ArrayList;

public class Archivo {
    public String nombre;
    public ArrayList<Clave> claves;
    public ArrayList<Object[]> registros;

    public Archivo() {
        nombre = "";
        claves = null;
        registros = null;
    }

    public Archivo(String nombre_, ArrayList<Clave> claves_, ArrayList<Object[]> registros_) {
        this.nombre = nombre_;
        this.claves = claves_;
        this.registros = registros_;
    }
    
}
