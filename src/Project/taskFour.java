package Project;

import java.util.Scanner;

public class taskFour {

	public static void main(String[] args) {
		

		/*Create an array on double values using scanner and calculate 
		 * the sum of all stored elements in that array.
		 * 
		 */
		Scanner in=new Scanner (System.in);
		
		System.out.println("How many elements did you like to store?");
		int size=in.nextInt();
		double sum=0;
		double[]num= new double[size];
		
		//One way to results
		for(int i=0; i<size; i++) {
			System.out.println("Add your elements");
			num[i]=in.nextInt();
			sum+=num[i];
		}
		System.out.println("Sum of all elements this array is "+sum);
		
		
		}
	}


