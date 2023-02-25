package com.leetcode.neetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class TopKFrequentElements {
    public int[] topKFrequent(int[] nums, int k) {
        int[] arr = new int[k];
        HashMap<Integer, Integer> map = new HashMap<>();
        // 要素と個数のmap
        for (int num : nums) map.put(num, map.getOrDefault(num, 0) + 1);
        // 要素が少ない順で順序付けするqueueを作成
        PriorityQueue<Map.Entry<Integer, Integer>> pq = new PriorityQueue<>(
                (a, b) ->
                        a.getValue() - b.getValue()
        );
        for (Map.Entry<Integer, Integer> it : map.entrySet()) {
            // queueに追加していく
            pq.add(it);
            // queueのサイズがkを超えたら、queueの先頭を削除 i.e. 要素が少ない値から消えていく
            if (pq.size() > k) pq.poll();
        }
        int i = k;
        while (!pq.isEmpty()) {
            // k番目からqueueの先頭から取得
            arr[--i] = pq.poll().getKey();
        }
		return arr;
    }
}
