package array.programs;

public class P19_KthLargestElementInArray {
    public static void main(String[] args) {
        int num[] = {3, 5, 7, 9, 11, 13, 15};
        int k =2;

        System.out.println(" 2th largest element = " + findKthLargestElement(num, k));
    }

    public static int findKthLargestElement(int ar[], int k) {

        for (int i = 0; i < ar.length; i++) {
            for (int j = i + 1; j < ar.length; j++) {
                if (ar[i] < ar[j]) {
                   int temp = ar[i];
                    ar[i] = ar[j];
                    ar[j] = temp;
                }
            }
        }
        return ar[k - 1];
    }
}






