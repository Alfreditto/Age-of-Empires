import java.util.*;
public class Juego {

    Map<Civilizacion.civilizaciones, Civilizacion> civilizaciones = new HashMap<Civilizacion.civilizaciones, Civilizacion>();

    public Juego() {
        System.out.println("Bienvenido a una nueva partida de Age of Empires DAM Edition");
        crearCivilizaciones();
        Mina m1 = new Mina();
        simulacion(m1);
    }


    private void crearCivilizaciones(){
        Civilizacion espaniola = new Civilizacion(Civilizacion.civilizaciones.Espaniol);
        Civilizacion bizantino = new Civilizacion(Civilizacion.civilizaciones.Bizantino);
        civilizaciones.put(espaniola.getCivilizacion(), espaniola);
        civilizaciones.put(bizantino.getCivilizacion(), bizantino);
    }

    private void simulacion(Mina mina){
        int segundos = 0;

        while(segundos < 60){
            Civilizacion espaniol = civilizaciones.get(Civilizacion.civilizaciones.Espaniol);
            Civilizacion bizantino = civilizaciones.get(Civilizacion.civilizaciones.Bizantino);
            if (segundos % 2 == 0){
                boolean espaniolB = (Math.random() < 0.4);
                boolean bizantinoB = (Math.random() < 0.2);
                if (espaniolB) espaniol.anadirAldeano();
                if (bizantinoB) bizantino.anadirAldeano();
            }
            if (segundos % 5 == 0){
                bizantino.robarAldeano(espaniol);
            }
            espaniol.aumentarAlmacen(espaniol.getAldeanos().size());
            bizantino.aumentarAlmacen(bizantino.getAldeanos().size());

            mina.extraidos(espaniol.getAldeanos().size()+bizantino.getAldeanos().size());

            segundos++;
        }
        Civilizacion espaniol = civilizaciones.get(Civilizacion.civilizaciones.Espaniol);
        Civilizacion bizantino = civilizaciones.get(Civilizacion.civilizaciones.Bizantino);
        String espanioles = String.format("Los Españoles han acabado con %s recursos y %s aldeanos", espaniol.getAlmacen(), espaniol.getAldeanos().size());
        System.out.println(espanioles);
        String bizantinos = String.format("Los Bizantinos han acabado con %s recursos y %s aldeanos", bizantino.getAlmacen(), bizantino.getAldeanos().size());
        System.out.println(bizantinos);
    }
}
