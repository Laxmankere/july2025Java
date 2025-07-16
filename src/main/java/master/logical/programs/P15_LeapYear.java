package master.logical.programs;

import java.util.Scanner;

public class P15_LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter year");
        int year = sc.nextInt();

        if (isLeapYear(year)) {
            System.out.println(year + " is leap year");
        } else {
            System.out.println(year + " is not leap year");
        }
    }

    public static boolean isLeapYear(int year) {
        if (year <= 0) {
            throw new IllegalArgumentException("Year must be greater than 0");

        }
        return (year % 4 == 0 && year % 100 != 0 || year % 400 == 0);
    }
}
