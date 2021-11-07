package com.syntax.class12;

public class HW3LAnguage {

	void greeting(String country) {
		
		
		String result=null;
		switch(country) {
		case "Mexcio":
			result="Ola";
			break;
		case "USA":
			result="Hello";
			break;
		case "France":
			result="Salut";
			break;
			default:
				result="Unknown";
			}
		System.out.println(result);
	
	}
	
	public static void main(String []arg) {
		
		 HW3LAnguage count=new  HW3LAnguage();
		 
		 count.greeting("Mexcio");
	}

}
