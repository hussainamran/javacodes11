package com.sysntex.class3;

public class RelationalOperator {

	public static void main(String[] args) {
		
		// check if both variables contain same thing
		
		int number1=20;
		int number2=20;
		boolean result=number1==number2;// longer way both provide same result
		System.out.println(number1==number2);// shorter way
		System.out.println(number1=number2);
		System.out.println(result);
		
		System.out.println("*********************************");
		
		System.out.println(number1>number2);
		System.out.println(number1<number2);
		
		System.out.println("*********************************");
		
		System.out.println(number1>=number2);
		System.out.println(number1<=number2);
		
		System.out.println("*********************************");
		
		System.out.println(number1!=number2);
		
		
	}

}
