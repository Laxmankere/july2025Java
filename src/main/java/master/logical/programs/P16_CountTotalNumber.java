package master.logical.programs;

public class P16_CountTotalNumber {
    public static void main(String[] args) {
        int num = 12345;
        System.out.println(countTotalNum(num));
    }

    public static int countTotalNum(int num) {

        int count = 0;
        while (num > 0) {
            num = num / 10;
            count++;
        }
        return count;
    }
}
