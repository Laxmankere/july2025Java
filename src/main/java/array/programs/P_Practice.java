package array.programs;

import java.util.*;


public class P_Practice {
    // remove duplicate and sort
    public static void main(String[] args) {
        int num[] = {10, 2, 13, 4, 5};
        System.out.println(kLargest(num, 1));

    }

    public static int kLargest(int num[], int k) {

        for (int i = 0; i < num.length; i++) {
            for (int j = i + 1; j < num.length; j++) {
                if (num[i] > num[j]) {
                    int temp = num[i];
                    num[i] = num[j];
                    num[j] = temp;
                }
            }
        }
        return  num[k-1];
    }
}








