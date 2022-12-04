package multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ThreadPoolEx {
    public static void main(String[] args) throws InterruptedException {

        //содержит несколь потоков
        //ExecutorService executorService = Executors.newFixedThreadPool(5);

        //содержит один поток
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        for (int i = 0; i < 10; i++) {
            executorService.execute(new Runnable100());
        }
        // завершение executorService
        executorService.shutdown();
        Executors.newSingleThreadScheduledExecutor();

        //awaitTermination рабоатет как метод join , только с определенным временем
        executorService.awaitTermination(3, TimeUnit.SECONDS);
        System.out.println("main end");

    }
}
class Runnable100 implements Runnable {

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
