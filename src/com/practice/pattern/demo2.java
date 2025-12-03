package com.practice.pattern;

import java.util.Scanner;

public class demo2 {

<<<<<<< HEAD
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 1; i <= 5; i++) {
			for(int j = 1; j <= 5; j++) {
				if(i==1 || j== 1 || i == 5 || j == 5 || (i==3 && j== 3)){
				System.out.print("* ");
				}else {
					System.out.print("  ");
				}
			}
=======
			public static void main(String[] args) {
				// TODO Auto-generated method stub

>>>>>>> 747c640 (new package Arrays)
			
				for(int i = 1; i <= 5; i++) {
					for(int j = 1; j <= 5; j++) {
						if(i==1 || j== 1 || i == 5 || j == 5 || (i==3 && j== 3)){
						System.out.print("* ");
						}else {
							System.out.print("  ");
						}
					}
					
					System.out.println();
				}
				
			}

}
