package homework.lesson7;

public class Triangle {
    private double side1;
    private double side2;
    private double side3;

    Triangle() {

    }

    public void setSidesOfTriangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }


    public void printPerimeterOfTriangle() {
        if ((side1 + side2 < side3) || (side3 + side2 < side1) || (side1 + side3 < side2)) {
            System.out.println("Такого треугольника не существует");
            return;
        }
        System.out.println("Периметр треугольника: " + (side1 + side2 + side3));
    }

    public void printAreaOfTriangle() {
        if ((side1 + side2 < side3) || (side3 + side2 < side1) || (side1 + side3 < side2)) {
            System.out.println("Такого треугольника не существует");
            return;
        } else {
            double triangleHalfPerimeter = (side1 + side2 + side3) / 2;
            double triangleArea = Math.sqrt(triangleHalfPerimeter * (triangleHalfPerimeter - side1) * (triangleHalfPerimeter - side2) * (triangleHalfPerimeter - side3));
            System.out.println("Площадь треугольника: " + triangleArea);
        }
    }
}
