package string.programs;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class P09_LongestStringInSet {
    public static void main(String[] args) {

        // Step 1: Create the set of employee names
        Set<String> empName = new HashSet<>(Arrays.asList("Aman", "kuldeep", "Nilan", "Abhishek"));

        // Step 2: Initialize variables to track longest name
        String longestName = "";
        int maxLength = 0;

        // Step 3: Loop through each name in the set
        for (String name : empName) {
            if (name.length() > maxLength) {
                maxLength = name.length();
                longestName = name;
            }
        }
        // Step 4: Print result
        System.out.println("Employee with highest length name: " + longestName);
    }
}
