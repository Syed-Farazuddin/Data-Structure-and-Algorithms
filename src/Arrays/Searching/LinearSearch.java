package Arrays.Searching;

public class LinearSearch {
    public static void main(String[] args) {
        int [] arr = {10,14,52,56,152};
        int target = 52;
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] == target){
                System.out.println("Target found at " + i + " index");
            }
        }
    }
}
