package string.programs;

import java.util.HashMap;
import java.util.Map;
//"laxman" → longest substring without repeat is "laxm" → length 4.
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
         for(int i =0; i<str.length(); i++){
             char current = str.charAt(i);
             if(hm.containsKey(current)){
                start = Math.max(start,hm.get(current)+1);
             }else {
                 hm.put(current, i);
                 maxLength = Math.max(maxLength, i - start + 1);
             }
         }
         return maxLength;
    }
}
