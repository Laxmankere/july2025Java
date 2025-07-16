package array.programs;

import java.util.HashSet;
import java.util.Set;

public class P29_TwoSumPair {
    public static void main(String[] args) {
        int ar[] = {2, 7, 11, 15};
        int target = 9;
        twoSum(ar, target);
        System.out.println("---------------------------");
        twoSumByHashSet(ar, target);

    }

    // Brute force method
    public static void twoSum(int ar[], int target) {
        for (int i = 0; i < ar.length; i++) {
            for (int j = i + 1; j < ar.length; j++) {
                if (ar[i] + ar[j] == target) {
                    System.out.println(ar[i] + " : " + ar[j]);
                }
            }
        }
    }

    // Optimized method using HashSet
    public static void twoSumByHashSet(int ar[], int target) {
        Set<Integer> hs = new HashSet<Integer>();
        for (int num : ar) {
            int expectedPair = target - num;
            if (hs.contains(expectedPair)) { // Check if the complement exists
                System.out.println(expectedPair + " : " + num);
                return;
            }
            hs.add(num); // Add current number to HashSet
        }
    }
}
