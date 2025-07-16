package string.programs;

import java.util.Scanner;

//Original : selenium with java
//Reverse : muineles htiw avaj

public class P03_ReverseEachStringOnSamePlace {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("please enter th String : ");
        String s = sc.nextLine();

//        String revString = revString(s);  // Approach1
        String revString = revString1(s);   // Approach2
        System.out.println("Original : " + s);
        System.out.println("Reverse : " + revString);

    }

    //Approach 1
    public static String revString(String s) {
        String rev = "";
        String word[] = s.split(" ");

        for (String w : word) {
            String rev1 = "";
            for (int i = w.length() - 1; i >= 0; i--) {
                rev1 = rev1 + w.charAt(i);
            }
            rev = rev + rev1 + " ";
        }
        return rev.trim();
    }

    //Approach 2
    public static String revString1(String s) {
        String[] words = s.split(" "); // Split by space
        StringBuilder result = new StringBuilder(); // Main StringBuilder

        for (String word : words) {
            StringBuilder sb = new StringBuilder(word); // Reverse each word
            result.append(sb.reverse().toString()).append(" "); // Append to result
        }
        return result.toString().trim(); // Trim to remove trailing space
    }

}
