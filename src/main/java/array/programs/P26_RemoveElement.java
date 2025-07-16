package array.programs;

public class P26_RemoveElement {
    public static void main(String[] args) {
        int num[] = {3, 2, 1, 3};
        int value = 3;

        int len = removeElement(num, value);

        for (int i = 0; i < len; i++) {
            System.out.print(num[i] + " ");
        }
        System.out.println("\nLength after removal: " + len);
    }

    public static int removeElement(int num[], int value) {
        int count = 0;
        for (int i = 0; i < num.length; i++) {
            if (num[i] != value) {
                num[count] = num[i];
                count++;
            }
        }
        return count;
    }
}
