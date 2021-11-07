package com.syntax.class12;

public class HWMethodTake2ParameterEvenorOdd {
	
	 void number(int num1) {
	

		if( num1% 2==0) {
			System.out.println(num1+ " Num 1 is the even number");	
		}else if(num1% 2!=0) {
			System.out.println(num1+ "Num 1 is the odd number");
		}
	}
	
	public static void main(String []arg) {
		
		 HWMethodTake2ParameterEvenorOdd number=new  HWMethodTake2ParameterEvenorOdd();
		 number.number(3);
		 System.out.println(number+ " ");
	}
		
		
		
		
	}


