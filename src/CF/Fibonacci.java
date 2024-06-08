package CF;
import java.util.*;

public class Fibonacci{
    public static void main(String [] args){
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        // System.out.println(fibo(n));
        int [] dp = new int[n];
        Arrays.fill(dp,0);
//        System.out.println(fibo(n , dp));
    }
    private static int fib(int n)
    {
        int [] f = new int[n + 2];
        f[0] = 0;
        f[1] = 1;
        for (int i = 2; i <= n; i++) {
            f[i] = f[i - 1] + f[i - 2];
        }
        return f[n];
    }
    private static int FibonacciUsingLoops(int n ){
        int first = 0, second = 1;
        if(n == 1) {
            return first;
        }
        if(n == 2){
            return second;
        }
        for(int i = 1; i < n ; i++){
            int sum = first + second;
            first = second;
            second = sum;
        }
        return second;
    }
//    private static int fibonacciRecursion(int n, int [] dp){
//        if(n == 1) return 0;
//        if (n == 2) return 1;
//        if(dp[n) != 0){
//            return dp[n];
//        }
//        return dp[n] = fibonacciRecursion(n-1) + fibonacciRecursion(n-2);
//    }
}