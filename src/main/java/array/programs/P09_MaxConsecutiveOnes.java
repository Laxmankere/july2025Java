package array.programs;

public class P09_MaxConsecutiveOnes {

    public static void main(String[] args) {
        // Consecutive" means back-to-back / continuous / in a row without interruption.

        int[] nums = {1, 1, 0, 1, 1, 1,};
        int result = findMaxConsecutiveOnes(nums);
        System.out.println("Max Consecutive is : " + result); // Output: 3
    }

    public static int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int max = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                count++; // increase count if 1
                max = Math.max(max, count); // update max if needed
            } else {
                count = 0; // reset count when 0 appears
            }
        }
        return max;
    }
}

