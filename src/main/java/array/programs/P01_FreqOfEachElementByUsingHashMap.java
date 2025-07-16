package array.programs;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class P01_FreqOfEachElementByUsingHashMap {
    public static void main(String[] args){
        int arr[]= {1,4,5,9,7,7,1,4,4,7,7};

        Map<Integer,Integer> hm = new HashMap<>();
        for(int num: arr){
//            hm.put(num, hm.getOrDefault(num,0)+1);
            if(hm.containsKey(num)){
                hm.put(num,hm.get(num)+1);
            }else{
                hm.put(num,1);
            }
        }
//        System.out.println(hm);

//        Set<Integer> key = hm.keySet();
//        for(int k : key){
//            System.out.println(k + " : " + hm.get(k) + " times");
//        }
        for(Map.Entry e : hm.entrySet()){
            System.out.println(e.getKey()+ " found " + e.getValue()+ " : times");
        }
    }
}
