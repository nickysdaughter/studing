package lesson3;

public class Main9 {
    public static void main(String[] args) {
        String text = "Java is the capital of Great Britain";
        for(int i = text.length() - 1; i >= 0; i--){
            System.out.println(text.charAt(i));
        }
    }
}
