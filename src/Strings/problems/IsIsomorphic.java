package Strings.problems;

import java.util.HashMap;
import java.util.Set;

public class IsIsomorphic {
    public static void main(String[] args) {
        System.out.println(isIsomorphic("egg","add"));
    }
    public static boolean isIsomorphic(String s, String t) {
        HashMap<Character,Character> map = new HashMap<>();
        for(int i =0 ; i < s.length() ; i++){
            map.put(s.charAt(i),t.charAt(i));
        }
        Set<Character> set = map.keySet();
        String res = "";
        for(char key : set){
            res += map.get(key);
        }
        System.out.println(res);
        return false;
    }
}
