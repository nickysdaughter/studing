package lesson6;

public class StringUtils {
    //методы
    //1 - модификатор доступа:
    //public - этот код будет доступен внутри всего проекта
    //_______ (пусто) - будет доступен внутри пакета + наследникам
    //protected - доступ внутри класса и наследникам
    //private - этот код будет доступен внутри класса
    //2 - static (может не быть)
    //3 - возвращаемый тип (указываем тип), void - ничего не возвращаем
    //4 - название метода (с маленькой буквы)
    //5 - входящие параметры (то без чего невозможно выполнить метод) записываются в ()
    //6 - тело выполнения метода в {}


    public static int numberOfSpaces(String text) {
        char[] charsFromText = text.toCharArray(); //преобразовали текст в массив символов
        int summ = 0;
        for (int i = 0; i < charsFromText.length; i++) {
            if (charsFromText[i] == ' ') {
                summ++;
            }
        }
        return summ;
    }

    public static String replaceVowelsToUpperCase(String text) {

        //text = "Коллеги, всем привет"
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == 'о') {
                text = text.replace('о', 'О');
            }
            if (text.charAt(i) == 'е') {
                text = text.replace('е', 'Е');
            }
            if (text.charAt(i) == 'и') {
                text = text.replace('и', 'И');
            }
            if (text.charAt(i) == 'а') {
                text = text.replace('а', 'А');
            }
            if (text.charAt(i) == 'у') {
                text = text.replace('у', 'У');
            }
            if (text.charAt(i) == 'э') {
                text = text.replace('э', 'Э');
            }

        }
        return text;
    }

    public static void printWordsRevers(String text) {
        String[] wordsFromText = text.split(" ");

        for(int i = wordsFromText.length-1; i >= 0; i--){
            System.out.println(wordsFromText[i]);
        }
    }

    public static boolean printYesOrNo (String text, String symbols){
        for (int i = 0; i < symbols.length(); i++){
            if(text.contains(symbols.charAt(i) + "")){
                return true;
            }
        }
        return false;
    }
}
