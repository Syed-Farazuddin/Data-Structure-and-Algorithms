package Arrays.problems;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class leetcode_442 {
    public static void main(String[] args) {
        int [] nums = {4,3,2,7,8,2,3,1};

        List<Integer> list = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();
        for(int i =0 ; i < nums.length ; i++){
            if(set.contains(nums[i])){
                list.add(nums[i]);
            }else{
                set.add(nums[i]);
            }
        }
        System.out.println(list);
    }
}
