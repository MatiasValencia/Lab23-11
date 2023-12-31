package Model;

public class Pokemon {
    private String nombre;
    private String tipo;
    private int nivel;
    // Constructor
    public Pokemon() {}
    public Pokemon(String nombre, String tipo) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.nivel = 0;
    }
    // Getters
    public String getNombre() {return nombre;}
    public String getTipo() {return tipo;}
    public int getNivel() {return nivel;}
    // Setters
    public void setNombre(String nombre) {this.nombre = nombre;}
    public void setTipo(String tipo) {this.tipo = tipo;}
    public void setNivel(int nivel) {this.nivel = nivel;}
    // Metodo toString
    @Override
    public String toString() {
        return nombre + "," + tipo + "," + nivel;
    }
}
