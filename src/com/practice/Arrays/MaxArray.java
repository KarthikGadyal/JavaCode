package com.practice.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MaxArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter array size:");
		int arr[] = new int[scan.nextInt()];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = scan.nextInt();
		}
		
		int max = arr[0];
		for(int i = 1; i < arr.length; i++) {
			if(max < arr[i]) {
				max = arr[i];
			}
		}
		
		
		System.out.println(Arrays.toString(arr));
		System.out.println("Maximum :" + max);
		
	}

}
