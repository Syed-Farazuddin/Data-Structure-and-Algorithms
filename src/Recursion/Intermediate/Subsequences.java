package Recursion.Intermediate;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Subsequences {
    public static void main(String[] args) {
        int [] arr = {1,2,3};
        ArrayList<Integer> list = new ArrayList<>();
        printSubsequences(arr,0,list);
        powerSet(arr);
    }
    private static void powerSet(int []arr){
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        for (int i = 0; i < Math.pow(2,arr.length); i++) {
            int temp = i;
            ArrayList<Integer> list = new ArrayList<>();
            int k = 0;
            while(temp > 0){
                if((temp & 1) == 1) list.add(arr[k]);
                temp >>= 1;
                k++;
            }
            result.add(list);
        }
        System.out.println(result);
    }

    private static void printSubsequences(int[] arr, int i,ArrayList<Integer> list) {
        if(i >= arr.length) {
            System.out.println(list);
            return;
        }
        list.add(arr[i]);
        printSubsequences(arr,i+1,list);
        list.remove(list.size()-1);
        printSubsequences(arr,i+1,list);
    }
}
