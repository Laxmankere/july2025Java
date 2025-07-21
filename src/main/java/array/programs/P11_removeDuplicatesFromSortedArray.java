package array.programs;

public class P11_removeDuplicatesFromSortedArray {
    public static void main(String[] args) {
        // Q. Remove Duplicates from Sorted Array and return length of unique element.
//        int nums[]={1,1,2};
        int nums[]={0,0,1,1,1,2,2,3,3,4};
        int length = removeDuplicates(nums);
        System.out.println("Length after remove: " + length);

        System.out.println("Array after removing duplicates: ");
        for (int i = 0; i < length; i++) {
            System.out.print(nums[i] + " ");
        }
    }

    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;
        int count = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[count] = nums[i];
                count++;
            }
        }
        return count;
    }

}
