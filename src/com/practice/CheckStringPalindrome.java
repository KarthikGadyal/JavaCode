package com.practice;

public class CheckStringPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//Time complexity ok but space complexity for small is ok BUT  FOR BIGGER STRING u can use two pointer logic:- 
		String s  = "ma2wdam";
		
		StringBuilder rev = new StringBuilder(s).reverse();
		System.out.println(s.equalsIgnoreCase(rev.toString()) ? "Palindrome " : "Not Palindrome");
	}

}
