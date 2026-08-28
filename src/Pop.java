public class Pop extends Cancion {
    private String estilo;
    @Override
    public void reproducir() {
        System.out.println("Reproduciendo canción: " + getTitulo());
    }
    public String getEstilo() {
        return estilo;
    }
    public void setEstilo(String estilo) {
        this.estilo = estilo;
    }
    
}
