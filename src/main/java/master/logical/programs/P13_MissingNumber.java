package master.logical.programs;

public class P13_MissingNumber {
    public static void main(String[] args) {
        int ar[] = {2, 1, 3, 6, 4};
//        findMissingNum(ar);
        System.out.println("Missing Number : " + findMissingNum1(ar));
    }

    public static void findMissingNum(int num[]) {
        int sum = 0;
        int expected = num.length + 1;
        int maxSum = expected * (expected + 1) / 2;
        for (int i = 0; i < num.length; i++) {
            sum = sum + num[i];
        }
        System.out.println("missing number = " + (maxSum - sum));
    }

    // This function return
    public static int findMissingNum1(int num[]) {
        int sum = 0;
        int expected = num.length + 1;
        int maxSum = expected * (expected + 1) / 2;
        for (int i = 0; i < num.length; i++) {
            sum = sum + num[i];
        }
        return (maxSum - sum);
    }
}
