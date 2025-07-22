package string.programs;

import java.util.Scanner;

//Original : the sky is blue
//Reverse : blue is sky the

public class P04_ReverseWordInString {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("please enter the String : ");
        String s = sc.nextLine();

        String reverseword = reverseWords(s);
        System.out.println("Original : " + s);
        System.out.println("Reverse : " + reverseword);

    }

    // Approach 1
    public static String reverseWords(String s) {
        String[] words = s.trim().split(" ");
        String result = "";

        for (int i = words.length - 1; i >= 0; i--) {
            {
                result = result + words[i] + " ";
            }
        }
        // Remove the last extra space
        return result.trim();
    }
}
