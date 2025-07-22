package string.programs;

import java.util.Scanner;

//Original : selenium with java
//Reverse : muineles htiw avaj

public class P03_ReverseEachStringOnSamePlace {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("please enter th String : ");
        String s = sc.nextLine();

        String revString = revString(s);
        System.out.println("Original : " + s);
        System.out.println("Reverse : " + revString);

    }

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
}
