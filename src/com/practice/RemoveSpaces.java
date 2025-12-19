package com.practice;

import java.util.Scanner;

public class RemoveSpaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the string : ");
		String  s = scan.nextLine();
		char[] ch = s.toCharArray();
		
		StringBuilder a = new StringBuilder();
		for(int i = 0; i < ch.length; i++) {
			if((ch[i] != ' ') && (ch[i] != '\t')) {
				a.append(ch[i]);
			}
		}
		
		System.out.println(a);
	}

}
