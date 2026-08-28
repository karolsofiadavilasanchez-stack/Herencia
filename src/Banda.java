public class Banda extends Artista{
    private String integrantes;

  @Override
  public void mostrarInformacion() {
    System.out.println("Artista: " + getNombre());
    System.out.println("Género: " + getGenero());
    System.out.println("Integrantes: " + integrantes);
  }  
  public String getIntegrantes() {
    return integrantes;
  }
  public void setIntegrantes(String integrantes) {
    this.integrantes = integrantes;
  }
}
