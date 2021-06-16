package homework.lesson10;

public class Main {
    public static void main(String[] args) {
        FractionNumberImpl fraction1 = new FractionNumberImpl(1, 5);
        FractionNumberImpl fraction2 = new FractionNumberImpl(3, 5);

        FractionNumberOperationImpl calc = new FractionNumberOperationImpl();
        FractionNumber resultAdd = calc.add(fraction1, fraction2);
        System.out.println(resultAdd);


    }
}
