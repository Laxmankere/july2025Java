package array.programs;

public class P12_RemoveDuplicates_II {
    public static void main(String[] args) {
        // Q. Remove Duplicates from Sorted Array, after it each unique appears at most twice ,
        // relative order should be maintain

        int nums[] = {1, 1, 1, 2, 2, 2, 2, 3, 3, 3, 4};
//        int nums[] = {1,2};

        int length = removeDuplicates(nums);
        System.out.println("length : " + length);

        for (int i = 0; i < length; i++) {
            System.out.print(nums[i] + " ");
        }
    }

    public static int removeDuplicates(int[] nums) {
        // If array length is 2 or less, it's already valid
        if (nums.length <= 2) return nums.length;

        int index = 2;  // Start writing from the 3rd position

        for (int i = 2; i < nums.length; i++) {
            // Compare current element with the element TWO positions behind
            if (nums[i] != nums[index - 2]) {
                nums[index] = nums[i];  // Write it to the valid position
                index++;                // Move valid pointer ahead
            }
        }
        return index;
    }
}
