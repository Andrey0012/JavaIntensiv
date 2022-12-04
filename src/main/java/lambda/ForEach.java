package lambda;

import java.util.List;

public class ForEach {
    public static void main(String[] args) {
        List<String> stringList =List.of("privet", "kak dela", "or", "sdfhebdt");
        for (String s: stringList) {
            System.out.println(s);
        }
        System.out.println("-----------------");
        stringList.forEach(s -> System.out.println(s));
        List<Integer> integerList = List.of(1,2,3,4,5);
        integerList.forEach(s-> {
            System.out.println(s);
        s*=2;
            System.out.println(s);});
    }
}
