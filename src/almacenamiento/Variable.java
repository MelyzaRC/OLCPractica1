
package almacenamiento;

public class Variable {
    public int tipo;
    public String nombre;
    public Object valor;

    public Variable(int tipo_, String nombre_, Object valor_) {
        this.tipo = tipo_;
        this.nombre = nombre_;
        this.valor = valor_;
    }
    
    public Variable() {
        this.tipo = 0;
        this.nombre = "";
        this.valor = null;
    }
    
}
