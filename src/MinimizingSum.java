import java.util.Scanner;

public class MinimizingSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cases = sc.nextInt();
        for(int m = cases ; m > 0 ; m--){
            int n = sc.nextInt();
            int k = sc.nextInt();
            if(n == 1){
                System.out.println(sc.nextInt());
                continue;
            }
            if(n == 0){
                System.out.println(0);
                continue;
            }
            int [] values = new int[n];
            for(int i = 0; i < n ; i++){
                values[i] = sc.nextInt();
            }
            for (int i = 0; i < k; i++) {
                int maxDiffIdx = 0, maxDiff = 0;
                for (int j = 1; j < values.length; j++) {
                    int currDiff = Math.abs(values[j] - values[j-1]);
                    if(maxDiff < currDiff){
                        maxDiffIdx = j;
                        maxDiff = currDiff;
                    }
                }
                if(maxDiffIdx > 0 && values[maxDiffIdx] < values[maxDiffIdx-1]){
                    values[maxDiffIdx-1] = values[maxDiffIdx];
                }else if(maxDiffIdx > 0){
                    values[maxDiffIdx] = values[maxDiffIdx-1];
                }
            }
            int sum = 0;
            for(int z : values){
                sum += z;
            }
            System.out.println(sum);
            cases--;
        }
        sc.close();
    }
}
