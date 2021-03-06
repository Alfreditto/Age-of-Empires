import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Juego {

    Map<Globales.civilizaciones, Civilizacion> civilizaciones = new HashMap<>();

    public Juego() throws InterruptedException {
        System.out.println("Bienvenido a una nueva partida de Age of Empires DAM Edition");
        crearCivilizaciones();
        Mina m1 = new Mina();
        simulacion(m1);
    }


    private void crearCivilizaciones() {
        int counter = 0;
        for (Globales.civilizaciones civilizaciones : Globales.civilizaciones.values()) {
            Civilizacion civ = new Civilizacion(civilizaciones, Globales.probabilidad.values()[counter]);
            counter++;
            this.civilizaciones.put(civ.getCivilizacion(), civ);
        }
    }

    private void simulacion(Mina mina) throws InterruptedException {
        int segundos = 0;
        while (segundos < 60 && mina.getCantera() > 0) {
            int counter = segundos;
            civilizaciones.forEach(
                    (i, j) -> {
                        if (counter % 2 == 0) {
                            j.crecerONo();

                        }
                        if (counter % 5 == 0 && i == Globales.civilizaciones.Bizantino) {
                            boolean buscando = true;
                            while (buscando) {
                                Collection<Civilizacion> values = civilizaciones.values();
                                Civilizacion civ = (Civilizacion) values.toArray()[(int) (Math.random() * (values.size() - 1) + 0)];
                                if (j != civ) {
                                    j.robarAldeano(civ);
                                    buscando = false;
                                }
                            }
                        }
                        j.aumentarAlmacen(j.getAldeanos().size());
                        mina.extraidos(j.getAldeanos().size(), j);
                        try {
                            Thread.sleep((1000/civilizaciones.values().size()));
                        } catch (InterruptedException e) {
                        }
                    }
            );
            segundos++;
        }
        civilizaciones.forEach(
                (i, j) -> {
                    String civ = String.format("Los %s, gobernados por %s han acabado con %s recursos y %s aldeanos", j.getCivilizacion().toString(), j.GetRey(), j.getAlmacen(), j.getAldeanos().size());
                    System.out.println(civ);
                }
        );
    }
}
