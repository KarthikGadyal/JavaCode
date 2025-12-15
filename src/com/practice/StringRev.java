package com.practice;

public class StringRev {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "welcome to program";
		
//		char ch[] = s.toCharArray();
//		for(int i = ch.length -1; i >= 0; i--) {
//			System.out.print(ch[i]);
//		}
		
		StringBuilder s1 = new StringBuilder(s).reverse();
		System.out.println(s1);

	}

}
