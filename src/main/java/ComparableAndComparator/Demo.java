package ComparableAndComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Demo {
    public static void main(String[] args) {


        List<Integer> nums = new ArrayList<>();
        nums.add(4);
        nums.add(7);
        nums.add(3);
        nums.add(9);
        nums.add(1);
        nums.add(5);

        Collections.sort(nums);
        System.out.println(nums);

        System.out.println("-----------------------------------");

        // sort now on based on last digit, but below will sort on whole num basis
        List<Integer> nums1 = new ArrayList<>();
        nums1.add(43);
        nums1.add(72);
        nums1.add(35);
        nums1.add(91);

        Collections.sort(nums1);
        System.out.println(nums1);


    }
}


