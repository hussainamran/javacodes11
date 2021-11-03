package com.synatx.class7;

public class NestedLoops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * nested loop= loop inside another loop
		 */
		
		for(int i=1; i<=3; i++) {// outer for loop also outer control inner loop
			
			System.out.println("I am an outer loop");
			
			for(int j=1; j<=4; j++) {// inner loop
				System.out.println("I am inner loop");
				
			}
		}
		System.out.println("End of the code");
	}

}
