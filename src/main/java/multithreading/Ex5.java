package multithreading;

public class Ex5 {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.setPriority(Thread.MIN_PRIORITY);
        myThread.setName("Ian");
        System.out.println(myThread.getName() + "  " + myThread.getPriority());

    }
}

class MyThread extends Thread {
    public void run () {
        System.out.println("Privet");
    }
}