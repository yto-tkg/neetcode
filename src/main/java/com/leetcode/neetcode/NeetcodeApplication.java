package com.leetcode.neetcode;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class NeetcodeApplication {

	public static void main(String[] args) {

//		SpringApplication.run(NeetcodeApplication.class, args);

		String s = "anagram";
		String t = "nagaram";
		char[] sChars = s.toCharArray();
		char[] tChars = t.toCharArray();

		Arrays.sort(sChars);
		Arrays.sort(tChars);

		System.out.println(sChars);
		System.out.println(tChars);

		System.out.println(Arrays.equals(sChars, tChars));

		char test1 = 'a';
		System.out.println(test1);
	}

}
