package patterns;

import java.util.Scanner;

public class Seven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int prev = 1;
        for (int i = 0; i < n; i++) {
            prev = i%2 == 0 ?  1 :  0;
            for (int j = 0; j <= i; j++) {
                System.out.print(prev);
                prev = 1 - prev;
            }
            System.out.println();
        }
    }
}
