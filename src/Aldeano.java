public class Aldeano {
    private enum civilizaciones {Espaniol, Bizantino}

    private enum gobernantes {Isabel_I, Constantino_II}

    private civilizaciones civilizacion;
    private int salud;
    private gobernantes gobernante;

    public gobernantes getGobernante() {
        return gobernante;
    }

    public void setGobernante(gobernantes gobernante) {
        this.gobernante = gobernante;
    }

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

    public Aldeano(boolean espaniol) {
        esespaniol(espaniol);
    }

    private void esespaniol(boolean espaniol) {
        if (espaniol) {
            setCivilizacion(civilizaciones.Espaniol);
            setGobernante(gobernantes.Isabel_I);
            setSalud(200);
        } else {
            setCivilizacion(civilizaciones.Bizantino);
            setGobernante(gobernantes.Constantino_II);
            setSalud(250);
        }
    }
    public void convertirEsBiz(){
        esespaniol(false);
    }
}
