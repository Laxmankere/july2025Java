package array.programs;

public class P10_MergeSortedArray {

    public static void main(String[] args) {
        int nums1[] = {1, 2, 3, 0, 0, 0};
        int nums2[] = {2, 5, 6};
        int m = 3;
        int n = 3;
        merge(nums1, nums2, m, n);
        for (int i = 0; i < m + n; i++) {
            System.out.print(nums1[i] + " ");
        }
    }

    public static void merge(int nums1[], int nums2[], int m, int n) {
        int i = m - 1; // pointer for nums1
        int j = n - 1; // pointer for nums2
        int k = m + n - 1; // pointer for merged position in nums1

        while (j >= 0) {
            if (i >= 0 && nums1[i] > nums2[j]) {
                nums1[k] = nums1[i];
                k--;
                i--;
            } else {
                nums1[k] = nums2[j];
                k--;
                j--;
            }
        }
    }

}
