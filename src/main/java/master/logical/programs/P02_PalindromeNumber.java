package master.logical.programs;

import java.util.Scanner;

public class P02_PalindromeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter the num ");
        int num =sc.nextInt();

        if(checkPalindrome(num)){
            System.out.println(num + " : is palindrome number");
        }else{
            System.out.println(num + " : is not palindrome number");
        }

    }
    public static boolean checkPalindrome(int num){
        int rev = 0;
        int temp = num;

        for(int i = temp; i>0; i=i/10){
            int rem = i % 10;
            rev = rev * 10 + rem;
        }
        return rev == num;
    }
}
