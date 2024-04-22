// 5
// -5 0 -3 -4 12

//Even: 3
//Odd: 2
//Positive: 1
//Negative: 3
import java.util.Scanner;

public class checks{
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int even = 0, odd = 0, positive = 0 , negative = 0;
        for(int i = 1; i <= n ; i++){
            int curr = in.nextInt();
            if(curr > 0){
                positive++;
            }
            if(curr < 0){
                negative++;
            }
            if(curr%2 == 0){
                even++;
            }
            if(curr%2 != 0){
                odd++;
            }
        }
        System.out.println("Even: " + even);
        System.out.println("Odd: " + odd);
        System.out.println("Positive: " + positive);
        System.out.println("Negative: " + negative);
    }
}