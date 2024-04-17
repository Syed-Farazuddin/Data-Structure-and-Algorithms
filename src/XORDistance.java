import java.util.Scanner;

public class XORDistance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cases = sc.nextInt();
        while(cases > 0){
            long a = sc.nextInt();
            long b = sc.nextInt();
            long r = sc.nextInt();
            long minXor = Integer.MAX_VALUE;
            int idx = 0;
            for(int i = 0; i <= r ; i++){
                long xor = Math.abs((a^i) - (b^i));
                if(xor < minXor){
                    minXor = Math.abs(xor);
                    idx = i;
                }
            }
            System.out.println(minXor + "   " + idx);
            cases--;
        }
    }
}
