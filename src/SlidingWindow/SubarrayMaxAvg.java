package SlidingWindow;

public class SubarrayMaxAvg {
    public static void main(String[] args) {
        int [] a = {-1};
        int k = 1;
        System.out.println(findMaxAverage(a,k));
    }
    public static double findMaxAverage(int[] arr, int k) {
        int  left = 0, right = 0, cLen = 0;
        double cSum = 0, mSum = Integer.MIN_VALUE;
        while(right < arr.length){
            cSum += arr[right];
            right++;
            cLen++;
            if(cLen == k){
                mSum = Math.max(mSum,cSum/k);
                cSum -= arr[left];
                left++;
                cLen--;
            }
        }
        return mSum;
    }
}
