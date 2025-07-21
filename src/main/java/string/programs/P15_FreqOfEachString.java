package string.programs;

import java.util.*;

/*
    In regex, the | character means “OR”, so split("|") will split on every character,
    because it thinks | is a regex operator, not a literal pipe.
    "\\|" escapes the pipe so Java treats it as a literal character, not regex.
 */
public class P15_FreqOfEachString {
    public static void main(String[] args) {
//        String s = "java python java selenium playwright";
        String s = "java|python|java|selenium|playwright";
        freqOfEachString(s);
    }

    public static void freqOfEachString(String s) {

//        String[] words = s.split(" ");
        String[] words = s.split("\\|");
        Map<String, Integer> hm = new HashMap<>();
        for (String w : words) {
            if (hm.containsKey(w)) {
                hm.put(w, hm.get(w) + 1);
            } else {
                hm.put(w, 1);
            }
        }
        for (Map.Entry<String, Integer> e : hm.entrySet()) {
            System.out.println(e.getKey() + " : " + e.getValue());
        }
    }
}
