package master.logical.programs;

public class P18_FibonacciSeries {
    public static void main(String[] args) {
        int num = 10;
        fibonacci(num);
    }
    public static void fibonacci(int num) {
        int n1 = 0, n2 = 1;
        System.out.print(n1 + " " + n2); // print first two numbers
        for (int i = 2; i < num; i++) {
            int sum = n1 + n2;
            System.out.print(" " + sum); // print next number
            n1 = n2;
            n2 = sum;
        }

    }
}
