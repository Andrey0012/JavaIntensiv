package lambda;

import java.util.ArrayList;
import java.util.function.Predicate;

public class RemoveIf {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Privet");
        arrayList.add("Poka");
        arrayList.add("ok");
        arrayList.add("Privet and");
        arrayList.add("Privet Java");
        arrayList.add("a imenno lamddas");
      //  arrayList.removeIf(s -> s.length()<7);
        Predicate<String>  predicate = s->s.length()>7;
        arrayList.removeIf(predicate);
        System.out.println(arrayList);

    }
}
