package homework.lesson6;

public class Main {
    public static void main(String[] args) {
        double triangleSqr = SomeMathOperationsUtils.calculateTriangleArea(14, 10, 7);
        System.out.println(triangleSqr);

        int[] numbers = {49, 2, 0, 10};
        SomeMathOperationsUtils.printEvenNumbersFromArray(numbers);

        System.out.println();

        SomeMathOperationsUtils.printSumOfTwoFractions(1, 1, 10, 2);
    }
}
