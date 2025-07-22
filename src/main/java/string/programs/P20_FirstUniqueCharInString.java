package string.programs;

import java.util.HashMap;
import java.util.Map;

public class P20_FirstUniqueCharInString {
    public static void main(String[] args) {
        System.out.println(firstUniqChar("leetcode"));       // Output: 0
//        System.out.println(firstUniqChar("loveleetcode"));   // Output: 2
//        System.out.println(firstUniqChar("aabb"));           // Output: -1
    }

    public static int firstUniqChar(String s) {
        Map<Character, Integer> hm = new HashMap<>();

        // Step 1: Count frequency of each character
        for (char ch : s.toCharArray()) {
//            map.put(ch, map.getOrDefault(ch, 0) + 1);
            if (hm.containsKey(ch)) {
                hm.put(ch, hm.get(ch) + 1);
            } else {
                hm.put(ch, 1);
            }
        }
        // Step 2: Find first character with frequency 1
        for (int i = 0; i < s.length(); i++) {
            if (hm.get(s.charAt(i)) == 1) {
                return i;
            }
        }
        return -1; // No unique character found
    }
}
