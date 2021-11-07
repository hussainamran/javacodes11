package com.syntax.class12;

public class HWMethodTakes2Parameter {


	public static int findlargest(int num1, int num2) {
		
		if(num1>num2) {
			return num1;
		}else {
			return num2;
		}
	}
		
		public static void main (String []arg) {
			
			HWMethodTakes2Parameter numbers=new HWMethodTakes2Parameter();
			System.out.println(numbers.findlargest(12, 34));
			System.out.println(numbers.findlargest(5, 45));
		}
		
	
		
	}
	
	
	
	


