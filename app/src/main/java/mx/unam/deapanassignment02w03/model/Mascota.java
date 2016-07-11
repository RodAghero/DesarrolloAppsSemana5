package mx.unam.deapanassignment02w03.model;

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
    // se añade ID para base de datos
    //private int id;
    private int likes;
    // Se añade para retrofit (reusamos el in likes)
    private String id;
    private String nombreCompleto;
    private String urlFoto;


    // Constructor
    public Mascota(String nombre, int foto, String huesos, int huesoBlanco, int huesoAmarillo){
        this.nombre = nombre;
        this.foto   = foto;
        this.huesos = huesos;
        this.huesoBlanco = huesoBlanco;
        this.huesoAmarillo = huesoAmarillo;
    }

    // Constructor para perfil
    public Mascota(int foto, String huesos, int huesoAmarillo){
        this.foto = foto;
        this.huesos = huesos;
        this.huesoAmarillo = huesoAmarillo;
    }

    // Constructor vacío para base de datos
    public Mascota(){

    }

    public Mascota(String nombre, int foto, String huesos, int huesoBlanco, int huesoAmarillo, int likes){
        this.nombre = nombre;
        this.foto   = foto;
        this.huesos = huesos;
        this.huesoBlanco = huesoBlanco;
        this.huesoAmarillo = huesoAmarillo;
        this.likes = likes;
    }

    // Constructor para retrofit
    public Mascota(String urlFoto, String nombreCompleto, int likes){
        this.urlFoto = urlFoto;
        this.nombreCompleto = nombreCompleto;
        this.likes = likes;
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
/*
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
*/
    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getUrlFoto() {
        return urlFoto;
    }

    public void setUrlFoto(String urlFoto) {
        this.urlFoto = urlFoto;
    }
}
