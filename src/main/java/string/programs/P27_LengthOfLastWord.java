package string.programs;

public class P27_LengthOfLastWord {
    public static void main(String[] args) {
//        String str = " fly to the moon ";
        String str = "hellow world";
        System.out.println("Last word length = " + lengthOflastWord(str));
    }

    public static int lengthOflastWord(String s) {
        String str = s.trim();                // Remove leading/trailing spaces
        String[] words = str.split(" ");    // Split by space
        int lastIndex = words.length - 1;      // Get index of last word
        return words[lastIndex].length();     // Return length of last word

    }
}
