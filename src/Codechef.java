import java.util.*;

class Codechef{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n-- > 0){
            int size = sc.nextInt();
            sc.nextLine();
            String s = sc.nextLine();
            boolean ans = false;
            for(int i = 1; i < size ; i++){
                if((int) s.charAt(i) >= 65 && (int)s.charAt(i) <= 90){
                    System.out.println("No");
                    ans = true;
                    break;
                }
                else if(s.charAt(i-1) > s.charAt(i)){
                    System.out.println("NO");
                    ans = true;
                    break;
                }
            }
            if(!ans){
                System.out.println("YES");
            }
        }
    }
}