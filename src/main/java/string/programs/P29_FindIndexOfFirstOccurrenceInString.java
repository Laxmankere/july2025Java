package string.programs;

public class P29_FindIndexOfFirstOccurrenceInString {
    public static void main(String[] args) {
        String haystack = "sadbutsad";
        String needle = "sad";

        int index = strStr(haystack, needle);
        System.out.println("Index of first occurrence: " + index);
    }

    public static int strStr(String haystack, String needle) {
        return haystack.indexOf(needle);
    }

}
