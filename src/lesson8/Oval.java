package lesson8;

public class Oval extends Circle {
    private double radius2;

    public Oval() {
    }

    public Oval(double radius1, double radius2){
        super(radius1); //конструктор родительского класса
        this.radius2 = radius2;
    }
}

/*Что бы выдавать проще было, кругу - 1 сторона
(и она называется просто сторона), а в овале - 2 стороны,
и они называются сторона 1 и сторона 2.
Сторона 1 овала привязывается к стороне круга
 */

