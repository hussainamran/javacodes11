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
		
		// one way to get result
		
		for(int [] a:num) {
			
			for(int b:a) {
				
				if(b%2==0) {
					System.out.println(b);
				}
				
			}
			
		}
		 // two way get result
		System.out.println();
		for(int i=0; i<num.length; i++) {
			 for(int j=0; j<num[i].length; j++) {
				 if(num[i][j]% 2== 0) {
					 System.out.println(num[i][j]);
				 }
				 
			 }
		}
	}

}
