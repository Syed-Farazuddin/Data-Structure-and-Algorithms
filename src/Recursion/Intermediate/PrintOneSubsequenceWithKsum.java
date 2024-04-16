package Recursion.Intermediate;

import java.util.ArrayList;

public class PrintOneSubsequenceWithKsum {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5};
        int k = 5;
        ArrayList<Integer> list = new ArrayList<>();
        PrintSubsequencesWithKSum(arr,0,k,0,list);
        System.out.println(list);
    }
    private static boolean PrintSubsequencesWithKSum(int[] arr, int i, int k, int sum, ArrayList<Integer> list) {
        if(i == arr.length) {
            if(sum == k){
                System.out.println(list);
                return true;
            }
            else{
                return false;
            }
        }
        sum+= arr[i];
        list.add(arr[i]);
        if(PrintSubsequencesWithKSum(arr, i + 1, k, sum, list)) return true;
        list.remove(list.size()-1);
        sum -= arr[i];
        if(PrintSubsequencesWithKSum(arr, i + 1, k, sum, list)) return true;
        return false;
    }
}
