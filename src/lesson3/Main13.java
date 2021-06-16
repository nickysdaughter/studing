package lesson3;

public class Main13 {
    public static void main(String[] args) {
        String password = "!*/qwerty123";
        int count = 0;
        for(int i = 0; i < password.length(); i++){
            if(password.charAt(i) == '!' || password.charAt(i) == '?'
            || password.charAt(i) == '*' || password.charAt(i) == '/'){
                count++;
            }
        }
        if(count == 0){
            System.out.println("Слабый пароль");
        }else if(count > 0 && count <= 2){
            System.out.println("Средний пароль");
        }else {
            System.out.println("Сильный пароль");
        }
    }
}
