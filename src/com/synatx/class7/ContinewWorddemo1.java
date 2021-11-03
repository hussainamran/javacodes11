package com.synatx.class7;

public class ContinewWorddemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for (int i=1; i<=10; i++) {
			
			// i want to print number 1-10 and skip 3 and 7 and 9
			
			if(i==3 || i==7 || i==9) {
				break;
				//continue;
			}
			System.out.println(i+ " ");
		}
		System.out.println("end of code");

	}

}
