package Arrays.problems;

import java.util.HashMap;

public class Leetcode_2958 {
    public static void main(String[] args) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int [] v= {1,2,3,1,2,3,1,2};
        int n = v.length;
        int k = 2;
        HashMap<Integer, Integer> m = new HashMap<>();
        int i = 0, j = 0, ans = 1;
        while (i < n && j < n) {
            m.put(v[j], m.getOrDefault(v[j], 0) + 1);
            while (m.get(v[j]) > k) {
                m.put(v[i], m.get(v[i]) - 1);
                i++;
            }
            ans = Math.max(ans, j - i + 1);
            j++;
        }
        System.out.println(ans);
        System.out.println(map);
    }

}
