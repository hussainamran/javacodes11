package Project;

public class taskThree {

	public static void main(String[] args) {
		
		/*Create a 2D array of integers. 
		 * Develop a program which will calculate the sum of  even and odd numbers for that array.
		 * 
		 */
		
		int[][] num= {
				
				{1,32,4,6,98},
				
				{34,65,8,46},
		};
		int evensum=0;
		int oddsum=0;
		for(int[] n:num) {
			for(int n1:n) {
				if(n1%2==0) {
					evensum+=n1;
				}else {
					oddsum+=n1;
				}
			}
		}
		System.out.println("Sum of all even integer "+evensum);
		System.out.println("Sum of all odd integer "+oddsum);
	}

}
