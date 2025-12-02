package com.practice;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("enter a string:");
		String input = scan.nextLine();
		System.out.println(input);System.out.println("--------------------");
		String rev = "";
		for(int i = input.length()-1; i >= 0; i--) {
			rev += input.charAt(i); 
		}
		System.out.println(rev);

	}

}
