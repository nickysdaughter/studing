package lesson1;

public class MySecondProject {
    public static void main(String[] args) {
        double roomWidth = 5.7;
        double roomLength = 4; //автоматически преобразование типа

        double tableWidth = 2;
        double tableLength = 2.6;

        double roomSqr = roomWidth * roomLength;
        double tableSqr = tableWidth * tableLength;

        int numberOfTablesInRoom = (int)(roomSqr / tableSqr);
        System.out.println("Столов: " + numberOfTablesInRoom);

        double freeSqr = roomSqr - tableSqr * numberOfTablesInRoom;
        System.out.println("Остаток площади: " + freeSqr);
    }
}
