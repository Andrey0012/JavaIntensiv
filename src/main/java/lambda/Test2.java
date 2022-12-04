package lambda;

public class Test2 {
    static void def(I a) {
        System.out.println(a.abc("privet"));
    }

    public static void main(String[] args) {
        def(s -> s.length());
    }
}
interface I {
    int abc (String s);
}
