public class Rock  extends Cancion{
    private String tiporock;

@Override
    public void reproducir() {
        System.out.println("Reproduciendo Rock: " + getTitulo());
    }
    public String getTiporock() {
        return tiporock;
    }
    public void setTiporock(String tiporock) {
        this.tiporock = tiporock;
    }
}