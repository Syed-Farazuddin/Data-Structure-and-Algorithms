
import java.util.Scanner;

public class softDrink {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt() , b = sc.nextInt() , c = sc.nextInt();
//        int toReachA = Math.abs(b-a) + Math.abs(c-a), toReactB = Math.abs(b-a) + Math.abs(c-b), toReactC = Math.abs(c-a) + Math.abs(c-b);
//        System.out.println(Math.min(Math.min(toReachA,toReactB),toReactC));
//        System.out.println(Integer.toBinaryString(5000));
        int cases = sc.nextInt();
        while (cases > 0){
            int a  = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
            int ans = PaintRibbons(a,b,c);

            if(ans == 0) System.out.println("NO");
            else System.out.println("YES");
            cases--;
        }
    }
    private static int PaintRibbons(int a,int b , int c){
        int differentPairs = (a/b) * (b-1);
//        if(a %2 == 0){
//            differentPairs = (a/b) * (b-1);
//        }else {
//            differentPairs = (a/b)*(b-1) + 1;
//        }
        if(differentPairs > c){
            return 1;
        }else return 0;
    }
}
