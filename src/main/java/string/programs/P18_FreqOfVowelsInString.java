package string.programs;

import java.util.LinkedHashMap;
import java.util.Map;

public class P18_FreqOfVowelsInString {

    public static void main(String[] args) {
        String str = "welcomeeee";

        // Create a Map to store vowel frequencies
        Map<Character, Integer> hm = new LinkedHashMap<>();

        // Loop through each character
        for (char ch : str.toCharArray()) {
            if (isVowel(ch)) {
//                hm.put(ch, hm.getOrDefault(ch, 0) + 1);
                if (hm.containsKey(ch)) {
                    hm.put(ch, hm.get(ch) + 1);
                } else {
                    hm.put(ch, 1);
                }
            }
        }
        // Print all vowels with their frequencies
        for (Map.Entry<Character, Integer> entry : hm.entrySet()) {
            System.out.println(entry.getKey() + "-" + entry.getValue());
        }
    }

    // Helper method to check if Character is a vowel
    public static boolean isVowel(char ch) {
        return "aeiou".indexOf(ch) != -1;
    }
}

