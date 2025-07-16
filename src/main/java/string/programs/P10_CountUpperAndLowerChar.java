package string.programs;

public class P10_CountUpperAndLowerChar {
    public static void main(String[] args) {
        String s = "Laxman Dadarao Kere";
        countUpperLowerChar(s);
    }
    public static void countUpperLowerChar(String s) {
        int upper = 0;
        int lower = 0;

        for (char ch : s.toCharArray()) {
            if (ch >= 65 && ch <= 90) {
                upper++;
            } else if (ch >= 97 && ch <= 122) {
                lower++;
            }
        }
        System.out.println("total upper char count : " + upper);
        System.out.println("total lower char count : " + lower);
    }
}
