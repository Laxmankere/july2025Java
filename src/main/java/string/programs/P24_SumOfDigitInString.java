package string.programs;

public class P24_SumOfDigitInString {
    public static void main(String[] args) {
        String s = "my 3 name 1 is 2 laxman 4";
        System.out.println("Total sum of digit = " + sumOfDigit(s));
    }

    public static int sumOfDigit(String s) {
        int sum = 0;

        for (char ch : s.toCharArray()) {
            if (Character.isDigit(ch)) {
                sum += Character.getNumericValue(ch);
            }
        }
        return sum;
    }
}
