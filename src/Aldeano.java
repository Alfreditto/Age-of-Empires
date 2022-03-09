public class Aldeano {
    private enum civilizaciones {Espaniol, Bizantino};
    private civilizaciones civilizacion;
    private int salud;

    public civilizaciones getCivilizacion() {
        return civilizacion;
    }

    public void setCivilizacion(civilizaciones civilizacion) {
        this.civilizacion = civilizacion;
    }

    public int getSalud() {
        return salud;
    }

    public void setSalud(int salud) {
        this.salud = salud;
    }

    public Aldeano(boolean aux) {
        if (aux) {
            setCivilizacion(civilizaciones.Espaniol);
            setSalud(200);
        } else {
            setCivilizacion(civilizaciones.Bizantino);
            setSalud(250);
        }
    }
}
