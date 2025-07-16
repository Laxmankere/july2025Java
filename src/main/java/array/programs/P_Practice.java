package array.programs;

import java.util.*;


public class P_Practice {
    public static void main(String[] args) {
//        note: dont use any collection (List,Set..)
        int num[] = {0, 9, 9, 0, 0, 9, 3, 2, 1};


        for (int i = 0; i < num.length - 1; i++) {
            for (int j = i + 1; j < num.length; j++) {
                if (num[i] > num[j]) {
                    int temp = num[i];
                    num[i] = num[j];
                    num[j] = temp;
                }
            }
        }
        System.out.print("Sorted Unique Array: ");
        for (int i = 0; i < num.length; i++) {
            if (i == 0 || num[i] != num[i - 1]) {
                System.out.print(num[i] + " ");
            }

        }
    }
}





