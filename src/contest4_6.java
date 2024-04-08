import java.util.Scanner;

public class contest4_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cases = sc.nextInt();
        for(int i =0 ; i < cases; i++){
            int len = sc.nextInt();
            String s = sc.next();
            System.out.println(len);
            System.out.println(s);
            int cnt = 0;
            for(int k = 0; k < len ; k++) {
                if(s.charAt(k) == '1') cnt++;
            }
            if(cnt%2 != 0){
                System.out.println("NO");
                continue;
            }
            boolean possible = true;
            if(cnt == 2){
                for(int j = 0; j < s.length() - 1; j++){
                    if(s.charAt(i) == '1' && s.charAt(i+1) == '1'){
                        possible = false;
                        break;
                    }
                }
            }
            if(possible) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
