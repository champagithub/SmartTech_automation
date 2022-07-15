package com.methodBatch22;

public class Fibonachi {

	public  void fibo() {
		int a=0;
		int b=1;
		int c;
		int endpoint=40;
		for(int i=0; i<=endpoint;i++) {
			c=a+b;
			System.out.println("fibonachci Series:"+c);
			a=b;
			b=c;
			
		}
	}
}

