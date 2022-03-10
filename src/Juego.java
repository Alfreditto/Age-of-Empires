import java.util.*;
public class Juego {
    Map<Civilizacion, Civilizacion> civilizaciones = new HashMap<Civilizacion, Civilizacion>();

    public Juego() {
        System.out.println("Bienvenido a una nueva partida de Age of Empires DAM Edition");
        crearCivilizaciones();
        

        Mina m1 = new Mina();

        do {

        } while (m1.getCantera() > 0);
    }


    private void crearCivilizaciones(){
        Civilizacion espaniola = new Civilizacion(Civilizacion.civilizaciones.Espaniol);
        Civilizacion bizantino = new Civilizacion(Civilizacion.civilizaciones.Bizantino);
        civilizaciones.put(espaniola, espaniola);
        civilizaciones.put(bizantino, bizantino);
    }
}
