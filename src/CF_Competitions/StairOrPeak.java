package CF_Competitions;

import java.util.Scanner;

public class StairOrPeak {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cases = sc.nextInt();
        while(cases > 0){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            if(a < b && b<c){
                System.out.print("STAIR\n");
            }
            else if(a<b && b>c){
                System.out.print("PEAK\n");
            }else{
                System.out.print("NONE\n");
            }
            cases--;
        }
    }
}
