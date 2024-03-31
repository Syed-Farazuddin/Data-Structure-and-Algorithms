package SlidingWindow;

import java.util.HashMap;

public class CountAlternativeSubarrays {
    public static void main(String[] args) {
        System.out.println(countAlternatingSubarrays(new int[] {1,0,1,0}));
    }
    public static long countAlternatingSubarrays(int[] nums) {
        long ans = 0;
        for(int l = 0, r = 0; r< nums.length-1 ; ++r){
            if(nums[r] == nums[r+1]){
                l = l + 1;
            }
            ans += r - l + 1;
        }
        return ans;
    }
}
