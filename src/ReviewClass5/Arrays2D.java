package ReviewClass5;

public class Arrays2D {

	public static void main(String[] args) {
		
		int[][] numbers=new int[2][3];
		
		numbers[0][0]=10;
		numbers[0][1]=20;
		numbers[0][2]=30;
		numbers[1][0]=40;
		numbers[1][1]=50;
		numbers[1][2]=60;
		
		
		for(int i=0; i<numbers.length;i++) {
			
			for(int j=0; j<numbers[i].length; j++) {
				
				//prints all the row and cloum
				//System.out.println(i+ " "+j);
				
				System.out.println();
				// print all the elemets
				System.out.println(numbers[i][j]);
			}
		}
	}

}
