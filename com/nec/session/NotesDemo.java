package com.nec.session;

import java.util.Scanner;

public class NotesDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Write a program to count total number of notes in given amount
		
		
		boolean fifty = false;
		
		
		
		Scanner rupees = new Scanner(System.in);
		
		System.out.println("Fifty Note avilable or not");
		fifty = rupees.nextBoolean();
		
		
		System.out.println("Enter change");
		int data = rupees.nextInt();
		
		int fiftyNotes=0,twentyNotes=0,tenNotes=0,fiveNotes=0,twoNotes=0,oneNotes=0;
		
		if( (fifty == true) && (data > 50)) {
			fiftyNotes = data / 50;
			data = data - fiftyNotes * 50;
		}
		if(data >20) {
			twentyNotes = data / 20;
			data = data - twentyNotes * 20;
		}
		if(data >10) {
			tenNotes = data / 10;
			data = data - tenNotes * 10;
		}
		if(data >5) {
			fiveNotes = data / 5;
			data = data - fiveNotes * 5;
		}
		if(data >2) {
			twoNotes = data / 2;
			data = data - twoNotes * 2;
		}
		if(data >0) {
			oneNotes = data;
		}
		
		if(fiftyNotes > 0)
		System.out.println("50 Notes---->"+fiftyNotes);
		if(twentyNotes > 0)
		System.out.println("20 Notes---->"+twentyNotes);
		if(tenNotes > 0)
		System.out.println("10 Notes---->"+tenNotes);
		if(fiveNotes > 0)
		System.out.println("5 Notes---->"+fiveNotes);
		if(twoNotes > 0)
		System.out.println("2 Notes---->"+twoNotes);
		if(oneNotes > 0)
		System.out.println("1 Notes---->"+oneNotes);
		

	}

}
