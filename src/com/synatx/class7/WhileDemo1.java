package com.synatx.class7;

public class WhileDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int time=5;
		
		// insted of executing with if statement number of time 
		// same line of code multiple times we use while Loop
		if(time>14) {
			//System.out.println("It is a day");
			//System.out.println("It is a day");
			//System.out.println("It is a day");
			while(time>14) {
				System.out.println("It is a day");
				time--;
			}
			
		}
		
		// if we know how may times we need to executed the code
		//then we use ForLoop hear i want to executed 5 times so i am using this code
		
		for(int t=1; t<10; t++) {
			System.out.println("I am happy");
			
		}
		
		
		
		
	}
	

}
