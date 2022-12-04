package multithreading;

public class Ex8 extends Thread {
    public void run() {
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "  "+ i);
        }
    }
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(new MyRunnable());
        Ex8 ex8 = new Ex8();
        thread.start();
        ex8.start();
        thread.join();
        ex8.join();
        System.out.println("Privet");
    }
}
class MyRunnable implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "  "+ i);
        }
    }
}