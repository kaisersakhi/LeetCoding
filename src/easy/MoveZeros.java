package easy;

import java.util.Arrays;

public class MoveZeros {
    public static void main(String[] args) {
        MoveZeros moveZeros = new MoveZeros();
        int[] a1 = new int[]{0,1,0,3,12};
        moveZeros.moveZeroes(a1);
        System.out.println(Arrays.toString(a1));
    }

    public void moveZeroes(int[] nums) {
        int i = 0, k = 0;

        while(k < nums.length -1){
            while(nums[k] == 0){
                if(k >= nums.length -1)
                    break;
                ++k;
            }
            while(nums[i] != 0){
                if (i >= nums.length -1)
                    break;
                ++i;
            }
            if(k < i){
                k = i;
            }else{
                nums[i] = nums[k];
                nums[k] = 0;
            }
        }
    }
}
