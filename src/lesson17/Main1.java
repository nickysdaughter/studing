package lesson17;

public class Main1 {
    public static void main(String[] args) throws FileCopyFailedException {
        CopyByOneByte copyByOneByte = new CopyByOneByte();

        long startTime1 = System.currentTimeMillis();
        try {
            copyByOneByte.copyFile("C:\\qwerty.docx", "C:\\qwerty-copy.docx");
        } catch (FileCopyFailedException e) {
            e.printStackTrace();
        }
        long endTime1 = System.currentTimeMillis();
        System.out.println("Время копирования CopyByOneByte: " + (endTime1 - startTime1));
    }
}
