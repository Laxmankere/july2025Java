package master.logical.programs;

import java.util.Scanner;

public class P14_CountEvenOddNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("please eneter the number");
        int num = sc.nextInt();
        countEvenOddNum(num);
    }

    public static void countEvenOddNum(int num) {
        int evenCount = 0;
        int oddCount = 0;

        while (num > 0) {
            int rem = num % 10;
            if (rem % 2 == 0) {
                evenCount++;
            } else {

                oddCount++;
            }
            num = num / 10;
        }
        System.out.println(" Total even count = " + evenCount);
        System.out.println(" Total odd count = " + oddCount);
    }
}
