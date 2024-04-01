package Arrays.problems;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;

public class leetcode_1365 {
    public static void main(String[] args) {
        smallerNumbersThanCurrent(new int [] {8,1,2,2,3});
    }
    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int [] res = new int[nums.length];
        for(int i = 0 ; i < nums.length ; i++){
            int count = 0;
            for (int j = 0; j < nums.length; j++) {
                if(nums[i] > nums[j]) count++;
            }
            res[i] = count;
        }
        System.out.println(Arrays.toString(res));
        return res;
    }
}
