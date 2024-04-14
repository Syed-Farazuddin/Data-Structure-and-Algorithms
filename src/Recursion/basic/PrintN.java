package Recursion.basic;

public class PrintN {

    public static void main(String[] args) {
        print(1);
    }
    private static void print(int n){
        System.out.print(n + " ");
        if(n == 5) return;
        print(n+1);
    }
}
