package string.programs;

import java.util.Scanner;

//Original : hellow
//Reverse : hollew
public class P02_ReverseVowelsKeepOther {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter the String : ");
        String s = sc.nextLine();

        String revString = reverseVowels(s);

        System.out.println("Original : " + s);
        System.out.println("Reverse : " + revString);
    }

    public static String reverseVowels(String s) {
        int n = s.length();
        char[] ch = s.toCharArray();
        int start = 0;
        int end = s.length() - 1;

        while (start < end) {
            if (!isVowel(ch[start])) {
                start++;
            } else if (!isVowel(ch[end])) {
                end--;
            } else {
                char temp = ch[start];
                ch[start] = ch[end];
                ch[end] = temp;
                start++;
                end--;
            }
        }
        return String.valueOf(ch);
    }

    public static boolean isVowel(char ch) {
        return "aeiouAEIOU".indexOf(ch) != -1;
    }

//    public static boolean isVowel(char ch) {
//        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
//            return true;
//        } else {
//            return false;
//        }
//    }
}
