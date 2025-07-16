package array.programs;

import java.util.Arrays;

public class P04_moveZeroesToEnd {
    // Q. Move all zeros to the end of it while maintaining the relative order of non-zero element
    public static void main(String[] args) {
        int num[]= {0,1,0,3,12}	;

       int result[]=moveZeroes(num);
//        for (int n : num) {
//            System.out.print(n + " ");
//        }

        System.out.println(Arrays.toString(result));
    }

    public static int[] moveZeroes(int[] num){
        int index =0;
        for(int i =0; i<num.length; i++){
            if(num[i] !=0){
               num[index] = num[i];
               index++;
            }
        }
        while(index<num.length){
            num[index] =0;
            index++;
        }
        return num;
    }
}
