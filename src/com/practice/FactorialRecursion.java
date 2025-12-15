package com.practice;

public class FactorialRecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//ITERATIVE METHOD : 
//		int a = 5;
//		int fact = 1;
//		for(int i = 1; i <= a;i++) {
//			fact = i * fact;
//		}
//		System.out.println(fact);
		
		//iTERATIVE METHOD:-
		
		int a = 5;
		System.out.println(fact(a));
	}
	
	
	public static int fact(int n) {
		if(n==1 || n==0) {
			return 1;
		}
		return n * fact(n-1);
	}
	

}
