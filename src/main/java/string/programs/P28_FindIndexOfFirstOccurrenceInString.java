package string.programs;

public class P28_FindIndexOfFirstOccurrenceInString {
    public static void main(String[] args) {
//        int index = strStr("sadbutsad", "sad");
        int index = strStr("sadbutsad", "lucky"); // negative test

        System.out.println("first occurrence of char : " + index);

    }

    public static int strStr(String haystack, String needle) {
        int n = haystack.length();
        int m = needle.length();

        for (int i = 0; i <= n - m; i++) { // i goes from 0 to 6
            if (haystack.substring(i, i + m).equals(needle)) {
                return i;
            }
        }
        return -1;
    }
}
