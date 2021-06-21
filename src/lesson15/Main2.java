package lesson15;

public class Main2 {
    public static void main(String[] args) {

        StringUtilsImpl utils = new StringUtilsImpl();
        double div = 0.0;
        try {
            div = utils.div("1", "2");
        }
        catch (NullPointerException e){
            e.printStackTrace();
        }

        System.out.println(div);

    }
}
