package ComparableAndComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Demo1 {
    public static void main(String[] args) {

        // Comparator to sort numbers based on the last digit
        Comparator<Integer> com = new Comparator<Integer>() {
            @Override
            public int compare(Integer i, Integer j) {
                if (i % 10 > j % 10) {
                    return 1;
                } else {
                    return -1; // handle equal last digits
                }
            }
        };

        // Original list of numbers
        List<Integer> nums = new ArrayList<>();
        nums.add(43);
        nums.add(72);
        nums.add(35);
        nums.add(91);

        System.out.println("Original List: " + nums);

        // Sort numbers based on last digit
        Collections.sort(nums, com);

        System.out.println("Sorted by last digit: " + nums);
    }
}
