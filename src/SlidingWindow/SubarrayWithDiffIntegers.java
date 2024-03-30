package SlidingWindow;

import java.util.HashMap;

public class SubarrayWithDiffIntegers {
    public static void main(String[] args) {
        int [] a = {1,2,1,2,3};
        HashMap<Integer,Integer> map = new HashMap<>();
        int left = 0, right = 0, k = 2,ans=0;
        while(right < a.length){
            map.put(a[right],map.getOrDefault(a[right],0)+1);
            while(map.size()>=3){
                if(map.get(a[left]) == 1){
                    map.remove(a[left]);
                }else{
                    map.put(a[left],map.getOrDefault(a[right],0)-1);
                }
                if(map.size() != 2){
                    left++;
                }
            }
            if(map.size() == 2){
                ans +=right - left ;
                System.out.println(map);

            }
            right++;
        }
        System.out.println(ans);
    }
}
