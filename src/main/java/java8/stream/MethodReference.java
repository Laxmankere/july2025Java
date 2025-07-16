package java8.stream;

import java.util.Arrays;
import java.util.List;

public class MethodReference {
    public static void main(String[] args) {
        // Method Reference : use method without invoking & in place of lamda expression

        List<String> studentName = Arrays.asList("laxman","Vaishali","Mahesh","Mayuri");
//        studentName.forEach(x -> System.out.println(x));
        studentName.forEach(System.out::println);
    }
}
