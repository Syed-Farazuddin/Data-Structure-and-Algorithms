package HashMaps.functions;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
//        How to use hashmap :
//        You have to upload java.util.HashMap package to use hashmap
//        Syntax for Hashmap. Hashmap must contain type of key and type of value
//        When to use Hashmap:
//        Use hashmap whenever you want to access key-pairs
        HashMap<Integer,Integer> map = new HashMap<>();
//        Hashmap functions

//        Add a element into hashmap :
//        to add an element into hashmap we use put function
//        put is a function which generally updates the value of the map if it already exists else it will create one

        map.put(1,40);

//        Print Hashmap
        System.out.println(map);

//      Access a element from hashmap
        int val = map.get(1);
        System.out.println(val);

//        Search  : It uses containsKey function which checks whether the key is present in map or not
        System.out.println(map.containsKey(1));

    }
}
