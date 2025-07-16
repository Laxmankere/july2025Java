package string.programs;

public class P26_CheckPrefix {
    public static void main(String[] args) {
        // in question asked return [1-indexed] not [0-indexed]
       /* Zero-based (starts from 0)
        One-based (starts from 1)
       */
        String sentence = "i love eating burger";
        String searchWord = "burg";
//        String searchWord = "you";  // negative test
        System.out.println(checkPrfix(sentence, searchWord));
    }

    public static int checkPrfix(String sentence, String searchWord) {
        String[] words = sentence.split(" ");
        for (int i = 0; i < words.length; i++) {
            if (words[i].startsWith(searchWord)) {
                return i + 1; // i + 1 -> return the position, not the index.
            }
        }
        return -1;
    }
}
