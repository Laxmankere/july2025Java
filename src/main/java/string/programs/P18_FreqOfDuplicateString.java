package string.programs;

import java.util.HashMap;
import java.util.Map;

public class P18_FreqOfDuplicateString {
    public static void main(String[] args) {
        String s = "java python java selenium playwright";
        freqOfEachString(s);
    }

    public static void freqOfEachString(String s) {

        String[] words = s.split(" ");
        Map<String, Integer> hm = new HashMap<>();
        for (String w : words) {
//            hm.put(w, hm.getOrDefault(w, 0) + 1);
            if (hm.containsKey(w)) {
                hm.put(w, hm.get(w) + 1);
            } else {
                hm.put(w, 1);
            }
        }
        for (Map.Entry<String, Integer> e : hm.entrySet()) {
            if (e.getValue() > 1) {
                System.out.println(e.getKey() + " : " + e.getValue());
            }
        }
    }
}
