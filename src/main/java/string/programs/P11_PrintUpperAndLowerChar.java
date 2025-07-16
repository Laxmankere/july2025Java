package string.programs;

public class P11_PrintUpperAndLowerChar {
    public static void main(String[] args) {
        String s = "Laxman Dadarao Kere";
        countUpperLowerChar(s);
    }
    public static void countUpperLowerChar(String s) {
        String upper = "";
        String lower = "";

        for (char ch : s.toCharArray()) {
            if (ch >= 65 && ch <= 90) {
                upper+=ch;
            } else if (ch >= 97 && ch <= 122) {
                lower+=ch;
            }
        }
        System.out.println("total upper char count : " + upper);
        System.out.println("total lower char count : " + lower);
    }
}
