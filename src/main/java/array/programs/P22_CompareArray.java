package array.programs;

import java.util.Arrays;

public class P22_CompareArray {
    public static void main(String[] args) {

        int ar1[] = {10, 20, 30};
        int ar2[] = {40, 50, 60};
        int ar3[] = {40, 50, 60};
        int ar4[] = {40, 50, 90, 70, 60};

        // compare array1 & array2
        System.out.println(Arrays.equals(ar1, ar2));  // false
        System.out.println("-------------------------");
        // compare array2 & array3
        System.out.println(Arrays.equals(ar2, ar3));  // true
        System.out.println("-------------------------");

        // compare array1 & array3
        System.out.println(Arrays.equals(ar1, ar3));  //false
        System.out.println("-------------------------");

        Arrays.sort(ar4);
        for (int ar : ar4) {
            System.out.print(ar + " ");
        }
        System.out.println("-------------------------");
    }
}
