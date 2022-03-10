public class Globales {
    public static enum civilizaciones {Espanioles, Bizantino};
    public static enum probabilidad {
        Espaniol(0.4), Bizantino(0.2);

        private final double value;

        probabilidad(final double newValue) {
            value = newValue;
        }

        public double getValue() { return value; }
    };
}
