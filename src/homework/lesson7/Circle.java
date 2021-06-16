package homework.lesson7;

public class Circle {
    private double radius;

    Circle() {

    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getPerimeterOfCircle() {
        return Math.PI * 2 * radius;
    }

    public double getAreaOfCircle() {
        return Math.PI * (radius * radius);
    }
}
