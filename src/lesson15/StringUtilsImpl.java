package lesson15;

import java.util.ArrayList;
import java.util.Arrays;

public class StringUtilsImpl implements StringUtils {
    @Override
    public double div(String number1, String number2) throws NullPointerException, NumberFormatException, ArithmeticException {
        int intNumber1 = 0;
        int intNumber2 = 0;
        if (number1 == null || number2 == null) {
            throw new NullPointerException("number1 или number2 равны null");
        }
        intNumber1 = Integer.parseInt(number1.trim());
        intNumber2 = Integer.parseInt(number2.trim());

        if (intNumber2 == 0) {
            throw new ArithmeticException("number2 равно нулю");
        }

        double div = (double) intNumber1 / intNumber2;
        return div;
    }

    @Override
    public int[] findWord(String text, String word) throws NullPointerException {
        if (text == null || word == null) {
            throw new NullPointerException("искомое слово отсутствует в тексте или текст пустой");
        }
        ArrayList<Integer> arrayList = new ArrayList<>();
        String[] newText = text.split(" ");
        for (int i = 0; i < newText.length; i++) {
            String result = newText[i];
            if (result.equals(word)) {
                arrayList.add(result.indexOf(i));
                Integer[] newArray = arrayList.toArray(new Integer[arrayList.size()]);
                System.out.println(Arrays.toString(newArray));
            }
        }
        return new int[0];
    }

    @Override
    public double[] findNumbers(String text) throws CustomException {
        /*if () {
            throw new CustomException("???");  //ЧТО-ТО НЕ ТАК! ДОДЕЛАТЬ!>:|
        }*/
        double[] numbers = new double[0];
        String[] numbersStrings = text.split(".");
        for (int i = 0; i < numbersStrings.length; i++) {
            numbers[i] = Double.parseDouble(numbersStrings[i]);
        }
        System.out.println(Arrays.toString(numbers));

        return new double[0];
    }
}
