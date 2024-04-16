package Recursion.Intermediate;

public class CountSubsequences {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5};
        System.out.println(CountSubsequence(arr,5,0,0));
    }
    private static int CountSubsequence(int [] arr , int k , int sum , int i){
        if(i == arr.length){
            if(sum == k){
                return 1;
            }else{
                return 0;
            }
        }
        int left = CountSubsequence(arr,k,sum+arr[i],i+1);
        int right = CountSubsequence(arr,k,sum-arr[i],i+1);
        return left+right;
    }
}
