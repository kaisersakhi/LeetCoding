package easy;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    public static void main(String[] args) {
        MajorityElement obj = new MajorityElement();
        System.out.println(obj.majorityElement(new int[]{2,2,1,1,1,2,2}));
    }
    public int majorityElementWithHashMap(int[] nums) {
        if (nums.length == 1) return nums[0];
        if (nums.length == 0) return 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int x : nums) {
            int t = map.get(x) == null ? 0 : map.get(x);
            map.put(x, ++t);
            if (t > (nums.length/2)) return x;
        }
        return 0;
    }

    public int majorityElement(int[] nums){
        int vote = 0;
        int candidate = 0;
        for (int x : nums){
            if (vote == 0) candidate = x;
            if (candidate == x){
                vote++;
            }else{
                --vote;
            }
        }
        return candidate;
    }
}
