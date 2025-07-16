package master.logical.programs;

public class P21_SwapTwoString {

    public static void main(String[] args) {
        // 1.Swap two string using temp/third variable
        String a="Java";
        String b="Python";

        String c ="";

        c=a;
        a=b;
        b=c
        ;

//		System.out.println("the value of a :"+ a);
//		System.out.println("the value of b :"+ b);


        // 1. Swap two string without using third variable

        String a1="UI";
        String b1="API";

        // append s3 and s4

        a1=a1+b1; // UI+API
        System.out.println("New a = "+ a1);
        System.out.println("a1 length = " + a1.length());
        System.out.println("b1 length = " + b1.length());

        // store initial  string a1 in string b1;
        // a1 = UIAPI   5-3 = 2
        b1=a1.substring(0,a1.length()-b1.length()); //

        System.out.println("new b1 = " +b1);
        System.out.println("new a1 = " +a1);

        // 3. store initial string b1 in string a1

        a1=a1.substring(b1.length());

//		System.out.println("------------------------ after swaping ");
//
        System.out.println("the value of a1 :"+a1);
        System.out.println("the value of b1 :"+b1);

    }
}
