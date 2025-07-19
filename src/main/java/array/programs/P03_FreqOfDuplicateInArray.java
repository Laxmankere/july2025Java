package array.programs;

import java.util.HashMap;
import java.util.Map;

public class P03_FreqOfDuplicateInArray {

    public static void main(String[] args) {
        int nums[] = {1, 20, 2, 1, 10, 11, 11, 44, 84, 45, 20};

        // HashMap to store occurrences of numbers
        Map<Integer, Integer> map = new HashMap<>();

        // Count occurrences of each number
        for (int num : nums) {
            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num, 1);
            }
        }
//			map.put(num, map.getOrDefault(num, 0) + 1);

        // Print duplicates only
        System.out.println("Duplicate elements and their occurrences:");
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + " , occurs " + entry.getValue() + " : times");
            }
        }
    }
}
