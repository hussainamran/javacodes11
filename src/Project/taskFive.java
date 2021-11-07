package Project;

public class taskFive {

	public static void main(String[] args) {
		
		/*Create an array of countries.
		 *  While retrieving all values from an array print capital for each country. 
		 *  (use 2 different loops).
		 * 
		 */
		
		String[] countries= {"Macedonia","Serbia","Bulgaria","Turkey"};
		
		for(String country:countries) {
			if(country.equals("Macedonia")) {
				System.out.println("skopje");
			}else if(country.equals("serbia")) {
				System.out.println("Belgrade");
			}else if(country.equals("Bulgaria")) {
				System.out.println("");
			}
		}
		

	}

}
