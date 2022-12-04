package multithreading;

public class Ex10 {
    public static void main(String[] args) {
        MyRannabelImp myRannabelImp = new MyRannabelImp();
        Thread thread = new Thread(myRannabelImp);
        Thread thread2 = new Thread(myRannabelImp);
        Thread thread3 = new Thread(myRannabelImp);
        thread.start();
        thread2.start();
        thread3.start();
    }
}
class Counter {
    static int count = 0;
}
class MyRannabelImp implements Runnable {
    public synchronized void iter () {
        Counter.count++;
        System.out.println("count: " +Counter.count);
    }
    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            iter();
        }
    }
}
