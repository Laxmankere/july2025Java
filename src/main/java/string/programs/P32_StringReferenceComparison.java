package string.programs;

public class P32_StringReferenceComparison {

    public static void main(String[] args) {
        String s1 = "naveen";
        String s2 = s1.replace('n', 'N');
        String s3 = "NaveeN";
        System.out.println(s2 == s3);   // false
        System.out.println(s2.equals(s3)); // true

    }
}
