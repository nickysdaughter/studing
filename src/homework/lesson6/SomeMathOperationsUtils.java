package homework.lesson6;


public class SomeMathOperationsUtils {
    public static double calculateTriangleArea (double triangleSide1, double triangleSide2, double triangleSide3){

        double triangleHalfPerimeter = (triangleSide1 + triangleSide2 + triangleSide3) / 2;
        double triangleArea = Math.sqrt(triangleHalfPerimeter * (triangleHalfPerimeter - triangleSide1) * (triangleHalfPerimeter - triangleSide2) * (triangleHalfPerimeter - triangleSide3));
        return triangleArea;
    }

    public static void printEvenNumbersFromArray (int[] array){

        for (int i = 0; i < array.length; i++){
            if (array[i] % 2 == 0){
                System.out.print(array[i] + " ");
            }
        }
    }

    public static void printSumOfTwoFractions (int numeratorOfFraction1, int numeratorOfFraction2, int termOfFraction1, int termOfFraction2){

        double decimalFraction1 = (double) numeratorOfFraction1 / termOfFraction1;
        double decimalFraction2 = (double) numeratorOfFraction2 / termOfFraction2;

        double sumOfTwoFractions = decimalFraction1 + decimalFraction2;
        String a = Fraction.get(sumOfTwoFractions);
        System.out.println(a);
    }
}
