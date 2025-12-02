package com.practice.pattern;

import java.util.Scanner;

public class demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
	
		
		for(int i = 1; i <= 10; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print(" ");
			}
			for(int k = 1; k <= i; k++) {
			System.out.print("* ");
			}
			System.out.println();
		}
		
		
	}

}
