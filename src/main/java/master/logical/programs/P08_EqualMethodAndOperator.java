package master.logical.programs;

public class P08_EqualMethodAndOperator {
    public static void main(String[] args) {

        String a = "test";
        String b = "test";
        String c = new String("test");
        String d = new String("test");
        String e = "test";

        System.out.println(a == b); // true  --> it check reference point in same memory which is String pool
        System.out.println(b == e); // true --> Both a and e point to the same object in the String pool.
        System.out.println(a == c); // false
        System.out.println(b == c); // false
        System.out.println(c == d); // false
        System.out.println(a.equals(b)); // true --> it check content
        System.out.println(a.equals(c)); // true
        System.out.println(c.equals(d)); // true
    }
}
