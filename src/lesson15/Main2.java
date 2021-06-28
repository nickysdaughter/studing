package lesson15;

import java.util.Arrays;

public class Main2 {
    public static void main(String[] args) {

        StringUtilsImpl utils = new StringUtilsImpl();
        /*double div = 0.0;
        try {
            div = utils.div("1", "2");
        }
        catch (NullPointerException e){
            e.printStackTrace();
        }

        System.out.println(div);

         */
        try {
            utils.findWord("мама мыла раму", "мама");
        }
        catch (NullPointerException e) {
            e.printStackTrace();
        }

       try {
            utils.findNumbers("Число π - это 3.14");
        }
        catch (CustomException e) {
            e.printStackTrace();
        }
    }
}
