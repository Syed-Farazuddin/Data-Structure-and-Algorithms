package HashMaps.problems;

import java.util.HashMap;

public class RomantoInteger {
    public static void main(String[] args) {
        HashMap<Character,Integer> map = new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        String s ="MCMXCIV";
        int ans = 0;
        for(int i =0 ; i < s.length();i++){
            if (i < s.length() - 1 && map.get(s.charAt(i)) < map.get(s.charAt(i + 1))) {
                ans -= map.get(s.charAt(i));
            }else{
                ans += map.get(s.charAt(i));
            }
        }
        System.out.println(ans);
    }
}
