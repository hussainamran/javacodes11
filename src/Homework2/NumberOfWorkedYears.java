package Homework2;

import java.util.Scanner;

public class NumberOfWorkedYears {
	public static void main(String[] args) {
		/* Write a program to ask user to enter numbers of worked years and annual salary. 
		 * If user worked for more or equals to 5 years than user is eligible for the bonus, 
		 * otherwise he is not. Once user is eligible and salary is larger than 50000 than bonus = 5000, otherwise bonus=3000.
		 * 
		 */
		System.out.println(" How many years did you work");
		Scanner scan=new Scanner(System.in);
		int years=scan.nextInt();
		if(years>=5) {
			System.out.println(" You are eligible for bouns. How much do earn year?");
		double salary=scan.nextDouble();
		if(salary>=5000) {
			System.out.println(" You are eligible for 5000 bonus");
		}else {
			System.out.println(" Your are eligible for 3000 bonus");
		}
		}else {
			System.out.println(" You are a not eligible for anything");
		}
		}
	}


