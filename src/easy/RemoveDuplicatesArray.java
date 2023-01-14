package easy;


//https://leetcode.com/problems/remove-duplicates-from-sorted-array/
public class RemoveDuplicatesArray {
    public static void main(String[] args) {
        System.out.println(removeDuplicates(new int[]{0,0,1,1,1,2,2,3,3,4}));
    }

    public static int removeDuplicates(int[] nums){
        int k = 0;
        if (nums.length <= 1) return k+1;

        int i = 0;
        int j = i + 1;

        for (;;){

            while (nums[i] == nums[j]){
                ++j;
                if (j >= nums.length){
                    nums[k] = nums[i];
                    return ++k;
                }
            }

            nums[k++] = nums[i];
            i = j;
        }
//        return k;
    }
}
