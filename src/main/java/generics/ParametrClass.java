package generics;

public class ParametrClass {
    public static void main(String[] args) {
        Pair<String, Integer> integerPair = new Pair<>("Privet" , 85);
        System.out.println(integerPair.getFirst() + "-----" + integerPair.getSecond());
        OtherPair<String> stringOtherPair = new OtherPair<>("Privet", "Ivan");
        System.out.println(stringOtherPair.getFirst() + " "+ stringOtherPair.getSecond());

    }
}
class Pair <V1, V2> {
    private V1 value1;
    private V2 value2;

    public Pair(V1 value1, V2 value2) {
        this.value1 = value1;
        this.value2 = value2;
    }
    public V1 getFirst () {
        return value1;
    }
    public V2 getSecond () {
        return value2;
    }
}
class OtherPair <V> {
    private V value1;
    private V value2;

    public OtherPair(V value1, V value2) {
        this.value1 = value1;
        this.value2 = value2;
    }
    public V getFirst () {
        return value1;
    }
    public V getSecond () {
        return value2;
    }
}
