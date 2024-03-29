package CF_Competitions;

import java.util.Scanner;

public class StairOrPeak {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cases = sc.nextInt();
        while(cases > 0){
            int arr [] = new int[3];
            for(int i =0 ; i < 3 ; i++){
                arr[i] = sc.nextInt();
            }
            if(arr[0] < arr[1] && arr[1] < arr[2]){
                System.out.print("STAIR\n");
            }
            else if(arr[0]<arr[1] && arr[1]>arr[2]){
                System.out.print("PEAK\n");
            }else{
                System.out.print("NONE\n");
            }
            cases--;
        }
    }
}
