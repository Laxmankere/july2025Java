package master.logical.programs;

import java.util.Scanner;

public class P01_PalindromeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter th number");
        int num = sc.nextInt();

        if (checkPalindrome(num)) {
            System.out.println(num + " : is palindrome");
        } else {
            System.out.println(num + " : is not palindrome");
        }
    }

    public static boolean checkPalindrome(int num) {
        int temp = num;
        int rev = 0;
// (temp > 0)  (temp != 0) both are same
        while (temp > 0) {
            int rem = temp % 10;
            rev = rev * 10 + rem;
            temp = temp / 10;
        }
        System.out.println("rev num : " + rev);

        return rev == num;
    }

}
