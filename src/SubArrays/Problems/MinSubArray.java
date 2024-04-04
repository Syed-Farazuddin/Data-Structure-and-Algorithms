package SubArrays.Problems;

public class MinSubArray {
    public static void main(String[] args) {
        int res =minSubArrayLen(11,new int[]{1,2,3,4,5});
        System.out.println(res);
        System.out.println(minSubArrayLenByBrute(11,new int[]{1,2,3,4,5}));
    }
    public static int minSubArrayLen(int target, int[] nums) {
        int left = 0, right = 0;
        int sum = 0,ans=Integer.MAX_VALUE;
        while(right < nums.length){
            sum += nums[right];
            while(sum > target){
                sum -= nums[left];
                left++;
            }
            if(sum == target){
                ans = Math.min(ans,right-left+1);
            }
            right++;
        }
        return ans;
    }
    public static int minSubArrayLenByBrute(int target, int[] nums) {
        int ans = Integer.MAX_VALUE;
        for(int i =0 ; i < nums.length ; i++){
            int sum = 0, currLen = 0;
            for (int j = i+1; j < nums.length; j++) {
                sum += nums[j];
                currLen++;
            }
            if(sum == target){
                ans = Math.min(ans,currLen);
            }
        }
        return ans;
    }
}
