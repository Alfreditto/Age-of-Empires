public class Aldeano {
    
    private Civilizacion.civilizaciones civilizacion;
    private int salud;

    public Civilizacion.civilizaciones getCivilizacion() {
        return civilizacion;
    }

    private void setCivilizacion(Civilizacion.civilizaciones civilizacion) {
        this.civilizacion = civilizacion;
        salud = civilizacion == Civilizacion.civilizaciones.Espaniol ? 200 : 250;
        setSalud(salud);
    }

    public int getSalud() {
        return salud;
    }

    public void setSalud(int salud) {
        this.salud = salud;
    }

    public Aldeano(Civilizacion.civilizaciones civilizacion) {
        setCivilizacion(civilizacion);
    }
}
