package SubArrays.Problems;

import java.util.Arrays;

public class WindowMaxSubarray {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(maxSlidingWindow(new int[]{1,3,-1,-3,5,3,6,7},3)));
    }
    public static int[] maxSlidingWindow(int[] nums, int k) {
        int left = 0, right = k, n = nums.length, currMax = Integer.MIN_VALUE ;
        int [] result = new int[n-right+1];
        for(int i = 0 ; i < k ; i++){
            if(nums[i] > currMax) currMax = nums[i];
        }
        result[left] = currMax;
        while(right < n){
            if(nums[right] > currMax){
                currMax = nums[right];
            }
            right++;
            left++;
            result[left] = currMax;
        }return result;
    }
}
