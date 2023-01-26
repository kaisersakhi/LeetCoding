package medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    public static void main(String[] args) {
        System.out.println(threeSum(new int[]{-1,0,1,0}));
    }

    public static List<List<Integer>> threeSum(int[] nums){
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        int leftPointer = 0 , rightPointer = 0;
        int sum = 0;
        for (int i = 0; i < nums.length; ++i){
            leftPointer = 1 + i;
            rightPointer = nums.length -1;
            while (leftPointer < rightPointer){
                sum = nums[leftPointer] + nums[rightPointer] + nums[i];
                if (sum < 0){
                    ++leftPointer;
                } else if (sum > 0) {
                    --rightPointer;
                }else {
                    // found
                    List<Integer> list = new ArrayList<>(3);
                    list.add(nums[i]);
                    list.add(nums[leftPointer]);
                    list.add(nums[rightPointer]);
                    result.add(list);
                    ++leftPointer;

                    while (leftPointer < nums.length - 1 && nums[leftPointer -1] == nums[leftPointer])
                        ++leftPointer;
                }
            }

            while (i < nums.length - 1 && nums[i + 1] == nums[i]) ++i;

        }
        return result;
    }
}

