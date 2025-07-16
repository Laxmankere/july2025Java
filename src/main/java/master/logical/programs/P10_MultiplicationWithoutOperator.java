package master.logical.programs;

import java.util.Scanner;

public class P10_MultiplicationWithoutOperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num 1");
        int a = sc.nextInt();

        System.out.println("Enter num 2");
        int b = sc.nextInt();
        System.out.println("Multiplication = " + multiplyWithoutOperator(a, b));

    }

    public static int multiplyWithoutOperator(int a, int b) {
        int result = 0;

        for (int i = 1; i <= a; i++) {
            result = result + b;
        }
        return result;
    }
}
