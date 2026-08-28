public class Rock  extends Cancion{
    private String tiporock;

    public Rock(String titulo, String autor, int duracion, String tiporock) {
        super(titulo, autor, duracion);
    }

    public void reproducir() {
        System.out.println("Reproduciendo canción: " + getTitulo());
    }
    public String getTiporock() {
        return tiporock;
    }
    public void setTiporock(String tiporock) {
        this.tiporock = tiporock;
    }
}