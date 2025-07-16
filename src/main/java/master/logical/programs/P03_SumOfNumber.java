package master.logical.programs;

import java.util.Scanner;

public class P03_SumOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter the number");

        int num = sc.nextInt();
        System.out.println(sumOfNumber(num));
    }

    public static int sumOfNumber(int num) {
        int sum = 0;
        while (num > 0) {
            int rem = num % 10;
            sum = sum + rem;
            num = num / 10;
        }
        return sum;
    }
}
