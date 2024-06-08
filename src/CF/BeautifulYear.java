package CF;

import java.util.HashSet;
import java.util.Scanner;

public class BeautifulYear {
//    https://codeforces.com/problemset/problem/1030/A
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        year++;
        while(true){
            String temp =  Integer.toString(year);
            HashSet<Character> set = new HashSet<>();
            int ptr = 0;
            while(ptr < temp.length()){
                set.add(temp.charAt(ptr++));
            }
            if(set.size() == temp.length()){
                System.out.println(temp);
                break;
            }
            year++;
        }
    }
}
