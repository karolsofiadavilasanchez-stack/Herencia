public class Concierto extends Evento{
    private String ArtistaPrincipal;
    @Override
    public void mostrarEvento() {
        System.out.println("Nombre: " + getNombre());
        System.out.println("Lugar: " + getLugar());
        System.out.println("Fecha: " + getFecha());
        System.out.println("Hora: " + getHora());
        System.out.println("Descripción: " + getDescripcion());
        System.out.println("Artista Principal: " + ArtistaPrincipal);
    }
    public String getArtistaPrincipal() {
        return ArtistaPrincipal;
    }
    public void setArtistaPrincipal(String ArtistaPrincipal) {
        this.ArtistaPrincipal = ArtistaPrincipal;
    }
    
}
