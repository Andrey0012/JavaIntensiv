package generics;

import java.util.ArrayList;
import java.util.List;

public class ParavemetrMethod {
    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();
        integerList.add(5);
        integerList.add(15);
        integerList.add(55);
        integerList.add(57);
        int element = CanMethod.getElement(integerList);
        System.out.println(element);
        List<String> stringList = new ArrayList<>();
        stringList.add("dsa");
        stringList.add("vdsa");
        stringList.add("dvvvsa");
        stringList.add("dsavvvvvvvv");
        String element1 = CanMethod.getElement(stringList);
        System.out.println(element1);


    }
}
class CanMethod {
    public static <T> T getElement (List<T> arrayList) {
        return arrayList.get(1);
    }
}
