import java.util.ArrayList;


public class Civilizacion {
    String[] reyes = new String[]{"Kirby", "Adolfo el cojo", "Jaime el loco", "Alfredo la tortuga", "Xinxi el mago", "Jose Triste", "Jose Feliz", "Juan Guadiana"};

    private String rey;

    private ArrayList<Aldeano> aldeanos = new ArrayList<>();
    private Globales.civilizaciones civilizacion;
    private int almacen = 0;
    private double probabilidad;

    public Civilizacion(Globales.civilizaciones civilizacion, Globales.probabilidad probabilidad) {
        this.civilizacion = civilizacion;
        this.probabilidad = probabilidad.getValue();
        setRey();
        aldeanoInicial();
    }

    private void setRey(){
        rey = reyes[(int)(Math.random()*(reyes.length - 1)+0)];
    }

    public String GetRey(){
        return rey;
    }

    public Globales.civilizaciones getCivilizacion(){
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

    private void anadirAldeano(){
        aldeanos.add(new Aldeano(civilizacion));
    }

    private void aldeanoInicial(){
        aldeanos.add(new Aldeano(civilizacion));
    }

    public void robarAldeano(Civilizacion robada){
        ArrayList<Aldeano> aldeanos = robada.aldeanos;
        if(aldeanos.size() <= 0) return;
        int aldeanoARobar = (int)(Math.random()*(aldeanos.size())+0);
        this.aldeanos.add(aldeanos.get(aldeanoARobar));
        robada.perderAldeano(aldeanoARobar);
        System.out.println("Los " + getCivilizacion() + " han robado a un aldeano a " + robada.getCivilizacion() + "\n");
    }

    private void perderAldeano(int aldeanoPerdido){
        this.aldeanos.remove(aldeanoPerdido);
    }

    public void crecerONo(){
        boolean siONo = Math.random() < probabilidad;
        if(siONo) {
            System.out.println("Ha llegado un " + getCivilizacion() + "\n");
            anadirAldeano();
        }
    }
}
