package generics;

public class Parametrized {
    public static void main(String[] args) {
        Info<String> stringInfo = new Info<>("privet");
        System.out.println(stringInfo);
        String s= stringInfo.getValue();

        Info<Integer> integerInfo = new Info<>(55);
        System.out.println(integerInfo);
        Integer integer= integerInfo.getValue();
    }
}
class Info <T> {
    private T value;

    public Info(T value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "{[" + value + "]}";
    }

    public T getValue() {
        return value;
    }
}
