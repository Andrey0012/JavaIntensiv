package multithreading;

import java.util.concurrent.*;

public class CallableFactorial {
    static int factorialResult;

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Factorial1 factorial1 = new Factorial1(5);
        //submit возврашает результат таска
        Future future = executorService.submit(factorial1);
        try {
            factorialResult = (int) future.get();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            System.out.println(e.getCause());
        }executorService.shutdown();
        System.out.println(factorialResult);
    }
}

class Factorial1 implements Callable {
    int f;

    public Factorial1(int f) {
        this.f = f;
    }

    @Override
    public Integer call() throws Exception {
        if (f<0) throw new Exception("ввели неправильное число");
        int result=1;
        for (int i = 1; i <= f; i++) {
            result*=i;
        }
        return result;
    }
}
