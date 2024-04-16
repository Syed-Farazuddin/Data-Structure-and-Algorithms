package Recursion.Intermediate;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Subsequences {
    public static void main(String[] args) {
        int [] arr = {1,2,3};
        ArrayList<Integer> list = new ArrayList<>();
        printSubsequences(arr,0,list);
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
