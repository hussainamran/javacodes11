package com.synatx.class7;

public class breakDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean summer=true;
		int temp=75;
		
		while(summer) {
			System.out.println(" i love summer");
			if(temp>=100) {
				System.out.println("i dont love summer");
				break;
			}
			temp+=5;
		}

	}

}