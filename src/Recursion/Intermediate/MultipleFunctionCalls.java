package Recursion.Intermediate;

public class MultipleFunctionCalls {
    public static void main(String[] args) {
        System.out.println("MULTIPLE FUNCTION CALLS");
        System.out.println(findFibo(2));;
    }

    private static int findFibo(int n) {
        if (n < 0) return 0;
        if(n <= 1) return n;
        return findFibo(n-1) + findFibo(n-2);
    }

}
