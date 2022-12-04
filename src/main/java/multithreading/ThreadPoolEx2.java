package multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ThreadPoolEx2 {
    public static void main(String[] args) throws InterruptedException {
        //нужен когда хотии установить какое то расписание наших потоков
        ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(1);
        for (int i = 0; i < 10; i++) {
            scheduledExecutorService.execute(new Runnable200());
        }

       //выполнит задание через 3 секунд
        scheduledExecutorService.schedule(new Runnable200(), 3, TimeUnit.SECONDS);

        //плпнирует задачу для переодического выполнения, period это вермя междц началом n-таска, до начала n+1 таска
        scheduledExecutorService.scheduleAtFixedRate(new Runnable200(), 5, 2, TimeUnit.SECONDS);

        //плпнирует задачу для переодического выполнения, delay это вермя между концом n-таска, до начала n+1 таска
        scheduledExecutorService.scheduleWithFixedDelay(new Runnable200(), 3, 1, TimeUnit.SECONDS);
        Thread.sleep(20000);
        // завершение executorService
        scheduledExecutorService.shutdown();

        //кэшированный тредпул, буедт создавать новые потки по надобности
        ExecutorService executorService = Executors.newCachedThreadPool();
    }
}
class Runnable200 implements Runnable {

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + "  begin work");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + "  ends work");
    }
}
