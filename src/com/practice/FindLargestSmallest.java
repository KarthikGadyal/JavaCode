package com.practice;

public class FindLargestSmallest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,1,-1,1,1,1};
		int min = arr[0], max = arr[0];
		for(int i = 1 ;i < arr.length; i++) {
			if(arr[i] < min) {
				min = arr[i];
			}if (arr[i] > max) {
                max = arr[i];
            }
		}
		System.out.println("min : " + min + " max : " +  max);
		

	}

}
