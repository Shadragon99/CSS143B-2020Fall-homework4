package Problem1;

import java.util.ArrayList;
import java.util.List;

public class Permutation {
    public static List<List<Integer>> permute(int[] nums) {
        // homework
        List<List<Integer>> result = new ArrayList<>();
        permute(nums, 0, result);
        return result;
    }

    private static void permute(int[] nums, int position, List<List<Integer>> result){
        int temp;
        if (position == nums.length - 1){
            List<Integer> oneResult = new ArrayList<>();
            for(int i = 0; i <nums.length; i++){
                oneResult.add(nums[i]);
            }
            return;
        }
        for (int i = 1; i <= nums.length - 1; i++){
            //swap occurs
            temp = nums[position];
            nums[position] = i;
            i = temp;

            permute(nums, position + 1, result);
            //swap occurs to put values back to original places
            temp = nums[position];
            nums[position] = i;
            i = temp;
        }

    }
}
