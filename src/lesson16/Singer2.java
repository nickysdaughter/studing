package lesson16;

public class Singer2 extends Thread {
    @Override
    public void run() {
        while (true) {
            synchronized (Monitors.MICROPHONE) {
                try {
                    Monitors.MICROPHONE.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            for (int i = 0; i < 2; i++) {
                System.out.println("Фааааа" +  Thread.currentThread().getName());
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            synchronized (Monitors.MICROPHONE) {
                Monitors.MICROPHONE.notify();
            }

        }
    }
}
