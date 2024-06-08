import java.util.Scanner;

public class SortingAndShifting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n > 0) {
            String s = sc.next();
            if(s.length() < 2){
                System.out.println(0);
                return;
            }
            long cost  = 0;
            int left = 0;
            int right = 1;
            char [] seq = s.toCharArray();
//            System.out.println(s.length());
            while(right < s.length()){
                if(seq[left] == '1' && seq[right] == '0'){
                    char temp = seq[right];
                    seq[right] = seq[left];
                    seq[left] = temp;
                    cost += right - left + 1;
                    left++;
                }
                if(seq[left] == '0') left++;
                right++;
            }
            System.out.println(cost);
            n--;
        }
    }
}
