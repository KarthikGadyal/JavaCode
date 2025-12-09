package com.practice.Arrays;

public class ToggleLetters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "@AzUg$kksgbIUHhgn$";
		
		StringBuilder ansr = new StringBuilder();
		for(int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if(ch >= 'A' && ch <= 'Z') {
				 ansr.append(Character.toLowerCase(ch));
			}else if(ch >= 'a' && ch <= 'z') {
				ansr.append(Character.toUpperCase(ch));
			}
			else{
				ansr.append(ch);
			}
		}
		System.out.println(ansr);
	}

}
