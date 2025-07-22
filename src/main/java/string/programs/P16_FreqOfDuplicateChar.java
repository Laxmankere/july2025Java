package string.programs;

import java.util.HashMap;
import java.util.Map;

public class P16_FreqOfDuplicateChar {
    public static void main(String[] args) {
        String s = "welcome to java";
        findDuplicateChar(s);
    }

    public static void findDuplicateChar(String s) {
        Map<Character, Integer> hm = new HashMap<Character, Integer>();
        for (char ch : s.toCharArray()) {
//            hm.put(ch, hm.getOrDefault(ch, 0) + 1);
            if (hm.containsKey(ch)) {
                hm.put(ch, hm.get(ch) + 1);
            } else {
                hm.put(ch, 1);
            }
        }
        for (Map.Entry<Character, Integer> e : hm.entrySet()) {
            if (e.getValue() > 1 && e.getKey() != ' ') {
                System.out.println(e.getKey() + " : " + e.getValue());
            }
        }

    }
}
