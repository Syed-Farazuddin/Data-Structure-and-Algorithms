package Arrays.problems;

import java.util.Arrays;

// Smallest possible missing number
public class P41 {
    public static void main(String[] args) {
        int arr [] = {7,8,9,11,12};
        Arrays.sort(arr);
        int smallest = 1;
        for(int i =0 ;i < arr.length ; i++){
            if(arr[i] == smallest){
                smallest++;
            }
        }
        System.out.println(smallest);
    }
}
