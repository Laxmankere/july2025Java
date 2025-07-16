package array.programs;

public class P23_NormalArrayDeclare {
    public static void main(String[] args) {

        int num[] = {1, 2, 3, 4, 5};
        System.out.println("num length = " + num.length);
        for (int i = 1; i <= num.length; i++) {
            System.out.println(i);
        }
        System.out.println("-----------------------------");

        String name[] = {"LK", "VK", "MB", "MB"};
        for (String name1 : name) {
            System.out.print(name1 + " ");
        }
        System.out.println();
        System.out.println("-----------------------------");


        double d[] = new double[2];
        d[0] = 10.5;
        d[1] = 11.5;
//		d[2]=12.5;
//		d[3]=13.5;
//		d[4]=13.5;
//		d[5]=14.5;

        System.out.println(d[0]);
        System.out.println(d[1]);
//		System.out.println(d[2]);

        System.out.println("---------------------------");
        char ch[] = new char[10];
        ch[5] = 'a';
        ch[9] = 'z';

        System.out.println("Ch value at 0 index = " + ch[0]);
        System.out.println(ch[9]);
        System.out.println("char length = " + ch.length);

    }

}
