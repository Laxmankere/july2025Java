package array.programs;

public class P18_MinNumInArray {
    public static void main(String[] args) {
        int num[] = {10, 2, 13, 4, 5};
        
        System.out.println("Smallest element : "+maxNumInArray(num));
    }
    public static int maxNumInArray(int ar[]) {

        int min = ar[0];

        for (int i = 1; i < ar.length; i++) {
            if (ar[i] < min) {
                min = ar[i];
            }
        }
        return min;

    }
}
