package lesson7;

public class Tour {
    private String name;
    private int days;
    private int cost;
    private String[] countries = new String[10];
    private String typeOfTransport;
    private int numberOfStars;

    public Tour(){

    }


    //конструктор
    public Tour(String name, int days, int cost, String typeOfTransport, int numberOfStars){
        this.name = name;
        this.days = days;
        this.cost = cost;
        this.typeOfTransport = typeOfTransport;
        this.numberOfStars = numberOfStars;
    }

    public void printInfo(){
        System.out.printf("Тур: %s, %d дней, на %s, за %d рублей в %d звезды отель \n", this.name, this.days, this.typeOfTransport, this.cost, this.numberOfStars);
    }
}
