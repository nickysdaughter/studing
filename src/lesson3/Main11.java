package lesson3;

public class Main11 {
    public static void main(String[] args) {
        String text = "Текст";
        for(int i = 0; i < text.length(); i++){
            if(text.charAt(i) == 'е'){
                System.out.println(text.charAt(i));
            }
        }
    }
}
