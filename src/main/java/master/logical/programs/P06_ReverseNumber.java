package master.logical.programs;

import java.util.Scanner;

public class P06_ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter the num");
        int num = sc.nextInt();
        System.out.println(reverseNumber(num));
    }

    public static int reverseNumber(int num){
        int temp = num;
        int rev = 0;
        while(temp != 0){
            int rem = temp % 10;
            rev = rev * 10 + rem;
            temp = temp / 10;
        }
        return rev;
    }
}
