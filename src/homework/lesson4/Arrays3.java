package homework.lesson4;

public class Arrays3 {
    public static void main(String[] args) {
        int[] numbers = {3, 5, 8, 3, 55, 4, 1, 65, 36, 98};

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == 5 || numbers[i] == 55 || numbers[i] == 65){
                System.out.println(numbers[i]);
            }
        }
    }
}