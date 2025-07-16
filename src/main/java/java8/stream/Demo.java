package java8.stream;

import javax.crypto.spec.PSource;
import java.util.function.Predicate;

public class Demo {
    public static void main(String[] args) {

        Predicate<Integer> isEven = x -> x % 2 == 0;
        System.out.println(isEven.test(4));

        Predicate<String> isWordStartWithL =x -> x.toLowerCase().startsWith("l");
        System.out.println(isWordStartWithL.test("Laxman"));
        System.out.println(isWordStartWithL.test("don"));
    }


}
