package array.programs;

import java.util.HashMap;

public class P28_TwoSumIndices {

    public static void main(String[] args) {
        int ar[] = { 2, 7, 11, 15 };
        int target = 9;
        twoSum(ar, target);
        System.out.println("---------------------");
        twoSumHashMap(ar, target);

    }

    // Brute force method
    public static void twoSum(int ar[], int target) {
        for (int i = 0; i < ar.length; i++) {
            for (int j = i + 1; j < ar.length; j++) {
                if (ar[i] + ar[j] == target) {
                    System.out.println(i + " : " + j);
                }
            }
        }
    }

    public static void twoSumHashMap(int[] ar, int target) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < ar.length; i++) {
            int expectedPair = target - ar[i];

            if (hm.containsKey(expectedPair)) {
                System.out.println(hm.get(expectedPair) + " : " + i);
            }
            hm.put(ar[i], i);
        }
    }
}
