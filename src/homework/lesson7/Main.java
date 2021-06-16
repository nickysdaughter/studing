package homework.lesson7;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.setSidesOfRectangle(10, 5);
        int perimeterRectangle = rectangle.getPerimeterOfRectangle();
        int areaRectangle = rectangle.getAreaOfRectangle();

        rectangle.printСheck();
        System.out.println("Периметр прямоугольника: " + perimeterRectangle);
        System.out.println("Площадь прямоугольника: " + areaRectangle);

        Square square = new Square();
        square.setSidesOfRectangle(10, 10);
        int perimeterSquare = square.getPerimeterOfRectangle();
        int areaSquare = square.getAreaOfRectangle();

        square.printСheck();
        System.out.println("Периметр квадрата: " + perimeterSquare);
        System.out.println("Площадь квадрата: " + areaSquare);

        Triangle triangle = new Triangle();
        triangle.setSidesOfTriangle(10, 10, 19);

        triangle.printPerimeterOfTriangle();
        triangle.printAreaOfTriangle();

        Circle circle = new Circle();
        circle.setRadius(24);

        double circlePerimeter = circle.getPerimeterOfCircle();
        double circleArea = circle.getAreaOfCircle();

        System.out.println("Длина окружности круга: " + circlePerimeter);
        System.out.println("Площадь круга: " + circleArea);
    }
}
