package com.syntax.class12;

public class HW5Prime {
	
	void primenumber(int num) {
		
		if(num>1) {
			for(int i=2; i<num; i++) {
				
				if(num% i==0) {
					System.out.println(num+" It is not a prime number");
					break;
				}else {
					System.out.println(num+" It is a prime number");
					break;
				}
			}
		}else {
		System.out.println(num+" It is not a prime number");
		
	}
	}
	

	public static void main (String []arg) {
		
		HW5Prime inp=new HW5Prime();
		inp.primenumber(10);
	}

}
