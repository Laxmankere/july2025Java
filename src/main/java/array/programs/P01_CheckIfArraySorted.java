package array.programs;

public class P01_CheckIfArraySorted {
    public static void main(String[] args) {
        int arr[] = {1, 3, 5, 7, 9, 11, 15};
        System.out.println(isSorted(arr));
    }

    public static boolean isSorted(int num[]) {
        for (int i = 1; i < num.length; i++) {
            if (num[i] < num[i - 1]) {
                return false;
            }
        }
        return true;
    }
}
