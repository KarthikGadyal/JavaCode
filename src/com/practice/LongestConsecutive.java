package com.practice;

import java.util.HashSet;

public class LongestConsecutive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nums = {100,4,23,1,3,2};
		System.out.println("Longest Consecutive sequence is : " + longestConsecutive(nums));
		
		
	}
	
	public static int longestConsecutive(int nums[]) {
		
		HashSet<Integer> set = new HashSet<>();
		
		for(int num : nums) {
			set.add(num);
		}
		
		int longest = 0;
		
		for(int num : set) {
			if(!set.contains(num - 1)) {
				int current = num;
				int streak = 1;
				
				while(set.contains(current + 1)) {
					current++;
					streak++;
				}
				longest = Math.max(streak, longest);
			}
			
			
		}
		
		return longest;
		
	}

}
