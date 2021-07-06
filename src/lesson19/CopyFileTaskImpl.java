package lesson19;

import lesson17.FileCopyFailedException;
import lesson17.FileCopyUtils;

public class CopyFileTaskImpl extends AbstractTask implements CopyFileTask {

    private String from;
    private String to;
    private FileCopyUtils copyUtils;

    public CopyFileTaskImpl(String from, String to) {
        this.from = from;
        this.to = to;
    }

    @Override
    public void setFileCopyUtils(FileCopyUtils copyUtils) {
        this.copyUtils = copyUtils;
    }

    @Override
    public void execute() throws TaskExecutionFailedException {
        try {
            copyUtils.copyFile(from, to);
        } catch (Exception e) {
            throw new TaskExecutionFailedException(e.getMessage());
        }
    }
}
