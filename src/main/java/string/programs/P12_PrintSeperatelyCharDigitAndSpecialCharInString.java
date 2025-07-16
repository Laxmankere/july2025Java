package string.programs;

public class P12_PrintSeperatelyCharDigitAndSpecialCharInString {

    public static void main(String[] args) {
        String str = "q2bc34$$DFG";

// StringBuilder doesn’t create new String objects every time.
//  Much faster for big strings.

        StringBuilder digits = new StringBuilder();
        StringBuilder chars = new StringBuilder();
        StringBuilder specialChars = new StringBuilder();

        for (char ch : str.toCharArray()) {
            if (Character.isDigit(ch)) {
                digits.append(ch);
            } else if (Character.isLetter(ch)) {
                chars.append(ch);
            } else {
                specialChars.append(ch);
            }
        }
        System.out.println("digits : " + digits);
        System.out.println("chars : " + chars);
        System.out.println("specialChars : " + specialChars);
    }
}
