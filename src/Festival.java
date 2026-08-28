public class Festival extends Evento{
    private String cantidadArtistas;
@Override
public void mostrarEvento() {
    System.out.println("Nombre: " + nombre);
    System.out.println("Lugar: " + lugar);
    System.out.println("Fecha: " + fecha);
    System.out.println("Hora: " + hora);
    System.out.println("Descripción: " + descripcion);
    System.out.println("Cantidad de artistas: " + cantidadArtistas);
}
public String getCantidadArtistas() {
    return cantidadArtistas;
}
public void setCantidadArtistas(String cantidadArtistas) {
    this.cantidadArtistas = cantidadArtistas;
    
}
}