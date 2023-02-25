package com.leetcode.neetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res = new ArrayList<>();
        if (strs.length == 0) {
            return res;
        }

        HashMap<String, List<String>> map = new HashMap<>();
        for (String s : strs) {
            int[] hash = new int[26];
            for (char c : s.toCharArray()) {
                // ASCIIコード https://medium-company.com/ascii%E3%82%B3%E3%83%BC%E3%83%89/
                // e.g. hash['z'-'a'] = 25
                hash[c - 'a']++;
            }
            String key = new String(Arrays.toString(hash));
            map.computeIfAbsent(key, k -> new ArrayList<>());
            // 同じhash値がkeyのものが既にあれば追加
            map.get(key).add(s);
        }
        res.addAll(map.values());
        return res;
    }
}
