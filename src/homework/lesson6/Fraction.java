package homework.lesson6;

public class Fraction {
    private static final double ratio = 0.01;

    public static String get(double val) {
        for (int i = 1; ; i++) {
            double tem = val / (1D / i);
            if (Math.abs(tem - Math.round(tem)) < ratio)
                return Math.round(tem) + "/" + i;
        }
    }
}

