import java.util.ArrayList;


public class Civilizacion {
    public static enum civilizaciones {Espaniol, Bizantino};
    String[] reyes = new String[]{"Fernando el calvo", "Adolfo el cojo", "Jaime el loco", "Alfredo la tortuga"};


    private String rey;

    private ArrayList<Aldeano> aldeanos = new ArrayList<>();
    private civilizaciones civilizacion;
    private int almacen = 0;

    public Civilizacion(civilizaciones civilizacion) {
        this.civilizacion = civilizacion;
        setRey();
        aldeanoInicial();
    }

    private void setRey(){
        rey = reyes[(int)(Math.random()*(reyes.length-1-0)+0)];
    }

    public String GetRey(){
        return rey;
    }

    public civilizaciones getCivilizacion(){
        return civilizacion;
    }

    public ArrayList<Aldeano> getAldeanos(){
        return aldeanos;
    }

    public int getAlmacen(){
        return almacen;
    }

    public void aumentarAlmacen(int cantidad){
        almacen+=cantidad;
    }

    private void aldeanoInicial(){
        aldeanos.add(new Aldeano(civilizacion));
    }

    public void robarAldeano(ArrayList<Aldeano> robada, ArrayList<Aldeano> ladron){

    }
}
