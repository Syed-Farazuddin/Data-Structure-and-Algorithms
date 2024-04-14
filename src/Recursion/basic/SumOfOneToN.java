package Recursion.basic;

public class SumOfOneToN {
    public static void main(String[] args) {
        SumOfN(10 , 0);
    }

    private static void SumOfN(int i, int sum) {
        if(i < 1) {
            System.out.println(sum);
            return;
        }
        SumOfN(i-1,sum+i);
    }
}
