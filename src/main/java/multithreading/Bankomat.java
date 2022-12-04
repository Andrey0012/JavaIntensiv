package multithreading;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Bankomat {
    public static void main(String[] args) {
        Lock lock = new ReentrantLock();
        Employee employee = new Employee("Ivan", lock);
        Employee employee2 = new Employee("Zayr", lock);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Employee employee3 = new Employee("Andrey", lock);
    }

}

class Employee extends Thread {
    private String name;
    private Lock lock;

    public Employee(String name, Lock lock) {
        this.name = name;
        this.lock = lock;
        this.start();
    }

    public void run() {
        if (lock.tryLock()) {
            try {
                System.out.println(name + " ждет банкомат");
           //     lock.lock();
                System.out.println(name + " пользуется банкоматом");
                Thread.sleep(1000);
                System.out.println(name + " закончил пользоваться банкоатом");
            } catch (InterruptedException e) {
                e.printStackTrace();

            } finally {
                lock.unlock();
            }
        }
        else System.out.println(name + " не хочет жадть в очереди");
    }
}