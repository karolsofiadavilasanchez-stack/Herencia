public class Banda extends Artista{
    private int integrantes = 0;

  @Override
  public void mostrarInformacion() {
    System.out.println("Artista: " + getNombre());
    System.out.println("Género: " + getGenero());
    System.out.println("Integrantes: " + integrantes);
  }  
  public int getIntegrantes() {
    return integrantes;
  }
  public void setIntegrantes(int integrantes) {
    this.integrantes = integrantes;
  }

}
