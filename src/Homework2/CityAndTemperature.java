package Homework2;

import java.util.Scanner;

public class CityAndTemperature {
	public static void main(String[] args) {
		/*Create a Java program that will ask user to input city and temperature. 
		 * Your program should convert Fahrenheit into celsius and print 
		 * �The temperature is the city __ is __�
		 * 
		 */
		
		Scanner input=new Scanner(System.in);
		System.out.println(" Enter your city");
		String city=input.next();
		System.out.println(" What is the temperatuer of the city");
		int tem=input.nextInt();
		int tem1=(tem=32)*5/9;
		System.out.println(" The temperature is the city "+city+" is "+tem1);
		
	}

}
