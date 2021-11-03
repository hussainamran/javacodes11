package Homework2;

import java.util.Scanner;

public class NumberIsLargest {
public static void main(String[] args) {
	
	/*Create a Java program to capture 2 numbers from a user 
	 * and define which number is the largest.
	 * 
	 */
	
	Scanner scan=new Scanner(System.in);
	System.out.println(" Enter first number:");
	int number1=scan.nextInt();
	System.out.println(" Enter second number:");
	int number2=scan.nextInt();
	if(number1>number2){
		System.out.println(" Number1 is the largest");
	}if(number2>number1) {
		System.out.println("Number2 is the largest");
	}else {
		System.out.println(" Both are same");
	}
	
}
}

