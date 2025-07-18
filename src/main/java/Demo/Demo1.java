package Demo;

import java.net.Inet4Address;
import java.sql.PreparedStatement;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Demo1 {

    public static void main(String[] args) {
        int[] nums = {1, 1, 0, 1, 1, 1,};

        int result = findmaxConsecutive(nums);
        System.out.println(result);
    }

    public static int findmaxConsecutive(int num[]){
        int count = 0;
        int max = 0;

        for(int i =0; i<num.length; i++){
            if(num[i] == 1){
                count++;
                max = Math.max(max, count);
            }else{
                count =0;
            }
        }
        return max;
    }


}