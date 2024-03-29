//package CF_Competitions;

import java.util.Scanner;

public class Upscaling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cases = sc.nextInt();
        while(cases>0){
            StringBuilder a= new StringBuilder();
            StringBuilder b = new StringBuilder();
            int n = sc.nextInt();
            for(int i = 1; i <= n ; i++){
                if(i%2 == 1){
                   a.append("##");
                   b.append("..");
                }else{
                   a.append("..");
                   b.append("##");
                }
            }
            for(int i = 1 ; i <= n ; i++){
                if(i%2 == 1){
                    System.out.println(a + "\n" + a);
                }else{
                    System.out.println(b + "\n" + b);
                }
            }
            cases--;
        }
    }
}
