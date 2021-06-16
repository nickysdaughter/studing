package homework.lesson4;

public class Arrays4 {
    public static void main(String[] args) {
        String text = "Я буду учиться лучше";
        String[] arrayOfWords =  text.split(" ");
        for(int i = 0; i < arrayOfWords.length; i++){
            System.out.println(arrayOfWords[i]);
        }
    }
}
