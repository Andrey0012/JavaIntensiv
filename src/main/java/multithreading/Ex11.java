package multithreading;

public class Ex11 {
    public static int count = 0;

    public static synchronized void increment() {
        count++;
    }

    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(new R());
        Thread thread2 = new Thread(new R());
        Thread thread3 = new Thread(new R());
        thread.start();
        thread2.start();
        thread3.start();
        thread.join();
        thread2.join();
        thread3.join();
        System.out.println(count);

    }
}

class R implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            Ex11.increment();
        }
    }
}
