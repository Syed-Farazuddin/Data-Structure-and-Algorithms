package Recursion.basic;

public class Factorial {
    public static void main(String[] args) {
        Parameterized(5,1);
        System.out.println(Functinal(5));
    }
    private static void Parameterized(int n , int fact){
        if(n < 1)
        {
            System.out.println(fact);
            return;
        }
        Parameterized(n-1,fact*n);
    }
    private static int Functinal(int n){
        if(n <= 1) return 1;
        return Functinal(n-1) * n;
    }
}
