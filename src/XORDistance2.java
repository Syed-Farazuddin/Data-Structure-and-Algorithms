import java.util.*;

public class XORDistance2 {
    static long ll_MAX = Long.MAX_VALUE;
    static long ll_MIN = Long.MIN_VALUE;

    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int cases = sc.nextInt();
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        int r = sc.nextInt();
//        ArrayList<Integer> list = makeX(Math.min(a, b), Math.max(a, b));
//        System.out.println(list);
//        int ans = Integer.MAX_VALUE;
//        for (int curr : list) {
//            if (curr > r) {
//                continue;
//            }
//            ans = Math.min(Math.abs((a ^ curr) - (b ^ curr)), ans);
//        }
//        System.out.println(ans);
//        sammyMethod();
        makeX(9 , 6);
    }

    private static int CountBits(int x) {
        int c = 0;
        while(x > 0){
            if((x & 1) == 1) c++;
            x >>= 1;
        }
        return c;
    }

    private static int sammyMethod() {
        Scanner scanner = new Scanner(System.in);
        // Fast_IO
        int t = scanner.nextInt();
        for (int I = 0; I < t; I++) {
            ArrayList<Long> allX = new ArrayList<>();
            long a = scanner.nextLong();
            long b = scanner.nextLong();
            long r = scanner.nextLong();
            if (a == b) {
                System.out.println(0);
                continue;
            } else {
                if (a < b) {
                    long temp = a;
                    a = b;
                    b = temp;
                }
                long XOR_Difference = a - b;
                long x = 0;
                long[] b_a = new long[64];
                long[] b_b = new long[64];
                for (int i = 63; i >= 0; i--) {
                    b_a[i] = (a >> i) & 1;
                    b_b[i] = (b >> i) & 1;
                }
                boolean first_occurence = false;
                for (int i = 63; i >= 0; i--) {
                    if (b_a[i] == 1 && b_b[i] == 0) {
                        if (!first_occurence) {
                            first_occurence = true;
                        } else {
                            long dummy = 1;
                            x = dummy << i;
                            allX.add(x);
                            if (x <= r) {
                                r = r - x;
                                XOR_Difference = XOR_Difference - (2 * x);
                            }
                        }
                    }
                }
                System.out.println(allX);
                System.out.println(Math.abs(XOR_Difference));
            }
        }
        return 0;
    }
    private static ArrayList<Integer> makeX(int min, int max){
        int x = 0 , c = 0;
        ArrayList <Integer> list = new ArrayList<>();
        while(max > 0){
            if((max&1) == 1 && (min&1) == 0){
                x += (int)Math.pow(2,c);
                list.add(x);
                if(list.size()-2 >= 0 && !list.isEmpty()){
                    int prev = list.get(list.size()-2);
                    if(prev != x){
                        list.add(x - prev);
                    }
                }
            }
            c++;
            max >>= 1;
            min >>= 1;
        }
        return list;
    }
}
