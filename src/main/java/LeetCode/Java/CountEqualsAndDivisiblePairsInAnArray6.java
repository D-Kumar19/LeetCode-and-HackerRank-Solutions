package LeetCode.Java;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CountEqualsAndDivisiblePairsInAnArray6 {
	// Method # 01: (Brute-force)
	public int countPairs(int[] nums, int k) {
		int n = nums.length;
		int count = 0;

		for(int i = 0; i < n; i++){
			for(int j = i+1; j < n; j++){
				if(nums[i] == nums[j] && (i * j) % k == 0){
					count++;
				}
			}
		}
		return count;
	}

	// Method # 02: (Using a Map)
	/*
	public int countPairs(int[] nums, int k) {
		Map<Integer, List<Integer>> indexes = new HashMap<>();
		for (int i = 0; i < nums.length; ++i) {
			indexes.computeIfAbsent(nums[i], list -> new ArrayList<>()).add(i);
		}

		int count = 0;
		for (List<Integer> index : indexes.values()) {
			for (int i = 0; i < index.size(); ++i) {
				for (int j = 0; j < i; ++j) {
					if (index.get(i) * index.get(j) % k == 0) {
						++count;
					}
				}
			}
		}
		return count;
	}
	*/
}