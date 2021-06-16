package homework.lesson7;


public class Rectangle {
    private int width;
    private int height;

    public Rectangle() {

    }

    public void setSidesOfRectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int getPerimeterOfRectangle() {
        return (width + height) * 2;
    }

    public int getAreaOfRectangle() {

        return width * height;
    }

    public void printСheck() {
        if (width == height) {
            System.out.println("Это квадрат");
            return;
        }
        System.out.println("Это прямоугольник");
    }
}
