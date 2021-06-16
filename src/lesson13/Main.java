package lesson13;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(4);
        numbers.add(7);
        numbers.add(9);
        numbers.add(0, 55);
        numbers.set(0, 555); //заменить
        System.out.println(numbers);
    }
}
