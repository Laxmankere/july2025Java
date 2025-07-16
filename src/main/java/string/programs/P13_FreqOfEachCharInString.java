package string.programs;

import java.util.HashMap;
import java.util.Map;

public class P13_FreqOfEachCharInString {
    public static void main(String[] args) {
        String s = "java program";
        findFreqOfEachChar(s);
    }

    public static void findFreqOfEachChar(String s){
        Map<Character,Integer> hm = new HashMap<Character,Integer>();
        for(char ch : s.toCharArray()){
            if(ch == ' '){
                continue;
            }
            if(hm.containsKey(ch)){
                hm.put(ch,hm.get(ch)+1);
            }else{
                hm.put(ch,1);
            }
        }
        for(Map.Entry<Character,Integer> e: hm.entrySet()){
            System.out.println(e.getKey()+ " : " + e.getValue());
        }
    }

}
