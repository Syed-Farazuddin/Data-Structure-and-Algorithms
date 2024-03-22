package Arrays.Sorting;

public class SelectionSort {
    public static void main(String[] args) {
        int [] arr = {13,525,12,1,5,91};
        for(int i = 0 ; i < arr.length-1 ; i++){
            int curridx = arr.length-i-1;
            int maxidx = findMax(arr,curridx);
            int temp = arr[maxidx];
            arr[maxidx] = arr[curridx];
            arr[curridx] = temp;
        }
        for(int num :arr){
            System.out.print(num + " ");
        }
    }
    private static int findMax(int [] arr , int curridx){
        int max = 0;
        for(int i =0 ; i <= curridx; i++){
            if(arr[max] < arr[i]) {
                max = i;
            }
        }
        return max;
    }

}
