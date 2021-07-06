package lesson17;

import java.io.File;
import java.io.FileFilter;

public class Main {
    public static void main(String[] args) {
        File startDir = new File("C:\\JavaRushTasks");
        if (startDir.isDirectory() && startDir.exists()) {
            File[] allPicsFromStartDir = startDir.listFiles(new FileFilter() {
                @Override
                public boolean accept(File file) {
                    if (file.isDirectory()) {
                        return true;
                    }
                    if (file.getName().endsWith(".jpg") ||
                            file.getName().endsWith(".jpeg") ||
                            file.getName().endsWith(".png")) {
                        return  true;
                    }
                    return false;
                }
            });
            for (File f : allPicsFromStartDir) {
                System.out.println(f.getAbsolutePath());
            }
        }
    }
}
