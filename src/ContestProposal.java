import java.util.*;
//Syed farazuddin ------------> Submitted by Syed Farazuddin
public class ContestProposal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        Original Code ----------> No plag
        int cases = sc.nextInt();
        for(int k = 0;k < cases; k++){
            int n = sc.nextInt();
            int [] first = new int[n], second =  new int[n];
//            Don't play around with this code
            for(int i = 0 ; i < n ; i++){
                first[i] = sc.nextInt();
            }
//            Taking inputs using Scanner
            int j = 0;
            while(j < n) {
                second[j] = sc.nextInt();
                j++;
            }
//            Storing answer in result variable
            int result = 0;
            int pointer1 = 0;
            for (int i = 0; i < n; i++) {
                if(first[pointer1] > second[pointer1]){
                    first[n-1] = second[pointer1];
                    result++;
                }
                pointer1++;
                Arrays.sort(first);
            }
//            Printing My result
            System.out.println(result);
        }
    }
}
