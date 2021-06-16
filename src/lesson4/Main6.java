package lesson4;

public class Main6 {
    public static void main(String[] args) {
        //шифр цезаря
        String word = "hello world";
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        String codeWord = "";

        for(int i = 0; i < word.length(); i++){
            char currentSymbol = word.charAt(i);
            int indexFromAlphabet = alphabet.indexOf(currentSymbol);
            if( indexFromAlphabet != -1){
                char replacedChar = alphabet.charAt(indexFromAlphabet + 1);
                codeWord = codeWord + replacedChar;
            }else{
                codeWord = codeWord + currentSymbol;
            }
        }
        System.out.println(codeWord);
    }
}
