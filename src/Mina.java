import java.util.ArrayList;


public class Mina {
    public static enum materiales {Oro, Piedra};
    private materiales material;
    private int cantera;
    private ArrayList<Aldeano> espanioles = new ArrayList<>();
    private ArrayList<Aldeano> bizantino = new ArrayList<>();

    public materiales getMaterial() {
        return material;
    }

    public ArrayList<Aldeano> getEspanioles() {
        return espanioles;
    }

    public void setEspanioles(ArrayList<Aldeano> espanioles) {
        this.espanioles = espanioles;
    }

    public ArrayList<Aldeano> getBizantino() {
        return bizantino;
    }

    public void setBizantino(ArrayList<Aldeano> bizantino) {
        this.bizantino = bizantino;
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
    public Mina(int cantidad) {
        setMaterial(materiales.Oro);
        setCantera(cantidad);
    }
    public Mina(materiales material, int cantidad) {
        setMaterial(material);
        setCantera(cantidad);
    }


    public int extraerRecursosEsp(){
        return espanioles.size();
    }
    public int extraerRecursosBiz(){
        return bizantino.size();
    }
}
