package SlidingWindow;

public class MaxPoints {
    public static void main(String[] args) {
        System.out.println(maxScore(new int[]{1,2,3,4,5,6,1},3));}
    public static int maxScore(int[] a, int k) {
        int sum = 0, maxSum = Integer.MIN_VALUE,r = k , l = 0;
        for(int i = 0; i < k ; i++){
            sum += a[i];
        }
        while(r < a.length ){
            maxSum = Math.max(sum,maxSum);
            sum -= a[l];
            l++;
            sum+= a[r];
            r++;
        }
        return maxSum;
    }
}
