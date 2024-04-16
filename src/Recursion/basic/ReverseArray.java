package Recursion.basic;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int [] arr = {5,4,3,2,1};
        reverse(arr,0,arr.length-1);
    }
    private static void reverse(int [] arr, int f, int l){
        if(f >= l) {
            System.out.println(Arrays.toString(arr));
            return;
        }
        int temp = arr[f];
        arr[f] = arr[l];
        arr[l] = temp;
        reverse(arr,f+1,l-1);
    }
}
