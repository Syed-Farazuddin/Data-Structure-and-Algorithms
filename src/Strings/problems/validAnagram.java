package Strings.problems;

import java.util.HashMap;
import java.util.Set;

public class validAnagram {
    public static void main(String[] args) {
        System.out.println(isAnagram("anagram","nagaram"));
    }
    public static boolean isAnagram(String s, String t) {
        if(s.length() > t.length() || s.length() < t.length()) return false;
        HashMap<Character,Integer> map = new HashMap<>();
        HashMap<Character,Integer> map1 = new HashMap<>();
        for(int i = 0 ; i < s.length() ; i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
            map1.put(t.charAt(i),map1.getOrDefault(t.charAt(i),0)+1);
        }
        Set<Character> set = map.keySet();
        for(char key: set){
            if(!map.get(key).equals(map1.get(key))) return false;
        }
        return true;
    }
}
