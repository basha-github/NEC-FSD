package com.nec.session;

import java.util.Scanner;

public class RoundOfNo {
	
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("enter float value");
		float num = sc.nextFloat();
		
		int m = (int)(num * 1000);// 1.566666 * 1000--- 1566
		int ld = m % 10;// 1566 % 10---- 6
		m = m /10;// 1566 / 10---156
		if(ld > 5) m++;// 157---
		num = m/100.0f;// 157/100
		
		System.out.println("res---->"+num);
	
		
	}

}
