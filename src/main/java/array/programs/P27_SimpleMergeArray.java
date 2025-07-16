package array.programs;

public class P27_SimpleMergeArray {
    public static void main(String[] args) {
        int arr1[] = {1, 3, 5};
        int arr2[] = {2, 4, 6};

        // Create a new array to hold merged elements
        int merged[] = new int[arr1.length + arr2.length];

        int i = 0; // pointer for arr1
        int j = 0; // pointer for arr2
        int k = 0; // pointer for merged array

        // Copy all elements of arr1 to merged array
        while (i < arr1.length) {
            merged[k] = arr1[i];
            i++;
            k++;
        }

        // Copy all elements of arr2 to merged array
        while (j < arr2.length) {
            merged[k] = arr2[j];
            j++;
            k++;
        }

        // Print the merged array
        System.out.print("Merged Array: ");
        for (int x : merged) {
            System.out.print(x + " ");
        }
    }
}

