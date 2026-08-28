public class Solista extends Artista {
    private String instrumento;
    @Override
    public void mostrarInformacion() {
        System.out.println("Artista: " + getNombre());
        System.out.println("Género: " + getGenero());
        System.out.println("Instrumento: " + instrumento);
    }
    public String getInstrumento() {
         return instrumento; }  
    public void setInstrumento(String instrumento) {
        this.instrumento = instrumento;
    }
}
