package SlidingWindow;
public class Leetcode_2962 {
    public static void main(String[] args) {
        int[] nums = {1,3,2,3,3};
        int k = 2;
        long maxNum = Long.MIN_VALUE, count = 0;
        int left = 0, right = 0, ans = 0;

        // Find the maximum element in the array
        for (int num : nums) {
            maxNum = Math.max(maxNum, num);
        }

        while (right < nums.length || left > right) {
            if (nums[right] == maxNum) {
                count++;
            }
            // If count is greater than or equal to k, calculate subarrays count
            while (count >= k) {
                if (nums[left] == maxNum) {
                    count--;
                }
                left++;
                ans += nums.length - right;
            }
            right++;
        }
        System.out.println(ans);
    }
}
