package SlidingWindow;

public class SubarrayMaxSum {
    public static void main(String[] args) {
        int [] arr = {2,9,31,-4,21,7};
        int k = 3;
        System.out.println(maxSum(arr,k));;
    }

    private static int maxSum(int[] arr, int k) {
        int cSum = 0, left = 0, right = 0, mSum =Integer.MIN_VALUE, cLen = 0;
        while(right < arr.length){
            cSum += arr[right];
            right++;
            cLen++;
            if(cLen == k){
                mSum = Math.max(mSum,cSum);
                cSum -= arr[left];
                left++;
                cLen--;
            }
        }
        return mSum;
    }
}
