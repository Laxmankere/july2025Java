package string.programs;

import java.util.*;

//Original : welcome to java
//Reverse : welcome to avaj

public class Practice {
    public static void main(String[] args) {
        String s = "java python java selenium python playwright";

        String word[] = s.split(" ");
        Map<String, Integer> hm = new HashMap<>();
        for (String w : word) {
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

