package medium;

import java.util.Arrays;

public class ProductExceptSelf {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(productExceptSelf(new int[]{1,2,3,4})));
    }
    static int[] productExceptSelf(int[] nums) {
        int zerosCount = 0;
        int zeroIndex = -1;
        int[] arr = new int[nums.length];
        int prod = 1;
        for (int i = 0; i <  nums.length ; ++i){
            if (nums[i] == 0){
                zeroIndex = i;
                ++zerosCount;
                if (zerosCount > 1) return arr;
            }else{
                prod *= nums[i];
            }
        }
        if (zerosCount == 1){
            arr[zeroIndex] = prod;
            return arr;
        }

        for (int i = 0; i < nums.length; ++i){
            arr[i] = prod/nums[i];
        }
        return arr;
    }
}
