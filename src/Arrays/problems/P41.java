package Arrays.problems;

import java.util.Arrays;
import java.util.HashSet;

// Smallest possible missing number
public class P41 {
    public static void main(String[] args) {
        int arr [] = {7,2,1,8,9,11,12};
        System.out.println(hashset(arr));;
    }
    private static int bruteForce(int [] arr){
        Arrays.sort(arr);
        int smallest = 1;
        for(int i =0 ;i < arr.length ; i++){
            if(arr[i] == smallest){
                smallest++;
            }
        }
       return smallest;
    }
    private static int hashset(int [] arr){
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0 ; i < arr.length ; i++){
            set.add(arr[i]);
        }
        int smallest = 1;
        for(int i = 0 ; i < arr.length ; i++){
            if(set.contains(smallest)){
                smallest += 1;
            }
        }
        return smallest;
    }
}
