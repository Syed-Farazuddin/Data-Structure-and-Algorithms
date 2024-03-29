package HashMaps.problems;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MajorityElements {
    public static void main(String[] args) {
//        Leetcode 229
        List<Integer> list = new ArrayList<>();
        HashMap<Integer,Integer> map = new HashMap<>();
        int [] a = {3,2,1,2,3};
//        System.out.println(a.length/3);
        for(int i = 0 ; i < a.length ; i++){
            map.put(a[i],map.getOrDefault(a[i],0)+1);
        }

    }
}
