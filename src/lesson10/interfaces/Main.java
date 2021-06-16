package lesson10.interfaces;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Circle circle1 = new Circle(5);
        Circle circle2 = new Circle(3);
        Rectangle rectangle1 = new Rectangle(2, 5);
        Rectangle rectangle2 = new Rectangle(4, 7);

        ArrayList<Figure> figures = new ArrayList<>();
        figures.add(circle1);
        figures.add(circle2);
        figures.add(rectangle1);
        figures.add(rectangle2);

        for (Figure f : figures) {
            System.out.println(f.toString()); //проявление полиморфизма
        }
    }
}
