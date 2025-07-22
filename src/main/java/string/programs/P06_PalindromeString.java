package string.programs;

import java.util.Scanner;

public class P06_PalindromeString {
    public static void main(String[] args) {
        // Ex: level, radar, rotor
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter String : ");
        String s = sc.next();

        String rev = revString(s);
        if(rev.equals(s)){
            System.out.println(s + " : is palindrome");
        }else{
            System.out.println(s+ " : is not palindrome");
        }

    }

    public static String revString(String s) {
        String rev = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            rev = rev + s.charAt(i);
        }
        return rev;

    }
}

