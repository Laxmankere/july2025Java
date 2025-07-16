package string.programs;

import java.util.HashMap;
import java.util.Map;

public class P21_LongestSubString {
    // sliding window approach
    public static void main(String[] args) {
        String input = "abcabcbb";
//        String input = "laxman";
        System.out.println(lengthOfLongestSubString(input));

    }
    public static int lengthOfLongestSubString(String str){
         int start = 0;
         int maxLength = 0;
         Map<Character,Integer> hm =new HashMap<>();
         for(int end =0; end<str.length(); end++){
             char current = str.charAt(end);
             if(hm.containsKey(current)){
                start = Math.max(start,hm.get(current)+1);
             }else {
                 hm.put(current, end);
                 maxLength = Math.max(maxLength, end - start + 1);
             }
         }
         return maxLength;
    }
}
