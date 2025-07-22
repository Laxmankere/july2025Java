package string.programs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class P15_PrintEachCharWithHighestAndLowest {
    public static void main(String[] args) {
        String s = "laxman kere";

        int highestcount = 0;
        int lowestcount = Integer.MAX_VALUE; // Fix: initialize to max

        List<Character> highestChars = new ArrayList<>();
        List<Character> lowestChars = new ArrayList<>();

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

            // Check for highest count
            if (e.getValue() > highestcount) {
                highestcount = e.getValue();
                highestChars.clear(); // New highest found
                highestChars.add(e.getKey());
            } else if (e.getValue() == highestcount) {
                highestChars.add(e.getKey());
            }

            // Check for lowest count
            if (e.getValue() < lowestcount) {
                lowestcount = e.getValue();
                lowestChars.clear(); // New lowest found
                lowestChars.add(e.getKey());
            } else if (e.getValue() == lowestcount) {
                lowestChars.add(e.getKey());
            }
        }
        System.out.println("Highest occurring char(s): " + highestChars + " => " + highestcount);
        System.out.println("Lowest occurring char(s): " + lowestChars + " => " + lowestcount);
    }
}

