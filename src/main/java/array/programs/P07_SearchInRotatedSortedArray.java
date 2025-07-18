package array.programs;

public class P07_SearchInRotatedSortedArray {
    public static void main(String[] args) {
        // Find the index of element in rotated sorted Array
        int num[] = {4, 5, 6, 7, 0, 1, 2};
//        int num[] = {1, 3, 5, 7, 9, 11, 13,15,17};
        int target = 0;

        int result = binarySearchInRotatedArray(num, target);
        if (result != -1) {
            System.out.println("Element found at index : " + result);
        } else {
            System.out.println("Element not found");
        }
//        System.out.println(binarySearchInRotatedArray(num,target));
    }

    public static int binarySearchInRotatedArray(int[] num, int target) {
        int start = 0;
        int end = num.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;

            if (num[mid] == target) return mid;

            // Left half is sorted
            if (num[start] <= num[mid]) {
                if (target >= num[start] && target < num[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
            // Right half is sorted
            else {
                if (target > num[mid] && target <= num[end]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }

        return -1;
    }
}