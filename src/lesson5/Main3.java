package lesson5;

public class Main3 {
    public static void main(String[] args) {
        int[][] numbers = new int[5][5];
        for(int i = 0; i < numbers.length; i++){
            for(int j = 0; j < numbers[i].length; j++){
                if(i % 2 == 0){
                    if(j % 2 == 0){
                        System.out.print(numbers[i][j] + " ");
                    }else{
                        System.out.print("  ");
                    }
                }else {
                    if(j % 2 != 0){
                        System.out.print(numbers[i][j] + " ");
                    }else{
                        System.out.print("  ");
                    }
                }
            }
            System.out.println();
        }
    }
}
