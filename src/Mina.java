public class Mina {
    public static enum materiales {Oro, Piedra};
    private materiales material;
    private int cantera;

    public materiales getMaterial() {
        return material;
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

    public void extraidos(int cantidad){
        this.cantera -= cantidad;
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
}
