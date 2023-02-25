package com.leetcode.neetcode;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

@SpringBootApplication
public class NeetcodeApplication {

	public static void main(String[] args) {

//		SpringApplication.run(NeetcodeApplication.class, args);

		int[] nums = new int[] {1,2,3,4};
//		int k = 2;

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
//		return arr;
		System.out.println(arr);
	}
}
