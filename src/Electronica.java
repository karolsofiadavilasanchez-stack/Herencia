public class Electronica extends Cancion {
    private String bmp;
    @Override
    public void reproducir() {
        System.out.println("Reproduciendo canción: " + getTitulo());
    }public String getBmp() {
        return bmp;
    }
    public void setBmp(String bmp) {
        this.bmp = bmp;
    }
    
}
