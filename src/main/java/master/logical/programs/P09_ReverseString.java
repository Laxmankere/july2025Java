package master.logical.programs;

import java.util.Scanner;

public class P09_ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the text");
        // sc.next()      -> only reads one word from the input
        // sc.nextLine() -> reads the entire line including spaces until you press Enter.

        String s = sc.nextLine();
//        System.out.println(reverseString1(s));
//        System.out.println(reverseString2(s));
//        System.out.println(reverseString3(s));
        System.out.println(reverseString4(s));
    }

    /**
     * This method use s.charAt(i);
     * @param s
     * @return it return reverse string
     */
    public static String reverseString1(String s) {
        String rev = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            rev = rev + s.charAt(i);
        }
        return rev;
    }

    /**
     * This method use s.toCharArray();
     * @param s
     * @return it return reverse string
     */
    public static String reverseString2(String s) {
        String rev = "";
        char ch[] = s.toCharArray();
        for (int i = ch.length - 1; i >= 0; i--) {
            rev = rev + ch[i];
        }
        return rev;
    }

    /**
     * This method use StringBuffer
     * @param s
     * @return it return reverse string
     */
    public static String reverseString3(String s) {
        StringBuffer sb = new StringBuffer(s);
        return sb.reverse().toString();
    }

    /**
     * This method use StringBuilder
     * @param s
     * @return it return reverse string
     */
    public static String reverseString4(String s) {
        StringBuilder sb = new StringBuilder(s);
        return sb.reverse().toString();
    }
}
