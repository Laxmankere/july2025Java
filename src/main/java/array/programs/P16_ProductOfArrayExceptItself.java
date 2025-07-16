package array.programs;

import java.util.Arrays;

public class P16_ProductOfArrayExceptItself {
    public static void main(String[] args) {
        int num[]={1,2,3,4};   // o/p : [24, 12, 8, 6]
//        int num[]={-1,1,0,-3,3}; // o/p :  [0, 0, 9, 0, 0]
        System.out.printf(Arrays.toString(productOfArray(num)));

    }
    public static int[] productOfArray(int num[]){
        int n = num.length;
        int ans[]=new int[n];
        int prodL =1;
        int prodR =1;

        for(int i=n-1; i>=0;i--){
            ans[i]=prodR;
            prodR=prodR*num[i];
        }

        for(int i=0; i<n;i++){
            ans[i]=ans[i]*prodL;
            prodL=prodL*num[i];
        }
        return  ans;
    }
}
