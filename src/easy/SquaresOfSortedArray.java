package easy;

import java.util.Arrays;

public class SquaresOfSortedArray {
    public static void main(String[] args) {
//        System.out.println(Arrays.toString(sortedSquares(new int[]{-4, -1, 0, 3, 10})));
        System.out.println(Arrays.toString(sortedSquares2(new int[]{-4, -1, 0, 3, 10})));
    }

    static int[] sortedSquares2(int[] nums){
        int i = 0, j = nums.length -1;
        int[] result = new int[j + 1];
        for (int k = j ; k >= 0; --k){
            if (Math.abs(nums[i]) > Math.abs(nums[j])){
                result[k] = nums[i] * nums[i++];
            }else{
                result[k] = nums[j] * nums[j--];
            }
        }
        return result;
    }
    static int[] sortedSquares(int[]  nums){
        for (int i = 0; i < nums.length; ++i)
            nums[i] = Math.abs(nums[i]);
        Arrays.sort(nums);
        for (int i =0; i < nums.length; ++i)
            nums[i] = nums[i] * nums[i];

        return nums;
    }
}
