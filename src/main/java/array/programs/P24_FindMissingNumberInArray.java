package array.programs;

public class P24_FindMissingNumberInArray {
    public static void main(String[] args) {

        // Prerequisite
        /*  1.Array should not have duplicate
         * 2.Array no need to be sorted
         * 3.Value should be in range
         */

        int ar[] = { 6, 2, 3, 4, 1 };

        int expected = ar.length + 1;
        int total_sum = expected * (expected + 1) / 2;

        // System.out.println(a.length);
//		System.out.println(expected);
//		System.out.println(total_sum);

        int sum = 0;
        for (int i = 0; i < ar.length; i++) {
            sum = sum + ar[i];
        }
        System.out.println("missing no is:" + (total_sum - sum));
    }
}
