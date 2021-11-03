package Homework2;

import java.util.Scanner;

public class SchoolAge {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		System.out.println(" kids five plus can join the kindergarden");
		int age=scan.nextInt();
		if(age<5) {
			System.out.println(" You are not eligiable school yet");
		}else {
			System.out.println(" You qualified");
		}
		
		}else {
			System.out.println(" You are two young");
		}

		
	}

}
