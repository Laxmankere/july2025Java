package master.logical.programs;

import java.util.Scanner;

public class P17_FindLargestFrom3Num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("eneetr first num");
        int num1=sc.nextInt();

        System.out.println("eneetr first num");
        int num2=sc.nextInt();

        System.out.println("eneetr first num");
        int num3=sc.nextInt();
        largestNum(num1,num2,num3);
    }

    public static void largestNum(int num1,int num2, int num3){

        if(num1 >= num2 && num1>=num3){
            System.out.println(num1 + " is largest");
        }else if(num2>=num1 && num2 >=num3){
            System.out.println(num2 + " is largest");
        }else{
            System.out.println(num3 + " is largest");
        }
    }
}
