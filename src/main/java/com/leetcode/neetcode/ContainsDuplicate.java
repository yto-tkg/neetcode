package com.leetcode.neetcode;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> items = new HashSet<>();

        for(Integer i : nums) {
            items.add(i);
        }
        return nums.length != items.size();
    }
}
