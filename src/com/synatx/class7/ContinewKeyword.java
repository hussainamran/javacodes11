package com.synatx.class7;

public class ContinewKeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=1; i<=5; i++) {
			
			if(i==3) {
				
				// i want to print from 1 t0 10 except 3
				
				continue;
				//break;
			}
			System.out.println("hi "+i);
			System.out.println("hello "+i);
		}
		
		
		System.out.println("end of code");
	}

}
