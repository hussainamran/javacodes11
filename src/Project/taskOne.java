package Project;

public class taskOne {

	public static void main(String[] args) {
		
		/*	
		/* Create a 2D array of integer values. Print the sum of all numbers.
		 * 
		 */
		
		int sum=0;
		int[][] numbers= {
				{2,12,34,45,56},
				
				{34,41, 56},
			
				
				
			
		};
		// one way getting sum
		sum=0;
		for(int num[]:numbers) {
			for(int num1:num) {
				System.out.println(sum=sum+num1);
			}
			
		} 
		System.out.println("The integers of all numbers is "+sum);
		System.out.println();
		
		// two different way getting result
		
		for(int i=0; i<numbers.length; i++) {
			 for (int j=0; j<numbers[i].length; j++) {
				 sum+=numbers[i][j];
				 
			 }
		}
		System.out.println(sum);
	}

}
