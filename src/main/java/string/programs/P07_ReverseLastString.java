package string.programs;

public class P07_ReverseLastString {
    public static void main(String[] args) {
        String sentence = "welcome to java";
//        String sentence = "";
//        String sentence = null;
        System.out.println("output : " + reverseLastString(sentence));
    }
    public static String reverseLastString(String str) {
        if (str == null || str.isEmpty()) {
            return str; // handle null or empty string
        }
        // Split the sentence into words
        String[] words = str.split(" ");
        int lastIndex = words.length - 1;

        // Reverse the last word
        String lastWord = words[lastIndex];
        String reversedLastWord = new StringBuilder(lastWord).reverse().toString();

        // Replace the last word with the reversed one
        words[lastIndex] = reversedLastWord;

        // Join words back into a sentence
        return String.join(" ", words);

    }
}
