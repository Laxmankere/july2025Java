package string.programs;

public class P25_RepeatCharactersNTimes {
    public static void main(String[] args) {
        String s = "ABC";
        int n = 2;
        System.out.println(repeatCharacters(s, n));
    }

    public static String repeatCharacters(String str, int n) {
        if (str == null || str.isEmpty()) {
            return str; // handle null, empty string
        }

        StringBuilder sb = new StringBuilder();

        for (char ch : str.toCharArray()) {
            for (int i = 0; i < n; i++) { // repeat each character n times
                sb.append(ch);
            }
        }

        return sb.toString();
    }
}
