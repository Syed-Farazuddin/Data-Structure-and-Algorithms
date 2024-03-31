package SlidingWindow;

public class SubarraySumEqualtoK {
    public static void main(String[] args) {
        System.out.println(subarraySum(new int[] {1,2,3}, 2)-subarraySum(new int[] {1,2,3} , 2-1));
    }
    public static int subarraySum(int[] nums, int k) {
        int count = 0,left = 0, right = 0, sum = 0;
        while(right < nums.length){
            sum += nums[right];
            if(sum == k){
                count = right - left + 1;
            }
            while(sum > k){
                sum -= nums[left];
                left++;
            }
            right++;
        }
        return count;
    }
}
