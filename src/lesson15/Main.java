package lesson15;

public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        try {
            person.setAge(150);
        } catch (UncurrentAgeException e) {
            e.printStackTrace();
        }
        System.out.println("Программа работает");
    }
}
