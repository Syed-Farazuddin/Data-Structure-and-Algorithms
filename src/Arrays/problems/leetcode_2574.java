package Arrays.problems;

import java.util.Arrays;

public class leetcode_2574 {
    public static void main(String[] args) {
        leftRightDifference(new int [] {10,4,8,3});
    }
    public static int[] leftRightDifference(int[] nums) {
        int [] ans = new int[nums.length];
        int currPtr = 0;
        while(currPtr < nums.length){
            int leftSum = 0;
            int rightSum = 0;
            for(int i =currPtr+1; i < nums.length ; i++){
                leftSum += nums[i];
            }
            for(int i = currPtr-1; i >= 0 ; i--){
                rightSum += nums[i];
            }
            ans[currPtr] = Math.abs(leftSum-rightSum);
            currPtr++;
        }
        return ans;
    }
}
