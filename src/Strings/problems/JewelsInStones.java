package Strings.problems;

import java.util.Arrays;
import java.util.HashMap;

public class JewelsInStones {
    public static void main(String[] args) {
        int ans = numJewelsInStones("z","ZZ");
        System.out.println(ans);
    }

    private static int numJewelsInStones(String jewels, String stones) {
        int ans = 0;
        String b = "Hello this is syed faraz";
        String [] arr = b.split(" ");
        System.out.println(Arrays.toString(arr));
        for(int i = 0; i < stones.length(); i++){
            String a = "" + stones.charAt(i);
            if(jewels.contains(a)){
                ans++;
            }
        }
        return ans;
    }

    public static int numJewelsInStonesUsingHashMap(String jewels, String stones) {
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i = 0 ; i < stones.length(); i++){
            map.put(stones.charAt(i),map.getOrDefault(stones.charAt(i),0)+1);
        }
        int ans = 0;
        for(int i = 0 ; i < jewels.length() ; i++){
            if(map.containsKey(jewels.charAt(i))){
                ans += map.get(jewels.charAt(i));
            }
        }
        return ans;
    }
}
