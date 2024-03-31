package Arrays.problems;

import java.util.ArrayList;
import java.util.Arrays;

public class PlusOne {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(plusOne(new int [] {9,8,7,6,5,4,3,2,1,0})));
    }
    public static int[] plusOne(int[] a) {
        long num = 0;
        for(int i = 0 ; i < a.length ; i++){
            num = num*10 + a[i];
        }
        num = num+1;
        System.out.println(num);
        ArrayList<Long> list = new ArrayList<>();
        while(num > 0){
            list.add(num%10);
            num /= 10;
        }
        int [] res = new int[list.size()];
        int i =list.size()-1;
//        System.out.println(list);
        for(long item : list){
            res[i] = (int)item;
            i--;
        }
        return res;
    }
}
