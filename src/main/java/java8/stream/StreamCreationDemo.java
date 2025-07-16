package java8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamCreationDemo {

    public static void main(String[] args) {
        /// Creating Streams

        // 1. From collections
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        Stream<Integer> stream = list.stream();

        // 2. From arrays
        String[] arr = {"a", "b", "c"};
        Stream<String> stream1 = Arrays.stream(arr);

        // 3. Using Stream.of()
        Stream<String> stream2 = Stream.of("a", "b");
    }
}
