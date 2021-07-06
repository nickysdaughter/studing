package lesson19;

import java.io.File;
import java.io.FileFilter;
import java.io.FileNotFoundException;
import java.io.PrintStream;

public class FindFilesTaskImpl extends AbstractTask implements FindFilesTask {

    private String directory;
    private String searchString;
    private PrintStream out;

    @Override
    public void setDirectory(String directory) throws NullPointerException, FileNotFoundException {
        this.directory = directory;
    }

    @Override
    public void setFileNameSearchString(String searchString) throws IllegalArgumentException {
        this.searchString = searchString;
    }

    @Override
    public void setPrintStream(PrintStream out) {
        this.out = out;
    }

    @Override
    public void execute() throws TaskExecutionFailedException {
        File startDir = new File(directory);
        if (!startDir.exists()) {
            throw new TaskExecutionFailedException("Такая дериктория не существует");
        }
        File[] files = startDir.listFiles(new FileFilter() {
            @Override
            public boolean accept(File file) {
                if (file.getName().contains(searchString)) {
                    return true;
                }
                return false;
            }
        });

        for (File f : files) {
            out.println(f.getAbsolutePath());
        }
    }
}
