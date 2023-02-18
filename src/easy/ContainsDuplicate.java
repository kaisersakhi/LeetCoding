package easy;

import java.lang.reflect.Array;
import java.util.HashSet;

public class ContainsDuplicate {
    public static void main(String[] args) {

    }
    public boolean containsDuplicate(int[] nums){
        HashSet<Integer> set = new HashSet<>();

        for (int num : nums) {
            if (set.contains(num)) return true;
            else set.add(num);
        }
        return false;
    }
}
