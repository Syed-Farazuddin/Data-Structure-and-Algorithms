import java.util.Scanner;

public class SecondONe {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int cases = sc.nextInt();
//        for (int i = 0; i < cases; i++) {
//            int n = sc.nextInt(), k = sc.nextInt();
//            while(n != 0 && k != 0){
//                int c = k/n;
//                if(c != 0) System.out.print(c + " ");
//                k = k - c;
//                n = n-1;
//            }
//            System.out.println();
//        findOr();
        System.out.println(131%12);
        }
    private static void findOr(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int res = 0;
        for(int i = 0 ; i < n ; i++){
            int curr = sc.nextInt();
            res = res | curr;
        }
        System.out.println(res);
    }
}
