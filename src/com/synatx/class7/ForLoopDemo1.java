package com.synatx.class7;

public class ForLoopDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*
	 * What is the output?
	 */
		
		int num=8;
		for(int i=1; i<8; i++) {
			System.out.println(num+ " x "+i+ " = "+num*i);
			
		}
		System.out.println("***********************");
		
		// To get odd number for(int i=1, i<20; i+=2){
		// To get even number for(int i=1; i<=100; i+=2){
		for(int i=0; i<=20; i+=2) {
			System.out.print(i+ " ");
		}
	}

}
