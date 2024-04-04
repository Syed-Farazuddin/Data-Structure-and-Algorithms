package SlidingWindow;

public class ContainsDublicate3 {
    public static void main(String[] args) {
        int [] a = {1,2,3,1};
        System.out.println(containsNearbyAlmostDuplicate(a,3,0));;
    }
    public static boolean containsNearbyAlmostDuplicate(int[] nums, int indexDiff, int valueDiff) {
        if(nums.length <= 1) return false;
        int left = 0 , right = 1;
        while(right < nums.length && left < nums.length){
            while(left != right && indexDiff > Math.abs(right - left)){
                left++;
            }
            if(left < nums.length && right != left && Math.abs(nums[right]-nums[left]) <= valueDiff && Math.abs(right - left) < indexDiff){
                return true;
            }
            right++;
        }
        return false;
    }
}
