package string.programs;

public class P08_ReverseFirstString {
    public static void main(String[] args) {
        String sentence = "welcome to java";
//        String sentence = "";
//        String sentence = null;

        String rev = reverseFirstString(sentence);

        System.out.println("Original : " + sentence);
        System.out.println("Reverse : " + rev);
    }

    public static String reverseFirstString(String str) {
        if (str == null || str.isEmpty()) {
            return str; // handle null or empty string
        }

        // Split the sentence into words
        String[] words = str.split(" ");
        int firstIndex = 0;

        // Reverse the first word
        String firstWord = words[firstIndex];
        String reversedFirstWord = new StringBuilder(firstWord).reverse().toString();

        // Replace the first word with the reversed one
        words[firstIndex] = reversedFirstWord;

        // Join words back into a sentence
        return String.join(" ", words);
    }
}

