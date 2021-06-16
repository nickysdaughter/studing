package homework.lesson4;

public class Arrays5 {
    public static void main(String[] args) {
        String text = "Я буду учиться лучше";
        String[] arrayOfWords =  text.split(" ");
        for(int i = arrayOfWords.length - 1; i >= 0; i--){
            System.out.println(arrayOfWords[i]);
        }
    }
}
