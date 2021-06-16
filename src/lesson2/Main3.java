package lesson2;

public class Main3 {
    public static void main(String[] args) {
        int a = 3;
        int b = 3;
        int c = 2;

        if(a == b && a == c && b == c){
            System.out.println("Равносторонний треугольник");
        } else if (a != b && a != c && b != c){
            System.out.println("Разносторонний треугольник");
        } else {
            System.out.println("Равнобедренный треугольник");
        }
    }
}
