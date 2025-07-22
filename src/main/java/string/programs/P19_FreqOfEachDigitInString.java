package string.programs;

import java.util.*;

public class P19_FreqOfEachDigitInString {
    public static void main(String[] args) {
        String s = "j12ava12 pr13ogr22m";
        findFreqOfEachDigit(s);
    }

    public static void findFreqOfEachDigit(String s) {
        Map<Character, Integer> hm = new HashMap<>();
        for (char ch : s.toCharArray()) {
            if (Character.isDigit(ch)) {
//                hm.put(ch, hm.getOrDefault(ch, 0) + 1);
                if (hm.containsKey(ch)) {
                    hm.put(ch, hm.get(ch) + 1);
                } else {
                    hm.put(ch, 1);
                }
            }
        }
        for (Map.Entry<Character, Integer> e : hm.entrySet()) {
            System.out.println(e.getKey() + " : " + e.getValue());
        }
    }
}

