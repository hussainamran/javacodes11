package com.syntax.class14;

public class stringDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="This is batch 11 is good batch 11 is good";
		System.out.println(str.replace("good", "Great"));//replac good to great
		str="This is batch 11 is good batch 11 is good";
		System.out.println(str.replace("good", "great").replace("batch", "not batch"));
		System.out.println(str.replaceFirst("good", "great"));
	}

}
