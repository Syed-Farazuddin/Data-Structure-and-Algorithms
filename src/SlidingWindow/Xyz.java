package SlidingWindow;

import java.util.*;
public class Xyz{
    public static void main(String[] args) {
//        System.out.println(printMaxDis(new int[]{4,8,2,8}));
        System.out.println(Arrays.toString(numberGame(new int []{5,4,2})));
    }
    public static int[] numberGame(int[] nums) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int num : nums) {
            pq.add(num);
        }
        int [] res = new int[pq.size()];
        int i = 0;
        while(!pq.isEmpty()){
            if(i+1 < nums.length){
                res[i+1] = pq.poll();
            }else {
                res[i] = pq.poll();
            }
            if(!pq.isEmpty()){
                res[i] = pq.poll();
            }
            i = i+2;
        }
        return res;
    }
    private static int printMaxDis(int[] nums) {
        int maxIndex = 0 , minIndex = nums.length;
        for(int i = 0; i < nums.length; i++){
            int count = 0;
            for(int j = 1 ; j < nums[i] ; j++){
                if(nums[i] % j == 0){
                    count++;
                }
            }
            if(count == 1){
                maxIndex = Math.max(maxIndex,i);
                minIndex = Math.min(minIndex,i);
            }
        }
        return maxIndex - minIndex;
    }
}