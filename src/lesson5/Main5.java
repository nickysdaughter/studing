package lesson5;

import java.util.concurrent.ThreadLocalRandom;

public class Main5 {
    public static void main(String[] args) {
        int[][] minesweeper = new int[10][10];

        for(int i = 0; i < 10; i++){
            int randomRow = ThreadLocalRandom.current().nextInt(0, minesweeper.length);
            int randomColumn = ThreadLocalRandom.current().nextInt(0, minesweeper[0].length);
            minesweeper[randomRow][randomColumn] = -1;
        }

        for(int i = 0; i < minesweeper.length; i++){
            for(int j = 0; j < minesweeper[i].length; j++){
                System.out.print(minesweeper[i][j] + " ");
            }
            System.out.println();
        }
    }
}
