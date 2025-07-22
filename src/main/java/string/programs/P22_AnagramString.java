package string.programs;

import java.util.Arrays;

// Two strings are called anagrams if:
//1.They contain exactly the same characters.
//2.With exactly the same frequency.
// Ex : "race" and "care" , "listen" and "silent"
public class P22_AnagramString {
    public static void main(String[] args) {

        System.out.println(isAnagram("r am", "Arm"));
    }

    public static boolean isAnagram(String s1, String s2) {

        String str1 = s1.replaceAll("\\s", "");
        String str2 = s2.replaceAll("\\s", "");

        if (str1.length() != str2.length()) {
            return false;
        } else {
            char c1[] = str1.toLowerCase().toCharArray();
            char c2[] = str2.toLowerCase().toCharArray();

            Arrays.sort(c1);
            Arrays.sort(c2);

            return Arrays.equals(c1, c2);
        }
    }

}
