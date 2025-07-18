package array.programs;

public class P30_MaxSumSubArray {
    public static void main(String[] args) {
        // Q. find the subArray with largest sum and return it sum
        // Kadane’s Algorithm:
        // If your current subarray is dragging you down (sum < 0), it’s better to drop it and start fresh.

        int num[] = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(maxSumArray(num));
    }

    public static int maxSumArray(int num[]) {
        int sum = 0;
        int max_sum = num[0];
        for (int i = 0; i < num.length; i++) {
            sum = sum + num[i];
            if (sum > max_sum) {
                max_sum = sum;
            }
            // This line resets the running sum to 0 whenever it becomes negative.
            if (sum < 0) {
                sum = 0;
            }
        }
        return max_sum;
    }
}
