package homework.lesson3;


public class Loops1a {
    public static void main(String[] args) {
        for(int i = 500; i <= 1000; i++){
            if(i % 7 == 0 && i % 19 == 0){
                System.out.println(i);
            }
        }
    }
}
