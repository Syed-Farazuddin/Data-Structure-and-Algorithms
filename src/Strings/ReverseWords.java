package Strings;

public class ReverseWords {
    public static void main(String[] args) {
        reverseWords("a good   example");
    }
    public static String reverseWords(String s) {
        s = s.trim();
        StringBuilder br = new StringBuilder();
        String [] letter = s.split(" ");
        for(int i = letter.length-1 ; i >= 0; i--){
            br.append(letter[i]);
            br.append(" ");
        }
        return br.toString();
    }
}
