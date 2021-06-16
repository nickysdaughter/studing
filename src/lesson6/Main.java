package lesson6;

public class Main {
    public static void main(String[] args) {
        int count = StringUtils.numberOfSpaces(" test test test");
        System.out.println(count);
        String text = StringUtils.replaceVowelsToUpperCase("Тестовый текст");
        System.out.println(text);
        NumberUtils.printMinNumber(2, 2, 4, 5);
        StringUtils.printWordsRevers("Какой-то текст просто так");

        //StringUtils.printYesOrNo("Some text");
    }
}
