package homework.lesson5;

import java.util.concurrent.ThreadLocalRandom;

public class NestedLoop {
    public static void main(String[] args) {
        char[][] numbers = new char[10][10];

        for (int i = 0; i < 20; i++) {
            int randomRowX = ThreadLocalRandom.current().nextInt(0, numbers.length);
            int randomColumnX = ThreadLocalRandom.current().nextInt(0, numbers[0].length);
            numbers[randomRowX][randomColumnX] = 'x';
        }
        for (int i = 0; i < 20; i++) {
            int randomRowY = ThreadLocalRandom.current().nextInt(0, numbers.length);
            int randomColumnY = ThreadLocalRandom.current().nextInt(0, numbers[0].length);
            numbers[randomRowY][randomColumnY] = 'y';
        }

    }
}
