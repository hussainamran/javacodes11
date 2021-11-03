package com.synatx.class7;

public class ForLoopDemo {

	public static void main(String[] args) {
		/*
		 * What is the output?
		 */
		
		int sum=0;
		for(int i=1; i<=6; i++) {
			sum+=i;
			System.out.println(sum);
		}
		
		int result=0;
		for(int a=1; a<=4; a+=2) {
			result*=a;
			System.out.print(result+" ");
		}
	}

}
