package HashMaps.functions;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Iteration {
    public static void main(String[] args) {
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(1,14);
        map.put(2,125);
        map.put(52,1413);
        for(Map.Entry<Integer,Integer> e : map.entrySet()){
            System.out.println(e.getKey() + " : " + e.getValue());
        }

//        Method 2 of iteration

        Set<Integer> set =map.keySet();
        for(int key : set){
            System.out.println(key + " : " + map.get(key));
        }
    }
}
