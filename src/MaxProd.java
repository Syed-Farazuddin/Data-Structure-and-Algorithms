import java.util.Arrays;
import java.util.Scanner;

public class MaxProd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt(), num2 = sc.nextInt();
        char[] a = Integer.toString(num1).toCharArray(),b = Integer.toString(num2).toCharArray();
        int n = Math.min(a.length, b.length);
        int new1 = 0, new2 = 0;
        int base = 1;
        for(int i = 0 ; i < n ; i++){
            if(i % 2 != 0){
                new1 = a[i] + new1*base;
                new2 = b[i] + new2*base;
            }else{
                new1 = b[i] + new1*base;
                new2 = a[i] + new2*base;
            }
        }
        System.out.println(new1 + " " + new2);
    }
}
