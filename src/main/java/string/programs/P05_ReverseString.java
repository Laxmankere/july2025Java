package string.programs;

public class P05_ReverseString {
    public static void main(String[] args) {

        // Q -> Reverse string
        // -> very easy program
        // 4 way we can reverse String
        // charAt(), toCharArray(), StringBuffer, StringBuilder

        String s = "laxman";
        String rev = "";

        for (int i = s.length() - 1; i >= 0; i--) {
            rev = rev + s.charAt(i);
        }
        System.out.println("Reverse String : " + rev);

//            ------------------------------------------------------

        // Approach : 2
        char chars[] = s.toCharArray();
        for (int i = chars.length - 1; i >= 0; i--) {
            System.out.print(chars[i] + " ");
        }

//            -------------------------------------------------------

//                    Approach 3 : StringBuffer

        StringBuffer sb = new StringBuffer(s);
        System.out.println(sb.reverse());

//            -------------------------------------------------------

//                    Approach 4 : StringBuilder

        StringBuilder sb1 = new StringBuilder(s);
        System.out.print(sb1.reverse());


    }

}

