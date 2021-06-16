package lesson5;

public class Main2 {
    public static void main(String[] args) {
        int[][] numbers = {{3, 6, 7, 8},
                            {3, 2, 4, 8},
                            {7, 9, 2, 3}};

        for(int i = 0; i < numbers.length; i++){
            for(int j = 0; j < numbers[i].length; j++){
                if(numbers[i][j] % 2 == 0 ){
                    System.out.print(numbers[i][j] + " ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
