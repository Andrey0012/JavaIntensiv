package multithreading;

public class SynchronizedBlock1 {
    public static void main(String[] args) {
        MyRannabelImp2 myRannabelImp = new MyRannabelImp2();
        Thread thread = new Thread(myRannabelImp);
        Thread thread2 = new Thread(myRannabelImp);
        Thread thread3 = new Thread(myRannabelImp);
        thread.start();
        thread2.start();
        thread3.start();
    }
}
class Counter2 {
    static int count = 0;
}
class MyRannabelImp2 implements Runnable {
    public void doWork2() {
        System.out.println("Privet");
    }
    public  void doWork1() {
        doWork2();
        synchronized (this) {
            Counter2.count++;
            System.out.println(Counter2.count);
        }
    }
    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            doWork1();
        }
    }
}