package string.programs;

public class P31_LengthOfLastWord {
    public static void main(String[] args) {
//        String str = " fly to the moon ";
        String str = "hellow world";
        System.out.println(lengthOflastWord(str));
    }

    public static int lengthOflastWord(String s) {
        String str = s.trim();
        int count = 0;
        for (int i = str.length() - 1; i >= 0; i--) {
            if (str.charAt(i) != ' ') {
                count++;
            } else {
                break;
            }
        }
        return count;
    }
}
