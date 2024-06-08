package DynamicProgramming;

import java.util.Scanner;

public class ClimbingChairs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
//        int ans = r(n , 0);
//        int ans = r2(n);
        int [] dp = new int[n+1];
        for (int i = 0; i <= n; i++) {
            if(i <= 2){
                dp[i] = i;
            }else{
                dp[i] = -1;
            }
        }
//        int ans = memo(n,dp);
        int ans = tab(n , dp);
        System.out.println(ans);
    }
    private static int r(int n , int curr){
        if(curr > n) return 0;
        if(n == curr) return 1;
        int step1 = r(n , curr+1);
        int step = r(n , curr+2);
        return step + step1;
    }
    private static int r2(int n){
        if(n <= 2) return n;
        int a = r2(n-1);
        int b = r2(n-2);
        return a + b;
    }
    private static int memo(int n , int[] dp){
        if(dp[n] != -1) return dp[n];
        int a = memo(n-1,dp);
        int b = memo(n-2,dp);
        return dp[n] = a+b;
    }
    private static int tab(int n , int []dp){
        for (int i = 3; i < n; i++) {
            dp[i] = dp[i-1] + dp[i-2];
        }
        return dp[n-1];
    }
}
