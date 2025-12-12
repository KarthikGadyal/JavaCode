package com.practice;

import java.util.Arrays;
import java.util.Scanner;

public class FindSecondSmallest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter size of an array : ");
		int[] arr= new int[scan.nextInt()];
		for(int i = 0; i < arr.length; i++) {
			arr[i]= scan.nextInt();
		}
		System.out.println("array : " + Arrays.toString(arr));
		System.out.println("second smallest : " + secondSmalllest(arr));

	}
	
	public static int secondSmalllest(int arr[]) {
		
		int smallest = Integer.MAX_VALUE;
		int secSmallest = Integer.MAX_VALUE;
		
		for(int num : arr) {
			if(num < smallest) {
				secSmallest = smallest;
				smallest = num;
			}else if(num != smallest && num < secSmallest) {
				secSmallest = num;
			}
		}
		

	    if (secSmallest == Integer.MAX_VALUE) {
	        System.out.println("No second smallest element exists");
	        return -1;   // or throw exception
	    }
		return secSmallest;
		
	}

}
