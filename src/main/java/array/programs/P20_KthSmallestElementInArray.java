package array.programs;

public class P20_KthSmallestElementInArray {
    public static void main(String[] args) {
        int num[] = {3, 5, 7, 9, 11, 13, 15};
        int k = 2;


        System.out.println(k + " : th smallest element = " + findKthSmallestElement(num, k));
//        findKthLargestElement(num, k);
    }

    public static int findKthSmallestElement(int ar[], int k) {
//        public static void findKthLargestElement(int ar[], int k) {
        int temp;

        for (int i = 0; i < ar.length; i++) {
            for (int j = i + 1; j < ar.length; j++) {
                if (ar[i] > ar[j]) {
                    temp = ar[i];
                    ar[i] = ar[j];
                    ar[j] = temp;
                }
            }

        }
        return ar[k - 1];
        // Print kth largest
//        System.out.println(k + "th largest element = " + ar[k - 1]);

    }
}






