package ReviewClass5;

public class ArrayDemo {

	public static void main(String[] args) {
		/*
		 * if we have to store single values we use variables
		 */

		
		String name="Amran";
		String name1="Hussain";
		
		// if we have to store multiple values of same type we should use arrays
		
		String [] names;
		names=new String[5];
		names[0]="Farhad";
		names[1]="Yogita";
		names[2]="Henok";
		names[3]="Priyasri";
		names[4]="Ecaterina";	
				
		System.out.println(names[0]);
		System.out.println(names[1]);
		
		System.out.println(names.length);
		System.out.println();
		
		// one way to get all the elements
		
		for(int i=0; i<names.length; i++) {
			System.out.println(names[i]);
		}
		System.out.println();
		// second way to get all the elements
		for(String nam:names) {
			System.out.println(nam);
		}
		
		// third way to get all the elements
		System.out.println();
		int i=0;
		while(i<names.length) {
			System.out.println(names[i]);
			i++;
		}
		
	}

}
