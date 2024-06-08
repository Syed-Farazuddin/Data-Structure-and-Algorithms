package DynamicProgramming;

import java.util.Arrays;
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
//        int ans = recursionWay(n,0);
//        System.out.println(ans);
        int [] dp = new int[n+1];
        Arrays.fill(dp,-1);
        dp[0] = 0;
        dp[1] = 1;
        int ans = dpWay(n , dp,0);
        System.out.println(ans);
    }
    private static int recursionWay(int n,int count ){
        if(n == 0) return 0;
        if(n == 1) return 1;
        return recursionWay(n-1,count+1) + recursionWay(n-2,count+1);
    }
    private static int dpWay(int n , int[]dp,int count){
        if(dp[n] != -1) return dp[n];
        return dp[n] = dpWay(n-1,dp,count+1) + dpWay(n-2,dp,count+1);
    }
}
