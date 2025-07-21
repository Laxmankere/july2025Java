package array.programs;

import java.util.HashMap;
import java.util.Map;

public class P02_LuckyInteger {
    // A lucky integer - appears exactly as many times as its value.
    public static void main(String[] args) {
        int[] arr = {2, 2, 3, 4, 3, 4, 5};
        int result = findLucky(arr);
        System.out.println("Lucky Integer: " + result); // Output: 2
    }

    public static int findLucky(int[] arr) {
        Map<Integer, Integer> hm = new HashMap<>();

        // Step 1: Count frequency of each number
        for (int num : arr) {
            if (hm.containsKey(num)) {
                hm.put(num, hm.get(num) + 1);
            } else {
                hm.put(num, 1);
            }
        }
// If there is no lucky integer, we need some default value to return.
        int max = -1;

        // Step 2: Check which number is lucky
        for (Map.Entry<Integer, Integer> entry : hm.entrySet()) {
            if (entry.getKey() == entry.getValue()) {
                max = Math.max(max, entry.getKey());
            }
        }

        return max;
    }
}
