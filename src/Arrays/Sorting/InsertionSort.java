package Arrays.Sorting;

public class InsertionSort {
    public static void main(String[] args) {
        int [] arr = {13,525,12,1,5,91};
        for(int i = 0 ; i < arr.length - 1;i++){
            for (int j = i+1; j > 0; j--) {
                if(arr[j] < arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
                else{
                    break;
                }
            }
        }
        for(int nums : arr){
            System.out.print(nums + " ");
        }
    }
}
