package lesson2;

import java.util.Scanner;

public class Main5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите первую сторону треугольника: ");
        int inputA = scanner.nextInt();

        System.out.println("Введите вторую сторону треугольника: ");
        int inputB = scanner.nextInt();

        System.out.println("Введите третью сторону треугольника: ");
        int inputC = scanner.nextInt();

        if(inputA > inputB + inputC || inputB > inputA + inputC || inputC > inputA + inputB){
            System.out.println("Такого треугольника не существует");
            return;
        }

        int trianglePerimeter = inputA + inputB + inputC;
        System.out.println("Периметр треугольника = " + trianglePerimeter);

        double triangleHalfMeter = (trianglePerimeter) / 2;
        double triangleSqr = Math.sqrt(triangleHalfMeter * (triangleHalfMeter - inputA) * (triangleHalfMeter - inputB) * (triangleHalfMeter - inputC));
        System.out.println("Площадь треугольника = " + triangleSqr);
    }
}
