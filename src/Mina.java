import java.util.ArrayList;

public class Mina {
    private enum materiales {Oro, Piedra}

    private materiales material;
    private int cantera;
    private ArrayList<Aldeano> espanioles = new ArrayList<>();
    private ArrayList<Aldeano> bizantinos = new ArrayList<>();

    public materiales getMaterial() {
        return material;
    }

    public ArrayList<Aldeano> getEspanioles() {
        return espanioles;
    }

    public void setEspanioles(ArrayList<Aldeano> espanioles) {
        this.espanioles = espanioles;
    }

    public ArrayList<Aldeano> getBizantinos() {
        return bizantinos;
    }

    public void setBizantinos(ArrayList<Aldeano> bizantinos) {
        this.bizantinos = bizantinos;
    }

    public void setMaterial(materiales material) {
        this.material = material;
    }

    public int getCantera() {
        return cantera;
    }

    public void setCantera(int cantera) {
        this.cantera = cantera;
    }

    public Mina() {
        setMaterial(materiales.Oro);
        setCantera(500);
    }

    public int extraerRecursosEsp() {
        return espanioles.size();
    }

    public int extraerRecursosBiz() {
        return bizantinos.size();
    }

    public void sumarEsp() {
        espanioles.add(new Aldeano(true));
    }
    public void sumarBiz() {
        bizantinos.add(new Aldeano(false));
    }
    public void convertirEsBiz(){
        int aux = (int) (Math.random() * espanioles.size());
        espanioles.get(aux).convertirEsBiz();
        bizantinos.add(espanioles.get(aux));
        espanioles.remove(aux);
    }
}
