package lesson4;

public class Main2 {
    public static void main(String[] args) {
        int[] numbers = {13, 12, 21, 27,38};
        for(int i = 0; i < numbers.length; i++){
            if(numbers[i] % 2 == 0){
                System.out.println(numbers[i]);
            }
        }
    }
}
