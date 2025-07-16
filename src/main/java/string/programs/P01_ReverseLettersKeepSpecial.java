package string.programs;

public class P01_ReverseLettersKeepSpecial {

    public static void main(String[] args) {
        String input = "A#B%C";
        //   Output - C#B%A
        String reversed = revString(input);
        System.out.println("Original: " + input);
        System.out.println("Reversed: " + reversed);
    }

    public static String revString(String s) {
        char[] ch = s.toCharArray();
        int left = 0;
        int right = ch.length - 1;

        while (left < right) {
            if (!Character.isLetter(ch[left])) {
                left++;
            } else if (!Character.isLetter(ch[right])) {
                right--;
            } else {
                // Swap letters
                char temp = ch[left];
                ch[left] = ch[right];
                ch[right] = temp;
                left++;
                right--;
            }
        }
        return String.valueOf(ch); // Return after loop completes
    }
}