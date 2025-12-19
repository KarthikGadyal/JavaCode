package com.practice;

import java.util.HashMap;
import java.util.Map;

public class CountFreq {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,2,3,1,2,5,1};
		
		Map<Integer, Integer> hm = new HashMap<>();
		
		for(int num: arr) {
			hm.put(num, hm.getOrDefault(num, 0) + 1);	//remember for count frequency
		}
		System.out.println(hm);
	}
}
