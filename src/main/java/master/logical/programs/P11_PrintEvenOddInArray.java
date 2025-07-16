package master.logical.programs;

public class P11_PrintEvenOddInArray {
    public static void main(String[] args) {

        int num[] = {1, 2, 3, 4, 5, 6, 7, 8};

        // Even
        for (int i = 0; i < num.length; i++) {
            if (num[i] % 2 == 0) {
                System.out.print(num[i] + " ");
            }
        }
        System.out.println();
        // Odd
        for (int i = 0; i < num.length; i++) {
            if (num[i] % 2 != 0) {
                System.out.print(num[i] + " ");
            }
        }
    }
}
