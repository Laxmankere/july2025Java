package master.logical.programs;

public class P19_BooleanTest {
    public static void main(String[] args) {
        /*
         * The Boolean(String) constructor treats any case variation of "true" as true.
         * "TRUE", "true", "tRuE", "TrUe", etc., all result in true. Any other string
         * (including "false", "FALSE", "FaLsE", or "randomText") results in false.
         */

        int result = 0;
// In Java 9 and later, the constructor new Boolean(String)  is deprecated
// It creates unnecessary Boolean objects.
//        Boolean b1 = new Boolean("TRUE");
//        Boolean b2 = new Boolean("true");
//        Boolean b3 = new Boolean("tRuE");
//        Boolean b4 = new Boolean("false");

        Boolean b1 = Boolean.valueOf("TRUE");
        Boolean b2 = Boolean.valueOf("true");
        Boolean b3 = Boolean.valueOf("tRuE");
        Boolean b4 = Boolean.valueOf("false");

        if (b1 == b2) // == compares object references, not values. false
            result = 1; // 0
        if (b1.equals(b2)) // equals() compares values.
            result = result + 10; // 10
        if (b2 == b4)  // == compares object references, not values. false
            result = result + 100; // Don’t add anything
        if (b2.equals(b4))
            result = result + 1000; // false
        if (b2.equals(b3)) // true

            result = result + 10000;  // 10 + 10000

        System.out.println("result = " + result); // result = 10010
    }
}
