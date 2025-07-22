package string.programs;

import java.util.*;

public class P14_HighestOccuredChar {
    public static void main(String[] args) {
        String s = "aabbbcccc";
        findHighestOccuredChar(s);

    }
    public static void findHighestOccuredChar(String s) {
        int maxCount = 0;
        char maxChar = ' ';
        Map<Character, Integer> hm = new HashMap<>();
        for (char ch : s.toCharArray()) {
            if (hm.containsKey(ch)) {
                hm.put(ch, hm.get(ch) + 1);
            } else {
                hm.put(ch, 1);
            }
        }
        for (Map.Entry<Character, Integer> e : hm.entrySet()) {
            if (e.getValue() > maxCount) {
                maxCount = e.getValue();
                maxChar = e.getKey();

            }
        }
        System.out.println(maxChar + " : " + maxCount + " : times occured");
//        return maxChar + " : char occurred : " + maxCount + " : times";

    }
}
