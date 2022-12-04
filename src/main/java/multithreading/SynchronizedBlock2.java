package multithreading;

public class SynchronizedBlock2 {
    public static int count = 0;

    public static void increment() {
        synchronized (SynchronizedBlock2.class) {
            count++;
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(new R2());
        Thread thread2 = new Thread(new R2());
        Thread thread3 = new Thread(new R2());
        thread.start();
        thread2.start();
        thread3.start();
        thread.join();
        thread2.join();
        thread3.join();
        System.out.println(count);

    }
}

class R2 implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            Ex11.increment();
        }
    }
}

