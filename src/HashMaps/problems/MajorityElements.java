package HashMaps.problems;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MajorityElements {
    public static void main(String[] args) {
//        Leetcode 229
        List<Integer> list = new ArrayList<>();
        HashMap<Integer,Integer> map = new HashMap<>();
        int [] a = {3,2};
//        System.out.println(a.length/3);
        for(int i = 0 ; i < a.length ; i++){
            map.put(a[i],map.getOrDefault(a[i],0)+1);
        }
        for(Map.Entry <Integer,Integer>e :map.entrySet()){
            if(e.getValue() > a.length/3){
                list.add(e.getKey());
            }
        }
        System.out.println(list);
    }
}
