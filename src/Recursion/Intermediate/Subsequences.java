package Recursion.Intermediate;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Subsequences {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5};
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            printSubsequences(arr,i);
        }
    }

    private static void printSubsequences(int[] arr, int i) {
        if(i > arr.length-1) {
            return;
        }
        for (int j = 0; j < i; j++) {
            System.out.print(arr[j] + " ");
        }
        System.out.println();
        printSubsequences(arr,i+1);
    }
}
