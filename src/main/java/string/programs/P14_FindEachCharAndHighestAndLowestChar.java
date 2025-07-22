package string.programs;

import java.util.HashMap;
import java.util.Map;
// find the occurrence of each char, and highest and lowest char
public class P14_FindEachCharAndHighestAndLowestChar {
    public static void main(String[] args) {

//        String s = "hi laxman how is your day today";
        String s = "laxman kere";

        char highestChar = ' ';
        int highestcount = 0;
        char lowestChar = ' ';
        int lowestcount = Integer.MAX_VALUE; // Fix: initialize to max

        Map<Character, Integer> hm = new HashMap<>();
        for (char ch : s.toCharArray()) {
            if (ch != ' ') {
                if (hm.containsKey(ch)) {
                    hm.put(ch, hm.get(ch) + 1);
                } else {
                    hm.put(ch, 1);
                }
            }
        }

        for (Map.Entry<Character, Integer> e : hm.entrySet()) {
            System.out.println(e.getKey() + " : " + e.getValue());
            if (e.getValue() >= highestcount) {
                highestChar = e.getKey();
                highestcount = e.getValue(); // Fix: update count
            }
            if (e.getValue() <= lowestcount) {
                lowestChar = e.getKey();
                lowestcount = e.getValue(); // Fix: update count
            }

        }
        System.out.println("Highest occuring char : " + highestChar + " => " + highestcount);

        System.out.println("Lowest occuring char : " + lowestChar + " => " + lowestcount);
    }
}
