import java.util.ArrayList;
 
public class App {
 
    public static void main(String[] args) {
 
        Rock rock = new Rock();
        rock.setTitulo("Sweet Child O' Mine");
        rock.setArtista("Guns N' Roses");
        rock.setDuracion(5.56);
        rock.setTipoRock("Hard Rock");
 
        Pop pop = new Pop();
        pop.setTitulo("Blinding Lights");
        pop.setArtista("The Weeknd");
        pop.setDuracion(3.20);
        pop.setEstilo("Pop moderno");
 
        Electronica electronica = new Electronica();
        electronica.setTitulo("Strobe");
        electronica.setArtista("Deadmau5");
        electronica.setDuracion(10.37);
        electronica.setBpm(128);
 
 
        Solista solista = new Solista();
        solista.setNombre("The Weeknd");
        solista.setGenero("Pop");
        solista.setInstrumento("Voz");
 
        Banda banda = new Banda();
        banda.setNombre("Guns N' Roses");
        banda.setGenero("Rock");
        banda.setIntegrantes(5);
 
 
 
        Concierto concierto = new Concierto();
        concierto.setNombre("Concierto Rock");
        concierto.setLugar("Bogotá");
        concierto.setFecha("30/08/2026");
        concierto.setArtistaPrincipal("Guns N' Roses");
 
        Festival festival = new Festival();
        festival.setNombre("Festival de Música");
        festival.setLugar("Bogotá");
        festival.setFecha("20/03/2027");
        festival.setCantidadArtistas(50);
 
 
   
 
        ArrayList<Cancion> canciones = new ArrayList<>();
 
        canciones.add(rock);
        canciones.add(pop);
        canciones.add(electronica);
 
        System.out.println("===== CANCIONES =====");
 
        for (Cancion cancion : canciones) {
            cancion.mostrarInformacion();
            cancion.reproducir();
            System.out.println();
        }
 
 
 
        ArrayList<Artista> artistas = new ArrayList<>();
 
        artistas.add(solista);
        artistas.add(banda);
 
        System.out.println("===== ARTISTAS =====");
 
        for (Artista artista : artistas) {
            artista.mostrarInformacion();
            System.out.println();
        }
 
        ArrayList<Evento> eventos = new ArrayList<>();
 
        eventos.add(concierto);
        eventos.add(festival);
 
        System.out.println("===== EVENTOS =====");
 
        for (Evento evento : eventos) {
            evento.mostrarEvento();
            System.out.println();
        }
    }
}
 