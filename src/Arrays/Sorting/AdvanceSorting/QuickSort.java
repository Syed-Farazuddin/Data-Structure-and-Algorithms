package Arrays.Sorting.AdvanceSorting;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int [] arr = {3,64,2,1,34,29,5};
        quicksort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    private static void quicksort(int [] arr , int low , int high){
        if(low < high){
            int partIdx = partition(arr,low,high);
            quicksort(arr,low,partIdx-1);
            quicksort(arr,partIdx+1,high);
        }
    }
    private static int partition(int [] arr, int low, int high){
        int pivot = arr[low];
        int i = low;
        int j = high;

        while (i < j) {
            while (arr[i] <= pivot && i <= high - 1) {
                i++;
            }

            while (arr[j] > pivot && j >= low + 1) {
                j--;
            }
            if (i < j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[low];
        arr[low] = arr[j];
        arr[j] = temp;
        return j;
    }
}
