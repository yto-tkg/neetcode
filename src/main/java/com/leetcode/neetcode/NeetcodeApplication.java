package com.leetcode.neetcode;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

@SpringBootApplication
public class NeetcodeApplication {

	public static void main(String[] args) {

//		SpringApplication.run(NeetcodeApplication.class, args);

		int[] nums = new int[] {2, 7, 11, 15};
		int target = 9;
		Map<Integer, Integer> prevMap = new HashMap<>();

		for (int i=0; i<nums.length; i++) {
			int num = nums[i];
			int diff = target - num;

			if (prevMap.containsKey(diff)) {
				System.out.println(new int[] {prevMap.get(diff), i});
			}
			prevMap.put(num, i);
		}
		System.out.println(new int[]{});



	}

}
