package Arrays.Searching;

public class BinarySearch {
    public static void main(String[] args) {
//        Bubble sort can only work on sorted arrays
        int [] arr = {2,4,5,10,15,53};
        int start = 0;
        int target = 10;
        int end = arr.length-1;
        while(start <= end){
            int mid = (start+end)/2;
            if(arr[mid] == target){
                System.out.println("target found at " + mid + " index" );
                break;
            } else if (arr[mid] > target) {
                end = mid-1;
            }else{
                start = mid+1;
            }
        }
    }
}
