package string.programs;

public class P24_CountNumberOfCharacters {
    public static void main(String[] args) {
        String s = "hello world";
        int count = 0;

        for(int i = 0 ; i<s.length(); i++){
            if(s.charAt(i) != ' '){
                count++;
            }
        }
        System.out.println("total char count : " + count);
    }
}
