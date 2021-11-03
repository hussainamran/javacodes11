package com.sysntex.class3;

public class TypeCasting {

	public static void main(String[] args) {
		
		
		// type casting explicit and implecit
		
		// moving somethisng small box to bigger box
		
		double number=10; //defing // Explicite 
		int number2;// defing
		number2=(int)number;// assigning
		System.out.println(number2);
		
		
		int number1=10;
		double number3=number1;// Implicite small box to the big box
		//System.out.println(number2);
		
		int number4=1256;
		byte number5=(byte)number4;
		System.out.println(number5);// You can't not do that
		
		short number7=12;
		byte number8=(byte)number7; // we need to tall box the number can fit
		//byte number8=(byte)number7;
		
		int number9=(10000);
		float f=number9;
		long l=(long)f;
		
		
		double number10=10.5;
		int number11=(int)number10; // if we do thus it will disaster
		System.out.println(number11);
	}

}
