package multithreading;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockEx {
    public static void main(String[] args) {
        Call call =new Call();
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                call.mobileCall();
            }
        });
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                call.viberCall();
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                call.skypeCall();
            }
        });
        thread.start();
        thread1.start();
        thread2.start();

    }
}

class Call {
    Lock lock = new ReentrantLock();

    void mobileCall() {
        lock.lock();
        try {
            System.out.println("Mobile start");
            Thread.sleep(1000);
            System.out.println("Mobile end");
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }
    void viberCall() {
        lock.lock();
        try {
            System.out.println("Viber start");
            Thread.sleep(1000);
            System.out.println("Viber end");
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }
    void skypeCall() {
        lock.lock();
        try {
            System.out.println("Skype start");
            Thread.sleep(1000);
            System.out.println("Skype end");
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }
}
