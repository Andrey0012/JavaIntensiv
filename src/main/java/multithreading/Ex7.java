package multithreading;

public class Ex7 {
    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
            Thread.sleep(1000);
        }
        System.out.println("Поехали");
    }
}
