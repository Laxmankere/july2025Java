package array.programs;

import java.util.Scanner;

public class P08_AddDigits {
    public static void main(String[] args) {
        // Q. add all its digit until the result has only one digit and return its
        // We used divigibilty of 9 rule
    Scanner sc = new Scanner(System.in);
        System.out.println("please enter the number");
        int num = sc.nextInt();
//        int num = 25;
        System.out.println("Last digit is : "+ addDigit(num));
    }

    public static int addDigit(int num){
        if(num ==0){
            return 0;
        } else if (num % 9 == 0) {
            return 9;

        }else{
            return num % 9;
        }
    }
}
