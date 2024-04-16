package Recursion.Intermediate;

import java.util.ArrayList;

public class SubsequencesWithKSum {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5};
        int k = 5;
        ArrayList<Integer> list = new ArrayList<>();
        PrintSubsequencesWithKSum(arr,0,k,0,list);
    }

    private static void PrintSubsequencesWithKSum(int[] arr, int i, int k, int sum, ArrayList<Integer> list) {
        if(i == arr.length && sum == k) {
            System.out.println(list);
            return;
        }
        if(i == arr.length) return;
        sum+= arr[i];
        list.add(arr[i]);
        PrintSubsequencesWithKSum(arr,i+1,k,sum,list);
        list.remove(list.size()-1);
        sum -= arr[i];
        PrintSubsequencesWithKSum(arr,i+1,k,sum,list);
    }
}
