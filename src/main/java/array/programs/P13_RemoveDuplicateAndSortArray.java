package array.programs;

public class P13_RemoveDuplicateAndSortArray {
    public static void main(String[] args) {
        int ar[] = {0, 5,9, 9, 0, 0, 9, 3, 2, 1,6};

        // Step 1: Sort the array (Bubble sort)
        for (int i = 0; i < ar.length - 1; i++) {
            for (int j = i + 1; j < ar.length; j++) {
                if (ar[i] > ar[j]) {
                    // Swap
                    int temp = ar[i];
                    ar[i] = ar[j];
                    ar[j] = temp;
                }
            }
        }
        System.out.print("Sorted Unique Array: ");
        for (int i = 0; i < ar.length; i++) {
            // Print only if current element is not same as previous
            if (i == 0 || ar[i] != ar[i - 1]) { // i == 0: Always print the first element safely.
                System.out.print(ar[i] + " ");
            }
        }
    }
}
