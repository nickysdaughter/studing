package lesson16;

public class Presenter {
    public static void main(String[] args) {
        System.out.println("Начало концерта!" + Thread.currentThread().getName());
        Singer1 singer1 = new Singer1();
        Singer2 singer2 = new Singer2();
        singer2.setDaemon(true);
        singer1.start();
        singer2.start();

        while (singer1.isAlive()) {

        }
        System.out.println("Концерт окончен!" + Thread.currentThread().getName());
    }
}
