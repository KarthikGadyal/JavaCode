package com.practice.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Find_max_min {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter array size:");
		int arr[] = new int[scan.nextInt()];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = scan.nextInt();
		}
		
		System.out.println(Arrays.toString(arr));
		
		Logic fm = new Logic();
		System.out.println(fm.findMax(arr));
		System.out.println(fm.findMin(arr));
				
	}

}

class Logic{
	public String findMax(int arr[]) {
		int max = arr[0];
		for(int i = 1; i < arr.length; i++) {
			if(max < arr[i]) {
				max = arr[i];
			}
		}
		return "MAXIMUM : " + max;
		
	}
	
	public String findMin(int arr[]) {
		int min = arr[0];
		for(int i = 1; i < arr.length; i++) {
			if(min > arr[i]) {
				min = arr[i];
			}
		}
		return "Minimum : " + min;
		
	}
}
