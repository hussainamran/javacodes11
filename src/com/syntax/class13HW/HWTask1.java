package com.syntax.class13HW;

import java.util.Scanner;

public class HWTask1 {

	public static void main(String[] args) {
		
		/*write a program that reads two people names and if they expecting boy or girl?
		 * Base on the input suggests a name for a baby.
		 * Example Output:
Mom?s first name? Mary
Dad?s first name? Daniel
Boy or Girl? boy
Suggested baby name: DANRY
Example Output:
Mom?s first name? Mary
Dad?s first name? Daniel
Boy or Girl? girl
Suggested baby name: MAIEL
		 */
		
		
		String fatherName="Daniel";
		String motherName="Mary";
		String isBoyGirl="boy";
		
		if(isBoyGirl.equalsIgnoreCase("girl")) {
		String firstPart=fatherName.substring(0, fatherName.length()/2);
		String secondPart=motherName.substring(motherName.length()/2);
		System.out.println(firstPart+secondPart);
	}else {
		String firstPart=motherName.substring(0, fatherName.length()/2);
		String secondPart=fatherName.substring( motherName.length()/2);
		System.out.println(firstPart+secondPart);

	}
		
		
		}
		
		
		
		
	}


