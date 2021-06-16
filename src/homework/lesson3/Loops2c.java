package homework.lesson3;

public class Loops2c {
    public static void main(String[] args) {
        String text = "Java is the capital of Great Britain";
        for(int i = text.length() - 1; i >= 0 ; i--){
            if(text.charAt(i) == 'a' || text.charAt(i) == 'i'|| text.charAt(i) == 'e'
            || text.charAt(i) == 'o'){
                System.out.println(text.charAt(i));
            }
        }
    }
}
