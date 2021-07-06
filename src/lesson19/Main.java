package lesson19;

import lesson17.CopyByOneByte;

import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) {
        CopyFileTaskImpl task1 = new CopyFileTaskImpl("C:\\Users\\marya\\Downloads\\The_Sims_Vacation_[tfile.ru].iso",
                "C:\\Users\\marya\\Downloads\\The_Sims_Vacation_[tfile.ru]-copy.iso");
        task1.setFileCopyUtils(new CopyByOneByte());

        CopyFileTaskImpl task2 = new CopyFileTaskImpl("C:\\Users\\marya\\Downloads\\VSCodeUserSetup-x64-1.54.1.exe",
                "C:\\Users\\marya\\Downloads\\VSCodeUserSetup-x64-1.54.1-copy.exe");
        task2.setFileCopyUtils(new CopyByOneByte());

        CopyFileTaskImpl task3 = new CopyFileTaskImpl("C:\\Users\\marya\\Downloads\\LTBrowser.exe",
                "C:\\Users\\marya\\Downloads\\LTBrowser-copy.exe");
        task3.setFileCopyUtils(new CopyByOneByte());

        CopyFileTaskImpl task4 = new CopyFileTaskImpl("C:\\Users\\maryaaaaa\\Downloads\\DiscordSetup.exe",
                "C:\\Users\\marya\\Downloads\\DiscordSetup-copy.exe");
        task4.setFileCopyUtils(new CopyByOneByte());

        CopyFileTaskImpl task5 = new CopyFileTaskImpl("C:\\Users\\marya\\Downloads\\Postman-win64-7.23.0-Setup.exe",
                "C:\\Users\\marya\\Downloads\\Postman-win64-7.23.0-Setup-copy.exe");
        task5.setFileCopyUtils(new CopyByOneByte());

        FindFilesTaskImpl task6 = new FindFilesTaskImpl();
        try {
            task6.setDirectory("C:\\Users\\marya\\Downloads");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        task6.setFileNameSearchString("LTBrowser");
        task6.setPrintStream(System.out);

        FindFilesTaskImpl task7 = new FindFilesTaskImpl();
        try {
            task7.setDirectory("C:\\Users\\marya\\Downloads");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        task7.setFileNameSearchString("DiscordSetup");
        task7.setPrintStream(System.out);

        TaskStorageImpl storage = new TaskStorageImpl();
        storage.add(task1);
        storage.add(task2);
        storage.add(task3);
        storage.add(task4);
        storage.add(task5);
        storage.add(task6);
        storage.add(task7);

        TaskExecutorImpl executor1 = new TaskExecutorImpl();
        executor1.setStorage(storage);

        TaskExecutorImpl executor2 = new TaskExecutorImpl();
        executor1.setStorage(storage);

        TaskExecutorImpl executor3 = new TaskExecutorImpl();
        executor1.setStorage(storage);

        executor1.start();
        executor2.start();
        executor3.start();
    }
}
