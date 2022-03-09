public class Juego {
    private int almacenEspaniol;
    private int AlmacenBizantino;

    public int getAlmacenEspaniol() {
        return almacenEspaniol;
    }

    public void setAlmacenEspaniol(int almacenEspaniol) {
        this.almacenEspaniol = almacenEspaniol;
    }

    public int getAlmacenBizantino() {
        return AlmacenBizantino;
    }

    public void setAlmacenBizantino(int almacenBizantino) {
        AlmacenBizantino = almacenBizantino;
    }

    public Juego() {
        System.out.println("Bienvenido a una nueva partida de Age of Empires DAM Edition");
        Mina m1 = new Mina();
        do {
            extraccionEspanioles(m1);
            extraccionBizantinos(m1);
        } while (m1.getCantera() > 0);
    }

    private void extraccionBizantinos(Mina m1) {
        setAlmacenBizantino(getAlmacenEspaniol()+ m1.extraerRecursosBiz());
    }

    private void extraccionEspanioles(Mina m1) {
        setAlmacenEspaniol(getAlmacenEspaniol()+m1.extraerRecursosEsp());
    }
}
