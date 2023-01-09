package easy;

public class FindPivotElement {
    public static void main(String[] args) {
        FindPivotElement obj = new FindPivotElement();
        System.out.println(obj.pivotIndex(new int[]{1,2,3,2,1}));
        System.out.println(obj.pivotIndex(new int[]{-1,-1,-1,-1,-1,0}));
    }

    public int pivotIndex(int[] nums) {
        int totalSum = 0;
        int leftSum = 0;

        for (int x : nums) totalSum += x;

        for (int i = 0; i < nums.length; ++i){
            if (totalSum - leftSum - nums[i] == leftSum) return i;
            leftSum += nums[i];
        }
        return -1;
    }
}
