package string.programs;

import java.util.HashMap;
import java.util.Map;

// find the occurrence of each char, and highest and lowest char
public class P15_PrintFreqEachCharAndHighestAndLowestChar {
    public static void main(String[] args) {

        String s = "hi laxman how is your day today";

        char highestChar = ' ';
        int maxCount = 0;
        char lowestChar = ' ';
        int minCount = Integer.MAX_VALUE;

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

            if (e.getValue() > maxCount) {
                highestChar = e.getKey();
                maxCount = e.getValue(); // update count
            }
            if (e.getValue() < minCount) {
                lowestChar = e.getKey();
                minCount = e.getValue(); //  update count
            }

        }
        System.out.println("Highest occuring char : " + highestChar + " => " + maxCount);

        System.out.println("Lowest occuring char : " + lowestChar + " => " + minCount);
    }
}
