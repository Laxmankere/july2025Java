package master.logical.programs;

public class P12_SwapNumbers {
    public static void main(String[] args) {
        int a = 10, b = 20;
//        swapNum1(a, b);
//        swapNum3(a, b);
        int[] swapped = swapNum2(a, b);
        System.out.println("After swapping: a = " + swapped[0] + ", b = " + swapped[1]);
    }

    public static void swapNum1(int a, int b) {
        System.out.println("Before swapping: a = " + a + ", b = " + b);
        int temp = a;
        a = b;
        b = a;
        System.out.println("After swapping: a = " + a + ", b = " + b);
    }

    public static int[] swapNum2(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
        return new int[]{a, b};
    }

    public static void swapNum3(int a, int b) {
        System.out.println("Before swapping: a = " + a + ", b = " + b);
        a = a + b; //30
        b = a - b; //10
        a = a - b; //20
        System.out.println("After swapping: a = " + a + ", b = " + b);
    }

}
