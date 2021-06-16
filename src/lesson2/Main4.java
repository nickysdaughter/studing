package lesson2;

public class Main4 {
    public static void main(String[] args) {
       int mark = 4;
       switch (mark){
           case 5:
               System.out.println("Отлично!");
               break;
            case 4:
            System.out.println("Хорошо!");
            break;
            case 3:
                System.out.println("Уд!");
            break;
            case 2:
               System.out.println("Неуд!");
               break;
           default:
               System.out.println("Это не оценка");
        }
    }
}
