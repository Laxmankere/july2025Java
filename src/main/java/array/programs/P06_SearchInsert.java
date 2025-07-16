package array.programs;

public class P06_SearchInsert {
    public static void main(String[] args) {
        // Q. Find The index if the target exists Or the index where it would be inserted to maintain order
        int num[] = {1, 3, 5, 7};
        int target = 8;
        System.out.println(searchInsert(num, target));
    }

    public static int searchInsert(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;

            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return start;
    }

}
