import java.util.Scanner;

public class ProblemB{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        String x = sc.nextLine();
        char [] digits = x.toCharArray();
        boolean ans = true;
//        1  , 14 , 144
        for(int i = 0; i < digits.length ; i++){
            if(digits[i] == '1'){
                continue;
            }
            else if( i > 0 && digits[i] == '4' && digits[i-1] == '1' || (i-1 > 0 && digits[i] == '4' && digits[i-1] == '4' && digits[i-2] =='1')){
                continue;
            }
            else{
                ans = false;
                break;
            }
        }
        if(ans){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}