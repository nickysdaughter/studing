package lesson4;

public class Main1 {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        int value = 2;
        for(int i = 0; i < numbers.length; i++){
            numbers[i] = value;
            value += 2;
            System.out.println(numbers[i]);
        }
    }
}
