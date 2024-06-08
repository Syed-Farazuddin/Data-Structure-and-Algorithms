package CF;

import java.util.HashSet;
import java.util.Scanner;

public class EasyOrHard {
    public static void main(String[] args) {
//        https://codeforces.com/problemset/problem/1030/A
        Scanner sc = new Scanner(System.in);
        HashSet<Integer> set = new HashSet<>();
        int n = sc.nextInt();
        boolean ans = false;
        for(int i = 0; i < n ; i ++){
            if(sc.nextInt() != 0){
                System.out.println("Hard");
                ans = true;
                break;
            }
        }
        if(!ans){
            System.out.println("Easy");
        }
    }
}
