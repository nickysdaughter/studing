package lesson4;

public class Main4 {
    public static void main(String[] args) {
        String text = "Java is the ...";

        char[] arr = text.toCharArray();
        for(int i = arr.length - 1; i >= 0; i--){
            System.out.print(arr[i]);
        }
    }
}
