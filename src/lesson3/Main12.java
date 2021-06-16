package lesson3;

public class Main12 {
    //сумма гласный чисел
    public static void main(String[] args) {
        String text = "Тестовый текст";
        int count = 0;
        for(int i = 0; i < text.length(); i++){
            if(text.charAt(i) == 'е'|| text.charAt(i) == 'о' || text.charAt(i) == 'ы' ||
                    text.charAt(i) == 'й'){
                System.out.println(text.charAt(i));
            }
        }
    }
}
