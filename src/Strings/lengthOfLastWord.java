package Strings;

public class lengthOfLastWord {
    public static void main(String[] args) {
        String s = "luffy is still joyboy";
        s = s.trim();
        int len = 0;
        for(int i = s.length()-1; i>= 0 ; i--){
            if(s.charAt(i) == ' ') break;
            len++;
        }
        System.out.println(len);
    }
}
