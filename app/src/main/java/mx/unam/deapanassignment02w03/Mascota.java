package mx.unam.deapanassignment02w03;

/**
 * Created by Roy on 12/06/2016.
 */
public class Mascota {
    // Atributos de la mascota
    private String nombre;
    private int foto;
    private String huesos;
    private int huesoBlanco;
    private int huesoAmarillo;

    // Constructor
    public Mascota(String nombre, int foto, String huesos, int huesoBlanco, int huesoAmarillo){
        this.nombre = nombre;
        this.foto   = foto;
        this.huesos = huesos;
        this.huesoBlanco = huesoBlanco;
        this.huesoAmarillo = huesoAmarillo;
    }

    // Getters Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }

    public String getHuesos() {
        return huesos;
    }

    public void setHuesos(String huesos) {
        this.huesos = huesos;
    }

    public int getHuesoBlanco() {
        return huesoBlanco;
    }

    public void setHuesoBlanco(int huesoBlanco) {
        this.huesoBlanco = huesoBlanco;
    }

    public int getHuesoAmarillo() {
        return huesoAmarillo;
    }

    public void setHuesoAmarillo(int huesoAmarillo) {
        this.huesoAmarillo = huesoAmarillo;
    }
}
