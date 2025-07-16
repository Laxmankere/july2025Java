package array.programs;

public class P30_BinarySearch {
    // Find the index position of given element
    // Time complexity = O(log n)
    // starting piont = left
    // ending point = right
    // mid = (right + left)/2

    public static void main(String[] args) {
        int nums[] = {5, 7, 9, 11, 13};
        int target = 13;
        int result = binarySearch(nums, target);

        if (result != -1)
            System.out.println("Element found at Index : " + result);
        else
            System.out.println("Element not found");
    }

    public static int binarySearch(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }
}
