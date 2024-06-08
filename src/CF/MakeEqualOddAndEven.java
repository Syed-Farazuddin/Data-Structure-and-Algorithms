package CF;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class MakeEqualOddAndEven {
//    https://codeforces.com/group/MWSDmqGsZm/contest/329103/problem/G
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int cases = sc.nextInt();
    for (int j = 0; j < cases; j++) {
        int n = sc.nextInt();
        if(n%2 != 0) {
            System.out.println(-1);
            return;
        }
        int evens = 0, odds = 0;
        for (int i = 0; i < n; i++) {
            int curr = sc.nextInt();
            if(curr % 2 == 0) evens++;
            else odds++;
        }
        if (evens == 0) {
            System.out.println(odds/2);
        } else if(odds == 0){
            System.out.println(evens / 2);
        }else {
            System.out.println(Math.abs(odds - evens));
        }
    }
}
}
