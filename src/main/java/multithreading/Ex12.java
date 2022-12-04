package multithreading;

public class Ex12 {
    static final Object lock = new Object();
    public void mobileCall () {
        synchronized (lock) {
            System.out.println("mobile start");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("mobile end");
        }
    }
    void  skypeCall () {
        synchronized (lock) {
            System.out.println("skype start");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("skype end");
        }
    }
    void viberCall () {
        synchronized (lock) {
            System.out.println("viber start");
            try {
                Thread.sleep(4000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("viber end");
        }
    }
    public static void main(String[] args) {
        Thread thread1 = new Thread(new MobileCallRunnable());
        Thread thread2 = new Thread(new SkypeCallRunnable());
        Thread thread3 = new Thread(new ViberCallRunnable());
        thread1.start();
        thread2.start();
        thread3.start();


    }
}
class MobileCallRunnable implements Runnable {

    @Override
    public void run() {
        new Ex12().mobileCall();
    }
}
class SkypeCallRunnable implements Runnable {

    @Override
    public void run() {
        new Ex12().skypeCall();
    }
}
class ViberCallRunnable implements Runnable {

    @Override
    public void run() {
        new Ex12().viberCall();
    }
}
