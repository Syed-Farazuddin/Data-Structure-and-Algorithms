package Recursion.basic;

public class SumOfOneToN {
    public static void main(String[] args) {
        Parameterized(10 , 0);
        System.out.println(functional(10));
    }

    private static void Parameterized(int i, int sum) {
        if(i < 1) {
            System.out.println(sum);
            return;
        }
        Parameterized(i-1,sum+i);
    }
    private static int functional(int i){
        if(i == 0) return 0;
        return i + functional(i-1);
    }
}
