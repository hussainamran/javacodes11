package Homework2;

import java.util.Scanner;

public class HW {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println(" Write customer age");
		int age=scan.nextInt();
		
		if(age>18) {
			System.out.println(" Congratulation we can provide dl");
		}else {
			System.out.println(" We can not prvide dl");
		}
	}

}
