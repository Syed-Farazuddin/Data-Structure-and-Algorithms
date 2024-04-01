import java.util.Scanner;

public class Robot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cases = sc.nextInt();
        for(int i =0 ; i < cases;i++){
            String s= sc.next();
            if(s.contains("it")){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }
}
