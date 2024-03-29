package CF_Competitions;

import java.util.Scanner;

public class ClockConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cases = sc.nextInt();
        for(int i =0 ; i < cases ; i++){
            String clock = sc.nextLine();
            int ptr = 0;
            int hour = 0;
            String res = "";
            while(ptr < clock.length()-1){
                if(ptr < 2){
                    hour = hour*10 + ((int)clock.charAt(ptr)-48);
                }
                ptr++;
                if(ptr > 2){
                    if( hour > 12){
                        res = "" + (hour - 12);
                    }else{
                        res = "" + hour;
                    }
                    res += clock.charAt(ptr);
                }
            }
            System.out.println(res);
        }
    }
}
