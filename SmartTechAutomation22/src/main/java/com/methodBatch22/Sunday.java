package com.methodBatch22;

public class Sunday {
	

	public static void sundaytry1() {
		int a=0;
		int b=1;
		int c;
		int endpoint=10;
		for(int i=0; i<=endpoint; i++) {
			c=a+b;
			System.out.println("fibonacci series="+c);
			a=b;
			b=c;
		}
		
	}
	public static void sundaytry() {
		int a=0;
		int b=1;
		int c;
		int endpoint=25;
		
		for(int i=0; i<=endpoint;i++) {
			c=a+b;
		
		System.out.println("fibonacci Series:"+c);
		a=b;
		b=c;
		}
	}

}
