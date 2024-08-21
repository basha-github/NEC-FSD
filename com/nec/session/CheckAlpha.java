package com.nec.session;

import java.util.Scanner;

public class CheckAlpha {

	public static void main(String[] args) {
	
		
		// Write a program to check whether a character is alphabet or not
		Scanner data = new Scanner(System.in);
		System.out.println("Enter a char");
		String str = data.next();
		char ch = str.charAt(0);
		
		if( ( (ch >=65) && (ch <=90)) || 
				( (ch >=97) && (ch <=122))
			) {
			System.out.println("It is Alphabet");
		}
		else {
			System.out.println("Not");
		}
		
		
		//char ch =122;// 65+25--90
		// 97--a
		//z--97+25--122
		//System.out.println(ch);
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
