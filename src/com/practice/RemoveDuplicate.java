package com.practice;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class RemoveDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the array size : ");
		
		int arr[] = new int[scan.nextInt()];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = scan.nextInt();
		}

		System.out.println("Original : " + Arrays.toString(arr));
		
		//Remove dupicates:-
		
		Set<Integer> hs = new HashSet<>();
		for(int num : arr) {
			hs.add(num);
		}
		System.out.println("Aftr Duplicates : " + hs);
	}

}
