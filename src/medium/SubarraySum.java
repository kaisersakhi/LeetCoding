package medium;

import java.util.Arrays;

public class SubarraySum {
    public static void main(String[] args) {

    }
    public int subarraySum(int[] nums, int k) {
        int sum = 0;
        int counter = 0;

        for (int i = 0; i < nums.length ; ++i){
            if (sum + nums[i] < k){
                sum += nums[i];
                continue;
            }else if (sum + nums[i] == k){
                if (sum != 0){
                    sum = 0;
                    --i;
                }
                counter++;
            }
            if (sum != 0){
                sum = 0;
                --i;
            }
        }

        return counter;
    }

}
