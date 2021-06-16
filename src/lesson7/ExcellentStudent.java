package lesson7;

public class ExcellentStudent extends Student{


    @Override
    public void printPerimeterOfTr(int a, int b, int c) {
        if((a + b < c) || (c + b < a) || (a + c < b)){
            System.out.println("Такого треугольника не существует");
            return;
        }
        System.out.println(a + b + c);
    }
}
