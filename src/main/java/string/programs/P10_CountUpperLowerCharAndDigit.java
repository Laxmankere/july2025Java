package string.programs;

public class P10_CountUpperLowerCharAndDigit {
    public static void main(String[] args) {
        String s = "Lax12man Dad34arao Ke1re";
        countUpperLowerCharAndDigit(s);
    }

    public static void countUpperLowerCharAndDigit(String s) {
        int upper = 0;
        int lower = 0;
        int digit = 0;

        for (char ch : s.toCharArray()) {
            if (ch >= 65 && ch <= 90) {
                upper++;
            } else if (ch >= 97 && ch <= 122) {
                lower++;
            } else if (Character.isDigit(ch)) {
                digit++;
            }
        }
        System.out.println("total upper char count : " + upper);
        System.out.println("total lower char count : " + lower);
        System.out.println("total count of digit  : " + digit);
    }
}
