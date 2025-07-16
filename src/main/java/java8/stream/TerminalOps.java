package java8.stream;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class TerminalOps {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3);

        //1. collect
        list.stream().skip(1).collect(Collectors.toList());
        list.stream().skip(1).toList();

        //2. foEach
        list.stream().forEach(x -> System.out.println(x));

        //3.reduce : Combines elements to produce a single result
        Optional<Integer> optional = list.stream().reduce((x, y) -> x + y);
        System.out.println(optional.get());

        // 4. anyMatch, allMatch, nonematch
        boolean b = list.stream().anyMatch(x -> x % 2 == 0);
        System.out.println(b);

        boolean b1 = list.stream().allMatch(x -> x > 0);
        System.out.println(b1);

        boolean b2 = list.stream().noneMatch(x -> x < 0);
        System.out.println(b2);

        // 5. findFirst findAny
        System.out.println(list.stream().findFirst().get());
        System.out.println(list.stream().findAny().get());

        //Example.1 : give name list which length > 3
        List<String> names = Arrays.asList("Mahesh", "Mayuri", "Aaradhya", "Nandu","bob","don");
        System.out.println(names.stream().filter(x -> x.length() > 3).toList());

        // Example.2 : Squaring and Sorting Numbers
        List<Integer> numList = Arrays.asList(5,2,4,3,1,9);
        System.out.println(numList.stream().map(x -> x*x).sorted().toList());

        // Example.3 : Summing Value
        List<Integer> sumList = Arrays.asList(1,2,3,4,5);
        System.out.println(sumList.stream().reduce(Integer::sum).get());

        // Example.4 : Counting Occurrence of Character
        String sentence = "hellow world";
        System.out.println(sentence.chars().filter(x -> x =='l').count());






    }
}
