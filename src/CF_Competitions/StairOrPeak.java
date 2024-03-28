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
            if(a < b && b<c && a < c){
                System.out.println("STAIR");
            }
            else if(b>a && b>c){
                System.out.println("PEAK");
            }else{
                System.out.println("NONE");
            }
            cases--;
        }
    }
}
