package com.syntax.class12;

public class HW4Emain {
	
	 String createEmail(String username, String lastName, String emailtype) {
		 
		String userinfo=username+lastName+"@"+emailtype+".com";
		return userinfo;
		
	}
	 
	 public static void main(String []arg) {
		 HW4Emain inp=new  HW4Emain ();
		 System.out.println(inp.createEmail("Ron", "Shake", "gmail"));
	 }

}
