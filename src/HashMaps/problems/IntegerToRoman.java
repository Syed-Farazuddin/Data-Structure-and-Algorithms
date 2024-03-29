package HashMaps.problems;

import java.util.HashMap;
import java.util.Set;

public class IntegerToRoman {
    public static void main(String[] args) {
        HashMap<Character,Integer> map = new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        Set<Character> keys = map.keySet();
        int number = 54;
        while(number <= 0){
            int diff = Integer.MAX_VALUE;
            for(char key : keys){
                int currVal = map.get(key);
                if(currVal <= number){
                    diff = Math.min(diff,number-currVal);
                }
                number -= diff;
            }
            System.out.println(diff);
        }
    }
}
