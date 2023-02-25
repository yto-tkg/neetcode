package com.leetcode.neetcode;

public class ProductofArrayExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        int[] arr = new int[nums.length];
        int right = 1, left = 1;
        // 自分を含まない左の数字との乗算(1, 1*1つめ, 1*2つめ...) ①
        for (int i = 0; i < nums.length; i++) {
            arr[i] = left;
            left *= nums[i];
        }
        // ①と自分を含まない右の数字との乗算
        for (int i = nums.length - 1; i >= 0; i--) {
            arr[i] *= right;
            right *= nums[i];
        }
		return arr;
    }
}
