package java8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class IntermediateOps {
    public static void main(String[] args) {

        // Intermediate operations transform a stream into another stream
        // They are lazy, meaning they don't execute until a terminal operation is invoked.

        // 1. filter
        List<String> list = Arrays.asList("Akshit", "Ram", "Shyam", "Ghanshyam");

        Stream<String> filteredStream = list.stream().filter(x -> x.startsWith("A"));
        // No filtering at this point (stream is lazy)

        long res = list.stream().filter(x -> x.startsWith("A")).count();
        // Terminal operation triggers evaluation

        System.out.println(res); // Output: 1

        // 2️⃣ map
        // 👉 map() is used to transform each element in the stream.
        // For example, convert all strings to uppercase.
        Stream<String> stringStream = list.stream().map(String::toUpperCase);

        // 3️⃣ sorted
        // 👉 sorted() returns a stream with elements sorted in natural order.
        Stream<String> sortedStream = list.stream().sorted();

        // 👉 You can also sort using a custom comparator (e.g., by string length).
        Stream<String> sortedStreamUsingComparator = list.stream().sorted((a, b) -> a.length() - b.length());

        // 4️⃣ distinct
        // 👉 distinct() removes duplicate elements from the stream.
        // Here: Filter names starting with "A", then remove duplicates, then count them.
        System.out.println(
                list.stream().filter(x -> x.startsWith("A")).distinct().count()
        );

        // 5️⃣ limit
        // 👉 limit(n) returns only the first n elements of the stream.
        // Example: Generate an infinite stream, limit it to 100, then count them.
        System.out.println(
                Stream.iterate(1, x -> x + 1).limit(100).count()
        );

        // 6️⃣ skip
        // 👉 skip(n) skips the first n elements of the stream.
        // Here: Skip first 10 numbers, then take next 100 and count them.
        System.out.println(
                Stream.iterate(1, x -> x + 1).skip(10).limit(100).count()
        );
    }
}


