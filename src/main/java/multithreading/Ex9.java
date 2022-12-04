package multithreading;

public class Ex9 {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("main begin");
        Thread thread = new Thread(new Worker());
        System.out.println(thread.getState());
        thread.start();
        System.out.println(thread.getState());
        thread.join(4000);
        System.out.println(thread.getState());
        System.out.println("main ends");
    }
}

class Worker implements  Runnable {

    @Override
    public void run() {
        System.out.println("worker begin");
        try {
            Thread.sleep(2500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("worker ends");
    }
}