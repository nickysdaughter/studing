package lesson4;

public class Main5 {
    public static void main(String[] args) {
        String email = "test@test.vom";

        String[] arr =  email.split("@");
        if(arr.length == 1){
            System.out.println("Нет @");
            return;
        }

        if(arr.length > 2){
            System.out.println("Больше одной @");
            return;
        }

        if(arr[0].startsWith(".") || arr[0].endsWith(".")){
            System.out.println("Точка в начале/конце имени почты");
            return;
        }

        if(arr[1].startsWith(".") || arr[1].endsWith(".")){
            System.out.println("Точка в начале/конце домена почты");
            return;
        }

        if (arr[1].indexOf(".") == -1) {
            System.out.println("Нет точки - нет домена");
            return;
        }

        System.out.println("Почта верна");
    }
}
