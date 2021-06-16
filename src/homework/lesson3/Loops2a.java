package homework.lesson3;

public class Loops2a {
    public static void main(String[] args) {
        String text = "Java is the capital of Great Britain";
        int count = 0;
        for(int i = 0; i < text.length(); i++){
            if(text.charAt(i) == ' '){
                count++;
            }
        }
        System.out.print("Количество пробелов в строке: ");
        System.out.println(count);
    }
}
