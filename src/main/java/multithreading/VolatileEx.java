package multithreading;

public class VolatileEx  extends Thread{
    volatile  boolean b=true;
    public void run() {
        long count = 0;
        while (b) count++;
        System.out.println("finish count: " + count);
    }
    public static void main(String[] args) throws InterruptedException {
        VolatileEx volatileEx = new VolatileEx();
        System.out.println("start");
        volatileEx.start();
        Thread.sleep(3000);
        volatileEx.b=false;
        volatileEx.join();
        System.out.println("main finish");

    }
}
