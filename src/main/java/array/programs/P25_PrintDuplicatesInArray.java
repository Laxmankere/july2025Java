package array.programs;

import java.util.HashMap;
import java.util.Map;

public class P25_PrintDuplicatesInArray {
    public static void main(String[] args) {
        int ar[] = {1, 2, 3, 4, 2, 3, 5};

        //Approach 1 : Brute force method
        //limitaion: if same number is occure more than 2 time it will print repeatedly
        for (int i = 0; i < ar.length; i++) {
            for (int j = i + 1; j < ar.length; j++) {
                if (ar[i] == ar[j]) {
                    System.out.print(ar[j] + " ");
                    break;// Avoids printing the same duplicate multiple times

                }
            }
        }
        System.out.println();
        System.out.println("---------------------------------------------------------------");

        // Approach 2 : HashTable by using HashMap
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int num : ar) {
            Integer count = hm.get(num);
            if (count == null) // If number is not present in the map
            {
                hm.put(num, 1);
            } else {
                hm.put(num, count + 1); // Increment count
            }
        }
        System.out.print("Duplicate elements are : ");
        for (Map.Entry<Integer, Integer> es : hm.entrySet()) {
            if (es.getValue() > 1) {
                System.out.print(es.getKey() + " ");
            }
        }
    }
}
