import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class checks {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int cases = sc.nextInt();
//        while(cases > 0){
//            int n = sc.nextInt(), k = sc.nextInt();
//            int [] dur = new int[n];
//            for(int i = 0 ; i < n ; i++){
//                dur[i] = sc.nextInt();
//            }
//            AttackShip(dur,k);
//            cases--;
//        }
        System.out.println(timeRequiredToBuy(new int[]{2,3,2},2));
        System.out.println(ForMinString("41312",2));
    }

    private static void AttackShip(int[] dur, int k) {
        int shipsFallen = 0;
        int p1 = 0 , p2 = dur.length-1;
        for(int i = 1; i <= k && p1 <= p2 ; i++){
            if(i%2 != 0){
                dur[p1] = dur[p1]-1;
                if(dur[p1] == 0){
                    p1++;
                    shipsFallen++;
                }
            }else{
                dur[p2] = dur[p2]-1;
                if(dur[p2] == 0){
                    p2--;
                    shipsFallen++;
                }
            }
        }
        System.out.println(shipsFallen);
    }
    private static String ForMinString(String num , int k){
        String min = "";
        int mini = Integer.MAX_VALUE;
        for(int i = 0; i < num.length() ; i++){
            String curr = num.substring(i,num.length()-1);
        }
        return min;
    }
    public static int timeRequiredToBuy(int[] tickets, int k) {
        int time = 0;

        for (int i = 0; i < tickets.length; i++) {
            if (i <= k) {
                time += Math.min(tickets[i], tickets[k]);
            } else {
                time += Math.min(tickets[i], tickets[k] - 1);
            }
        }

        return time;
    }
}
