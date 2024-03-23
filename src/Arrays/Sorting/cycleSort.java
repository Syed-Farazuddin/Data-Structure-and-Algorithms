package Arrays.Sorting;

import java.util.Arrays;

public class cycleSort {
    public static void main(String[] args) {
        int [] arr = {2,4,1,9,6,7,8,5,3};
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] != i+1){
                int temp = arr[i];
                arr[i] = i+1;
                arr[temp-1] = temp;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
