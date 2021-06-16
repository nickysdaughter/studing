package lesson5;

public class Main1 {
    public static void main(String[] args) {
        //цикл в цикле + двумерный массив

        int[][] numbers = {{3, 6, 7, 8},
                            {3, 2, 4, 8},
                            {7, 9, 2, 3}};
        for(int i = 0; i < numbers.length; i++){ //индексы строк
            for(int j = 0; j < numbers[i].length; j++){ //индексы колонок
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }
    }
}
