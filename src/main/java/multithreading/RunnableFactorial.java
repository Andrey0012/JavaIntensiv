package multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class RunnableFactorial {
    static int factorialResult;

    public static void main(String[] args) throws InterruptedException {
        //  создаем newSingleThreadExecutor, один поток будет достаточно
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        //создаем экземпляр класс
        Factorial factorial = new Factorial(5);
        //execute метод добавления нашего таска, execute ничего не возвращает
        executorService.execute(factorial);
        executorService.shutdown();
        executorService.awaitTermination(10, TimeUnit.SECONDS);
        System.out.println(factorialResult);
    }
}

class Factorial implements Runnable {
    int f;

    public Factorial(int f) {
        this.f = f;
    }

    @Override
    public void run() {
        if (f < 0) {
            System.out.println("неверное число");
            return;
        }
        int result = 1;
        for (int i = 1; i <= f; i++) {
            result *= i;
        }
        RunnableFactorial.factorialResult = result;
    }
}
