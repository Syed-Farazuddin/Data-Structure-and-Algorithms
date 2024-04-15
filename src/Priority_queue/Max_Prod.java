package Priority_queue;
import java.util.Collections;
import java.util.PriorityQueue;

public class Max_Prod {
    public static void main(String[] args) {
        System.out.println(maxProduct(new int[]{3,4,5,2}));
    }
    public static int maxProduct(int[] nums) {
        if(nums.length < 2)
            return nums[0];
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Collections.reverseOrder());
        for (int num : nums) {
            pq.add(num);
        }

        return (pq.poll()-1) *(pq.poll()-1);
    }
}
