package BitManupulation;

public class CanSorted {
    public static void main(String[] args) {
        System.out.println(canSortArray(new int[] {3,16,8,4,2}));;
    }
    private static boolean setBits(int a , int b ){
        int aC = 0, bC = 0;
        while(a > 0){
            if((a&1) == 1) aC++;
            a = a >> 1;
        }
        while(b > 0){
            if((b&1) == 1) bC++;
            b = b >> 1;
        }
        return aC == bC;
    }
    public static boolean isSorted(int [] nums){
        for(int i = 0; i < nums.length-1 ; i++){
            if(nums[i] > nums[i+1]){
                return false;
            }
        }return true;
    }
    public static boolean canSortArray(int[] nums) {
        for(int i = 0 ; i < nums.length ; i++){
            for(int j = 1; j < nums.length-i ; j++){
                if(nums[j] < nums[j-1] && setBits(nums[j],nums[j-1])){
                    swap(j,j-1,nums);
                }
                else if(nums[j] >= nums[j-1]) continue;
                else{
                    return false;
                }
            }
        }
        return true;
    }

    private static void swap(int a, int b, int[] nums) {
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
}
