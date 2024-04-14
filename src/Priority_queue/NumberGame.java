package Priority_queue;

import java.util.Arrays;
import java.util.PriorityQueue;

public class NumberGame {
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
}
