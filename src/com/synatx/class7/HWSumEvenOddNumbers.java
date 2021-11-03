package com.synatx.class7;

public class HWSumEvenOddNumbers {

	public static void main(String[] args) {
/*Calculate sum of all even and all odd numbers 
 * from range 1 to 100
 */
	
	// add sum of all even number
		int sum=0;
	for(int i=2; i<=100; i=i+2) {
		if(i % 2==0) {
			sum=sum+i;
			System.out.print(sum+" ");	
		}
		
	}
	
	System.out.println("***************");
	
	// add sum of all odd number
	int sum1=0;
	for(int a=1; a<=100; a=a-1) {
		if(a % 2==1) {
		sum1=sum1-a;
		System.out.print(sum1+ " ");
		}
	}
	}

}
