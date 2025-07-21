package string.programs;

public class P12_PrintCharDigitAndSpecialCharInString {

    public static void main(String[] args) {
        String str = "q2bc34$$DFG";

        printDigitSpecChar(str);

    }

    public static void printDigitSpecChar(String str) {
        String digits = "";
        String chars = "";
        String specialChars = "";

        for (char ch : str.toCharArray()) {
            if (Character.isDigit(ch)) {
                digits += ch;
            } else if (Character.isLetter(ch)) {
                chars += ch;
            } else {
                specialChars += ch;
            }
        }
        System.out.println("digitList = " + digits);
        System.out.println("charList = " + chars);
        System.out.println("specialList = " + specialChars);
    }
}
