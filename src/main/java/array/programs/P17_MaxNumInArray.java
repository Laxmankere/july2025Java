package array.programs;

public class P17_MaxNumInArray {
    public static void main(String[] args) {
        int num[] = {10, 2, 13, 4, 5};

        System.out.println(maxNumInArray(num));
    }
    public static int maxNumInArray(int ar[]) {

        int max = ar[0];

        for (int i = 1; i < ar.length; i++) {
            if (ar[i] > max) {
                max = ar[i];
            }
        }
        return max;

    }
}
