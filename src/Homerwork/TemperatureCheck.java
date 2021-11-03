package Homerwork;

import java.util.Scanner;

public class TemperatureCheck {

	public static void main(String[] args) {
/*Create a Java program that will ask 
 * user to input city and temperature. 
 * Your program should convert Fahrenheit 
 * into celsius and print “The temperature is 
 * the city __ is __”
 */
 Scanner scan=new Scanner(System.in);
 System.out.println(" Enter your city");
	String city=scan.next();
	System.out.println(" Enter the Temperature");
	int temp=scan.nextInt();
	int temp1=(temp-32)*5/9;
	System.out.println(" The temperature is the city "+city+" is "+temp1);
	}

}
