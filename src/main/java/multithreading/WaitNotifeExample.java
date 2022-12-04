package multithreading;

public class WaitNotifeExample {
    public static void main(String[] args) {
        Market  market = new Market();
        Thread thread =new Thread(new Consumer(market));
        Thread thread1 =new Thread(new Producer(market));
        thread.start();
        thread1.start();

    }
}

class Market {
    public int breadCount = 0;

    public synchronized void getBread() {
        while (breadCount < 1) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        breadCount--;
        System.out.println("Покупатель купил 1 хлеб в магазине");
        System.out.println("количества хлеба в магазине  " + breadCount);
        notify();
    }
    public synchronized void putBread () {
        while (breadCount>=5) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        breadCount++;
        System.out.println("Производитель добавил  1 хлеб в магазин");
        System.out.println(" количесива хелба в магазине " +breadCount);
        notify();
    }

}

class Consumer implements Runnable {
    private Market market;

    public Consumer(Market market) {
        this.market = market;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            market.getBread();
        }
    }
}

class Producer implements Runnable {
    private Market market;

    public Producer(Market market) {
        this.market = market;
    }
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            market.putBread();
        }
    }
}