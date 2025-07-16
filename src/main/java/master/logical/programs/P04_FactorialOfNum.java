package master.logical.programs;

import java.util.Scanner;

public class P04_FactorialOfNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter the num");
        int num = sc.nextInt();

        System.out.println("factorial of num = "+factorailOfNum(num));
    }

    public static int factorailOfNum(int num) {
        int fact = 1;

        for (int i = 1; i <= num; i++) {
            fact = fact * i;
        }
        return fact;
    }
}
