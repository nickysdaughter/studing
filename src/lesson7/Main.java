package lesson7;

public class Main {
    public static void main(String[] args) {
        Product teapot1 = new Product();
        Product teapot2 = new Product();

        teapot1.setId(123);
        teapot2.setId(354);

        teapot1.setName("Redmond");
        teapot2.setName("Tefal");

        int idTeapot = teapot1.getId();
        System.out.println(idTeapot);

        Pen pen = new Pen();
        pen.setName("Шариковая ручка");


    }
}
