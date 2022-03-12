public class Juego {
    private int almacenEspaniol;
    private int AlmacenBizantino;
    private int segundos;

    public int getSegundos() {
        return segundos;
    }

    public void setSegundos(int segundos) {
        this.segundos = segundos;
    }

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

    public Juego() throws InterruptedException {
        System.out.println("Bienvenido a una nueva partida de Age of Empires DAM Edition");
        setSegundos(0);
        Mina m1 = new Mina();
        do {
            System.out.println("Los Españoles tienen un almacén con " + getAlmacenEspaniol() + " items y tienen a " + m1.getEspanioles().size() + " aldeanos trabajando");
            extraccionEspanioles(m1);
            System.out.println("Los Bizantinos tienen un almacén con " + getAlmacenBizantino() + " items y tienen a " + m1.getBizantinos().size() + " aldeanos trabajando");
            extraccionBizantinos(m1);
            System.out.println();

            if (segundos % 2 == 0) {
                if ((Math.random() * 10) < 4) {
                    System.out.println("Un español ha llegado a la mina");
                    m1.sumarEsp();
                }
                if ((Math.random() * 10) < 2) {
                    System.out.println("Un bizantino ha llegado a la mina");

                    m1.sumarBiz();
                }
            }
            if (segundos % 5 == 0) {
                if (m1.getEspanioles().size() != 0) {
                    System.out.println("Un cura Bizantino ha transformado a un Aldeano Español");
                    m1.convertirEsBiz();
                }
            }
            setSegundos(getSegundos() + 1);
            Thread.sleep(1000);
        } while (segundos < 60);
        System.out.println();
    }

    private void extraccionBizantinos(Mina m1) {
        setAlmacenBizantino(getAlmacenBizantino() + m1.extraerRecursosBiz());
        if (m1.getBizantinos().size() != 0) {
            System.out.println("Los bizantinos han extraido " + m1.getBizantinos().size());
        } else {
            System.out.println("No hay bizantinos trabajando!");
        }
        System.out.println();
    }

    private void extraccionEspanioles(Mina m1) {
        setAlmacenEspaniol(getAlmacenEspaniol() + m1.extraerRecursosEsp());
        if (m1.getEspanioles().size() != 0) {
            System.out.println("Los Españoles han extraido " + m1.getEspanioles().size());
        } else {
            System.out.println("No hay Españoles trabajando!");
        }
            System.out.println();
    }
}
