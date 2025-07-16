package master.logical.programs;

import java.util.Scanner;

public class P07_ReverseNumUsingString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter the num ");
        int num = sc.nextInt();
        System.out.println(reverseNumUsingString(num));
    }
    public static int reverseNumUsingString(int num){
        String num1 = Integer.toString(num);
        String rev = "";
        for(int i = num1.length()-1;i>=0; i--){
            rev = rev + num1.charAt(i);
        }
        int rev1=Integer.parseInt(rev);
        return rev1;
    }
}
