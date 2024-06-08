import java.util.Arrays;
import java.util.Scanner;

public class Possible {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cases = sc.nextInt();
        for (int i = 0; i < cases; i++) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int [] a = new int[n];
            int maxVal = Integer.MIN_VALUE;
            for(int j = 0; j < n ; j++){
                int curr =  sc.nextInt();
                a[j] = curr;
                if(maxVal < curr){
                    maxVal = curr;
                }
            }
            System.out.println(Arrays.toString(a));
            for (int j = 0; j < n; j++) {
                if(a[j] != maxVal){
                    int curr = Math.abs(maxVal - a[i]);
                    int prev = Math.abs((a[j] + k*(maxVal/k)) - maxVal);
                    int next = Math.abs(a[j] + k*((maxVal/k ) + 1)) ;
                    if(curr < prev && curr < next){
                        continue;
                    }
                    if(prev < next){
                        a[j] += k*(maxVal/k);
                    }else{
                        a[j] += k*(maxVal/k + 1);
                    }
                }
            }
            System.out.println(Arrays.toString(a));
        }
    }
}
