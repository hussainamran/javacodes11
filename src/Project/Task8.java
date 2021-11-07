package Project;

public class Task8 {

	public static void main(String[] args) {
		
		/*write a java program to print the first 10 numbers of Fibonacci series.
		 * 0 1 1 2 3 5 8 13 21 34....
		 */
		
		int perviousNumber=0;
		int currentNumbers=1;
		int sum=0;
		int numbersToPrints=10;
		
		System.out.println(perviousNumber+" ");
		System.out.println(currentNumbers+" ");
		
		for(int i=0; i<numbersToPrints-2; i++) {
			sum=currentNumbers+perviousNumber;
		}

	}

}
