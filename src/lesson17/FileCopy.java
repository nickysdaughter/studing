package lesson17;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileCopy {
    public static void main(String[] args) {
        try {
            BufferedInputStream bis = new BufferedInputStream(new FileInputStream("C:\\Pic\\cat.jpg"));
            BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("src\\lesson17\\copy.jpg"));

            int c = 0;                       //перевозит по 1 байту
            while (true) {
                c = bis.read();
                if (c != -1)                //"это не конец файла?"
                    bos.write(c);
                else
                    break;
            }
            bis.close();
            bos.flush(); //освобождаем буфер (принудительно записываем содержимое буфера в файл)
            bos.close(); //закрываем поток записи (обязательно!)
        }
        catch (java.io.IOException e) {
            System.out.println(e.toString());
        }
    }
}
