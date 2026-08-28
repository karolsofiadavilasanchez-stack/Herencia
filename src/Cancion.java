public class Cancion {

    private String titulo;
    private String autor;
    private int duracion;
    
    public Cancion(String titulo, String autor, int duracion) {
        this.titulo = titulo;
        this.autor = autor;
        this.duracion = duracion;
    }
    public void reproducir() {
        System.out.println("Reproduciendo canción: " + titulo);
    }
    public String getTitulo() {
        return titulo;
    }
    public String getAutor() {
        return autor;
    }
    public int getDuracion() {
        return duracion;
    }
    
}
