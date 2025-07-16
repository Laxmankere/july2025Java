package master.logical.programs;

import java.util.Scanner;

public class P05_PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter the num");
        int num = sc.nextInt();
        System.out.println(checkPrimeNumber(num));
    }

    public static boolean checkPrimeNumber(int num) {
        int temp = 0;
        if (num <= 1) return false;
        for (int i = 2; i <= num - 1; i++)
            if (num % i == 0) {
                temp = temp + 1;
            }
        return temp == 0;
    }
}
