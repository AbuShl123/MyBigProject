package MyOwn.tasks.medianOfTwoSortedArrays;

import java.util.ArrayList;
import java.util.Collections;

public class Solution {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        ArrayList<Integer> merge = new ArrayList<>();

        for (int i : nums1) merge.add(i);
        for (int i : nums2) merge.add(i);

        Collections.sort(merge);
        if (merge.size()%2==0) {
            return (double)(merge.get((merge.size()/2)-1) + merge.get(merge.size()/2))/2;
        }
        return merge.get(merge.size()/2);
    }


}

