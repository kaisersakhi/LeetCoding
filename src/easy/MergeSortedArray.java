package easy;

import java.util.Arrays;


/*
link : https://leetcode.com/problems/merge-sorted-array/
* You are given two integer arrays nums1 and nums2, sorted in non-decreasing order,
* and two integers m and n, representing the number of elements in nums1 and nums2
*  respectively.

Merge nums1 and nums2 into a single array sorted in non-decreasing order.

The final sorted array should not be returned by the function, but instead be
*  stored inside the array nums1. To accommodate this, nums1 has a length of m + n,
* where the first m elements denote the elements that should be merged,
* and the last n elements are set to 0 and should be ignored. nums2 has a length of n.
*
* */
public class MergeSortedArray {
    public static void main(String[] args) {
        MergeSortedArray obj = new MergeSortedArray();
//        int[] a1 = new int[]{1, 2, 3, 0, 0, 0};
//        obj.merge(a1, 3, new int[]{2, 5, 6}, 3);
        int[] a1 = new int[]{2,0};
        obj.merge(a1, 1, new int[]{1}, 1);

        System.out.println(Arrays.toString(a1));
    }

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if (n == 0) return;
        int k = nums1.length -1;
        if (m > 0)
            --m;
        --n;
        while (n >= 0 && m >= 0 && k >= 0){
            if (nums1[m] > nums2[n]){
                nums1[k--] = nums1[m--];
            }else if (nums2[n] > nums1[m]){
                nums1[k--] = nums2[n--];
            }else{
                nums1[k--] = nums1[m--];
                nums1[k--] = nums2[n--];
            }
        }
        while(k >= 0 && m >= 0){
            nums1[k--] = nums1[m--];
        }
        while(k >= 0 && n >= 0)
            nums1[k--] = nums2[n--];
    }
}
