package string.programs;

import java.util.HashMap;
import java.util.Map;

public class P30_IsomorphicStrings {

        public static boolean isIsomorphic(String s, String t) {
            if (s.length() != t.length()) return false;

            Map<Character, Character> mapS = new HashMap<>();
            Map<Character, Character> mapT = new HashMap<>();

            for (int i = 0; i < s.length(); i++) {
                char chS = s.charAt(i);
                char chT = t.charAt(i);

                if (mapS.containsKey(chS)) {
                    if (mapS.get(chS) != chT) return false;
                } else {
                    mapS.put(chS, chT);
                }

                if (mapT.containsKey(chT)) {
                    if (mapT.get(chT) != chS) return false;
                } else {
                    mapT.put(chT, chS);
                }
            }
            return true;
        }

        public static void main(String[] args) {
            System.out.println(isIsomorphic("egg", "add"));    // true
//            System.out.println(isIsomorphic("foo", "bar"));    // false
//            System.out.println(isIsomorphic("paper", "title"));// true

        }
    }


