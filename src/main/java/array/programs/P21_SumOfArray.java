package array.programs;

public class P21_SumOfArray {
    public static void main(String[] args) {
        int ar[] = {1, 2, 3, 4, 5};

        System.out.println("Sum of Array : " + sumOfArray(ar));
    }
    public static int sumOfArray(int ar[]) {
        int sum = 0;
        for (int num : ar) {
            sum = sum + num;
        }
        return sum;
    }
}
