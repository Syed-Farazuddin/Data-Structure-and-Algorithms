package Leetcode_Competitions;

public class HarshadNumber {
    public static void main(String[] args) {
        System.out.println(sumOfTheDigitsOfHarshadNumber(23));
    }
    public static int sumOfTheDigitsOfHarshadNumber(int x) {
        if(x == 0) return -1;
        int sum = 0;
        int num = x;
        while(x > 0){
            sum += x%10;
            x = x/10;
        }
        if(num % sum == 0){
            return sum;
        }
        return -1;
    }
}
