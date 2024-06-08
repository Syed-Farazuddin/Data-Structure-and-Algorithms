package Arrays.Sorting.AdvanceSorting;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int [] arr = {3,64,2,1,34,29,5};
        mergeSort(arr, 0 , arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }
    private static void mergeSort(int [] arr , int low , int high){
        if(low == high){
            return;
        }
        int mid = (low + high)/2;
        mergeSort(arr, low, mid);
        mergeSort(arr, mid+1, high);
        merge(arr,low,mid,high);
    }
    private static void merge(int [] arr, int low , int mid, int high){
        int [] temp = new int[high+1];
        int left = low, right = mid+1, idx = 0;
        while (left <= mid && right <= high) {
            if (arr[left] <= arr[right]) {
                temp[idx++] = arr[left];
                left++;
            } else {
                temp[idx++] = arr[right];
                right++;
            }
        }

        // if elements on the left half are still left //

        while (left <= mid) {
            temp[idx++] = arr[left];
            left++;
        }

        //  if elements on the right half are still left //
        while (right <= high) {
            temp[idx++] = arr[right];
            right++;
        }

        // Copying all elements from temporary to arr //
        for (int i = low; i <= high; i++) {
            arr[i] = temp[i - low];
        }
    }
}
