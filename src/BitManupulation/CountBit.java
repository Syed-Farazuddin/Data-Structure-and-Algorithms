package BitManupulation;

import java.util.Arrays;

public class CountBit {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(countBits(2)));
    }
    public static int[] countBits(int n) {
        int [] res = new int[n+1];
        for(int i = 0; i <= n ; i++){
            int oneBits = 0 , curr = i;
            while(curr > 0){
                if((curr&1) == 1) oneBits++;
                curr = curr >> 1;
            }
            res[i] = oneBits;
        }
        return res;
    }
}
