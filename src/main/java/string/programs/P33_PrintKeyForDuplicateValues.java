package string.programs;


import java.util.*;

public class P33_PrintKeyForDuplicateValues {
    public static void main(String[] args) {
        Map<Integer, String> mp = new LinkedHashMap<>();
        mp.put(1, "Tamil");
        mp.put(2, "Raj");
        mp.put(3, "Tamil");
        mp.put(4, "Ram");
        mp.put(5, "Tamil"); // overwrites any previous value for key 5
        mp.put(6, "Raj");

        // Step 1: Create a reverse map: value -> list of keys
        Map<String, List<Integer>> reverseMap = new HashMap<>();

        for (Map.Entry<Integer, String> entry : mp.entrySet()) {
            int key = entry.getKey();
            String value = entry.getValue();

            // Add key to the list for this value
            if (reverseMap.containsKey(value)) {
                reverseMap.get(value).add(key);
            } else {
                List<Integer> keys = new ArrayList<>();
                keys.add(key);
                reverseMap.put(value, keys);
            }
        }

        // Step 2: Print only values with more than one key
        System.out.println("Keys grouped by duplicate values:");
        for (Map.Entry<String, List<Integer>> entry : reverseMap.entrySet()) {
            String value = entry.getKey();
            List<Integer> keys = entry.getValue();

            if (keys.size() > 1) { // Only print if duplicate
                System.out.println(value + " = " + keys);
            }
        }
    }
}
