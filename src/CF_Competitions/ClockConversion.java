//package CF_Competitions;

import java.util.Scanner;

public class ClockConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cases = sc.nextInt();
        while(cases > 0){
            int f =0;
            String i = sc.next();
            int h = (i.charAt(0)- '0')*10 + (i.charAt(1) - '0');
            if(h >= 12) {
                h -= 12;
                f=1;
            }
            String hh = h==0 ? "12" : h + "";
            if(hh.length() == 1){
                hh = "0" + hh;
            }
            if(f == 1){
                System.out.println(hh + ":" + i.charAt(3) + i.charAt(4)+" PM");
            }else{
                System.out.println(hh+":"+i.charAt(3)+i.charAt(4)+" AM");
            }
            cases--;
        }
    }
}
