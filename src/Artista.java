public class Artista {
    private 
    String nombre;
    private String genero;
    public void mostrarInformacion(){
        System.out.println("Artista: " + getNombre());
        System.out.println("Género: " + getGenero());
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getGenero() {
        return genero;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }


}
    

