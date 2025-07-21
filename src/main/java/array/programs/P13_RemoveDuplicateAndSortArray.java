package array.programs;

public class P13_RemoveDuplicateAndSortArray {
    public static void main(String[] args) {
        int ar[] = {0, 5, 9, 9, 0, 0, 9, 3, 2, 1, 6};

        removeDuplicateAndSort(ar);
    }

    public static void removeDuplicateAndSort(int num[]) {
        // Step 1: Sort the array (Bubble sort)
        for (int i = 0; i < num.length - 1; i++) {
            for (int j = i + 1; j < num.length; j++) {
                if (num[i] > num[j]) {
                    // Swap
                    int temp = num[i];
                    num[i] = num[j];
                    num[j] = temp;
                }
            }
        }
        System.out.print("Sorted Unique Array: ");
        for (int i = 0; i < num.length; i++) {
            // Print only if current element is not same as previous
            if (i == 0 || num[i] != num[i - 1]) { // i == 0: Always print the first element safely.
                System.out.print(num[i] + " ");
            }
        }
    }
}
