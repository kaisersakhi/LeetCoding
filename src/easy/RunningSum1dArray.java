package easy;

import java.util.Arrays;

//https://leetcode.com/problems/running-sum-of-1d-array/description/
public class RunningSum1dArray {
    public static void main(String[] args) {

        RunningSum1dArray obj = new RunningSum1dArray();
        System.out.println(Arrays.toString(obj.runningSum(new int[]{1,2,3,4,5})));
    }

    public int[] runningSum(int[] nums) {
        if (nums.length <= 1) return nums;
        int i = 0, j = 1;
        while (j < nums.length){
            nums[j] = nums[i++] + nums[j++];
        }
        return nums;
    }
}
