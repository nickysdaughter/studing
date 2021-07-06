package lesson19;

public abstract class AbstractTask implements Task {

    private int tryCount;


    @Override
    public int getTryCount() {
        return tryCount;
    }

    @Override
    public void incTryCount() {
        tryCount++;
    }
}
