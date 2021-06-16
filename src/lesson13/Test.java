package lesson13;

import java.util.ArrayList;
import java.util.LinkedList;

public class Test {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        LinkedList<String> linked = new LinkedList<>();

        long startTime1 = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            list.add("qwerty" + i);
        }
        long endTime1 = System.currentTimeMillis();
        System.out.println("Время выполнения add ArrayList: " + (endTime1 - startTime1));

        long startTime2 = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            linked.add("qwerty" + i);
        }
        long endTime2 = System.currentTimeMillis();
        System.out.println("Время выполнения add LinkedList: " + (endTime2 - startTime2));

        long startTime3 = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            list.get(i);
        }
        long endTime3 = System.currentTimeMillis();
        System.out.println("Время выполнения get ArrayList: " + (endTime3 - startTime3));

        long startTime4 = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            linked.get(i);
        }
        long endTime4 = System.currentTimeMillis();
        System.out.println("Время выполнения get LinkedList: " + (endTime4 - startTime4));
    }

}
