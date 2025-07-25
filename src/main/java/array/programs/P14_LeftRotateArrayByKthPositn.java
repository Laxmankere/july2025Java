package array.programs;

public class P14_LeftRotateArrayByKthPositn {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;

        rotateLeft(nums, k);

        System.out.println("Array after left rotation: ");
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }

    public static void rotateLeft(int[] nums, int k) {
        int n = nums.length;
        k = k % n;  // Handle if k > n

        // Step 1: Reverse first k elements
        reverse(nums, 0, k - 1);

        // Step 2: Reverse remaining n-k elements
        reverse(nums, k, n - 1);

        // Step 3: Reverse entire array
        reverse(nums, 0, n - 1);
    }

    // Helper method to reverse elements from index start to end
    private static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}

