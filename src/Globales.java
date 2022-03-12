public class Globales {
    public static enum civilizaciones {Espanioles, Bizantino, Germanos, Locos, Adolfos, Tortugas};
    public static enum probabilidad {
        Espaniol(0.4), Bizantino(0.2), Germanos(0.6), Locos(0.3), Adolfos(0.2), Tortugas(1);

        private final double value;

        probabilidad(final double newValue) {
            value = newValue;
        }

        public double getValue() { return value; }
    };
}
