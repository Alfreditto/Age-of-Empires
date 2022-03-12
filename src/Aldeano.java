public class Aldeano {
    
    private Globales.civilizaciones civilizacion;
    private int salud;

    public Globales.civilizaciones getCivilizacion() {
        return civilizacion;
    }

    private void setCivilizacion(Globales.civilizaciones civilizacion) {
        this.civilizacion = civilizacion;
        salud = civilizacion == Globales.civilizaciones.Espanioles ? 200 : 250;
        setSalud(salud);
    }

    public int getSalud() {
        return salud;
    }

    public void setSalud(int salud) {
        this.salud = salud;
    }

    public Aldeano(Globales.civilizaciones civilizacion) {
        setCivilizacion(civilizacion);
    }
}
