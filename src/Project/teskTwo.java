package Project;

public class teskTwo {

	public static void main(String[] args) {
	
		/*Create a 2D array or integer type where you will store odd and even numbers. 
		 * Develop a program which will identify/print the even numbers only.
		 * 
		 */
		
		int [][] num= {
				
				{2,4,45,56,34},
				
				{23,3,67,77},
				
		};
		
		for(int [] a:num) {
			
			for(int b:a) {
				
				if(b%2==0) {
					System.out.println(b);
				}
				
			}
			
		}
	}

}
