public class Festival extends Evento{
    private int cantidadArtistas;
@Override
public void mostrarEvento() {
    System.out.println("Nombre: " + getNombre());
    System.out.println("Lugar: " + getLugar());
    System.out.println("Fecha: " + getFecha());
    System.out.println("Hora: " + getHora());
    System.out.println("Descripción: " + getDescripcion());
    System.out.println("Cantidad de artistas: " + cantidadArtistas);
}
public int getCantidadArtistas() {
    return cantidadArtistas;
}
public void setCantidadArtistas(int cantidadArtistas) {
    this.cantidadArtistas = cantidadArtistas;
    
}
}