package lesson15;

public class StringUtilsImpl implements StringUtils {
    @Override
    public double div(String number1, String number2) throws NullPointerException, NumberFormatException, ArithmeticException {
        int intNumber1 = 0;
        int intNumber2 = 0;
        try {
            intNumber1 = Integer.parseInt(number1.trim());
            intNumber2 = Integer.parseInt(number2.trim());
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }

        if (number1 == null || number2 == null) {
            throw new NullPointerException("number1 или number2 равны null");
        } else if (intNumber2 == 0) {
            throw new ArithmeticException("number2 равно нулю");
        }

        double div = (double) intNumber1 / intNumber2;
        return div;
    }

    @Override
    public int[] findWord(String text, String word) throws NullPointerException {
        return new int[0];
    }

    @Override
    public double[] findNumbers(String text) throws CustomException {
        return new double[0];
    }
}
