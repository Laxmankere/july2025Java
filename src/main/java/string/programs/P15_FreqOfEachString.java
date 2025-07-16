package string.programs;

import java.util.*;

public class P15_FreqOfEachString {
    public static void main(String[] args) {
        String s = "java python java selenium playwright";
        freqOfEachString(s);
    }
    public static void freqOfEachString(String s) {

        String[] words = s.split(" ");
        Map<String, Integer> hm = new HashMap<>();
        for (int i = 0; i < words.length; i++) {
            String s1 = words[i];
            hm.put(s1, hm.getOrDefault(s1, 0) + 1);
        }

        for (Map.Entry<String, Integer> e : hm.entrySet()) {
            System.out.println(e.getKey() + " : " + e.getValue());
        }
    }
}
